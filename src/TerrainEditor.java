import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;


public class TerrainEditor extends BasicGameState {
	
	private StateBasedGame game;
	private Map map;
	private Camera c;
	
	@Override
	public void init(GameContainer arg0, StateBasedGame arg1)
			throws SlickException {
		// TODO Auto-generated method stub
		this.game = arg1;
		this.map = new TerrainGenerator(5, 15).getMap();
		this.c = new Camera();
	}

	@Override
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g)
			throws SlickException {
		// TODO Auto-generated method stub
		map.render(gameContainer, game, g, c);
		
	}

	@Override
	public void update(GameContainer gameContainer, StateBasedGame arg1, int arg2)
			throws SlickException {
		// TODO Auto-generated method stub
		c.update(gameContainer, arg1, arg2);
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 3;
	}

}
