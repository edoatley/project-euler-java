package edo.games.beginner;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class SwingTimerExample extends JFrame {

	private static final long serialVersionUID = 5824434298446673888L;

	public SwingTimerExample() {
        
        initUI();
    }
    
    private void initUI() {

        add(new StarBoard());
        
        setResizable(false);
        pack();
        
        setTitle("Star");
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {                
                JFrame ex = new SwingTimerExample();
                ex.setVisible(true);                
            }
        });
    }
}
