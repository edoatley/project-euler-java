package edo.games.beginner;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class ImageExample extends JFrame {
	private static final long serialVersionUID = -4696184768665195048L;

	public ImageExample() {

        initUI();
    }

    private void initUI() {

        add(new ImageBoard());

        pack();

        setTitle("Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                ImageExample ex = new ImageExample();
                ex.setVisible(true);
            }
        });
    }
}
