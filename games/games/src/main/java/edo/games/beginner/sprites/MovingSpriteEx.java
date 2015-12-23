package edo.games.beginner.sprites;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class MovingSpriteEx extends JFrame {

	private static final long serialVersionUID = 3463042833553364258L;

	public MovingSpriteEx() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new CraftBoard());
        
        setSize(400, 300);
        setResizable(false);
        
        setTitle("Moving sprite");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                
                MovingSpriteEx ex = new MovingSpriteEx();
                ex.setVisible(true);
            }
        });
    }
}
