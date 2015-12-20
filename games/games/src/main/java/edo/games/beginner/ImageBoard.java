package edo.games.beginner;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImageBoard extends JPanel {
	private static final long serialVersionUID = 7903034622919735746L;
	
	private Image bardejov;

    public ImageBoard() {

        initBoard();
    }
    
    private void initBoard() {
        
        loadImage();
        
        int w = bardejov.getWidth(this);
        int h =  bardejov.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon(this.getClass().getResource("bardejov.png"));
        bardejov = ii.getImage();        
    }

    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(bardejov, 0, 0, null);
    }
}
