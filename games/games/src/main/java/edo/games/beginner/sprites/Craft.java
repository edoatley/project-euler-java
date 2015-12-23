package edo.games.beginner.sprites;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class Craft extends Sprite {

	private int dx;
	private int dy;
	private List<Missile> missiles;
	
    public Craft() {
        super(40, 60);
        initCraft();
    }
    
    private void initCraft() {
    	loadImage(this.getClass().getResource("craft.png"));
    	getImageDimensions();
    	missiles = new ArrayList<Missile>();
    }
    
    public void move() {
        x += dx;
        y += dy;
    }
    
    public List<Missile> getMissiles() {
        return missiles;
    }
    
    public void fire() {
    	int missileStartX = x + width;        // fire from front of craft
    	int missileStartY = y + (height / 2); // fire halfway up craft	 
		Missile newMissile = new Missile(missileStartX, missileStartY);
    	missiles.add(newMissile);
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }

        if (key == KeyEvent.VK_UP) {
            dy = -1;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
        
        if (key == KeyEvent.VK_SPACE) {
        	fire();
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_UP) {
            dy = 0;
        }

        if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }
}
