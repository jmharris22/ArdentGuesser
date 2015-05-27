import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class SplashScreenStartup extends BasicGameState {
//
	private StateBasedGame game; 
	private int timer;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		this.game = arg1;
		timer = 0;
	}

	@Override
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		g.drawString("DSG", 250, 240);
	}

	@Override
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		timer+=1;
		if(timer >= 90) {
			arg1.enterState(1);
		};
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
