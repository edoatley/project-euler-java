package edo.games.beginner.sprites;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.Timer;

public class CraftBoard extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = -5586220427383081724L;
	
	private Timer timer;
    private Craft craft;
    private final int DELAY = 10;

    public CraftBoard() {

        initBoard();
    }
    
    private void initBoard() {
        
        addKeyListener(new TAdapter());
        setFocusable(true);
        setBackground(Color.BLACK);

        craft = new Craft();

        timer = new Timer(DELAY, this);
        timer.start();        
    }


    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        doDrawing(g);

        Toolkit.getDefaultToolkit().sync();
    }

    private void doDrawing(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(craft.getImage(), craft.getX(), craft.getY(), this);   
        
        List<Missile> missiles = craft.getMissiles();
        for (Missile m : missiles) {
            g2d.drawImage(m.getImage(), m.getX(), m.getY(), this);
		}
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        
    	updateMissiles();
        updateCraft();

        repaint();
    }

    private void updateCraft() {
    	craft.move();
	}

	private void updateMissiles() {
        List<Missile> missiles = craft.getMissiles();
        for (int i = 0; i < missiles.size(); i++) {
        	Missile m = missiles.get(i);
        	if (m.isVisible()) {
                m.move();
            } 
        	else {
        		missiles.remove(i);
            }
		}
	}

	private class TAdapter extends KeyAdapter {

        @Override
        public void keyReleased(KeyEvent e) {
            craft.keyReleased(e);
        }

        @Override
        public void keyPressed(KeyEvent e) {
            craft.keyPressed(e);
        }
    }
}
