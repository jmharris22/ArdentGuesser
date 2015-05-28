import java.util.logging.Level;
import java.util.logging.Logger;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;
/** Contains the main method for the game. 
*
* @author Justin Harris
* @version 0.01
*/
public class SimpleSlickGame extends StateBasedGame {




    // Application Properties
	/** Width of the game screen */
    public static final int WIDTH   = 640;
    /** Height of the game screen */
    public static final int HEIGHT  = 480;
    /** Desired frames per second lock */
    public static final int FPS     = 60;
    public static final double VERSION = 0.01;

    // Class Constructor
    public SimpleSlickGame(String appName) {
        super(appName);
    }

    // Initialize your game states (calls init method of each gamestate, and set's the state ID)
    public void initStatesList(GameContainer gc) throws SlickException {
        // The first state added will be the one that is loaded first, when the application is launched
    	this.addState(new SplashScreenStartup());
        this.addState(new Menu());
        this.addState(new Game());
    }

    // Main Method
    public static void main(String[] args) {
        try {
            AppGameContainer app = new AppGameContainer(new SimpleSlickGame("My Game v" + VERSION));
            app.setDisplayMode(WIDTH, HEIGHT, false);
            app.setTargetFrameRate(FPS);
            app.setShowFPS(true);
            app.start();
        } catch(SlickException e) {
            e.printStackTrace();
        }
    }
}