package edo.games.beginner;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class DonutExample extends JFrame {
	private static final long serialVersionUID = -7327847415018656634L;

	public DonutExample() {

        initUI();
    }

    private void initUI() {

        add(new DonutBoard());

        setSize(300, 320);
        //pack();

        setTitle("Donut");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }    
    
    public static void main(String[] args) {
        
        EventQueue.invokeLater(new Runnable() {
            //@Override
            public void run() {
                DonutExample ex = new DonutExample();
                ex.setVisible(true);
            }
        });
    }
}
