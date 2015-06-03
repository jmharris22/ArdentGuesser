import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class Map {
	private Tile[][] tiles;
	private int width;
	private int height;
	public Map(int width, int height, Tile[][] tiles) {
		this.width = width;
		this.height = height;
		this.tiles = tiles;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}

	public void init(GameContainer gameContainer, StateBasedGame game)
			throws SlickException {
		

	}
	
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g, Camera c)
			throws SlickException {
		for(int zHeight = 0; zHeight < 2; zHeight++) {
			
			for (int i = 0; i < width; i++)
	        {
	            for (int j = 0; j < height; j++)
	            {
	                if (tiles[j][i] != null && tiles[j][i].getHeight() == zHeight)
	                {
	                    tiles[j][i].render(gameContainer, game, g, c, j, i);
	                }
	            }
	        }
		}
		
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, int arg2)
			throws SlickException {
		
		
	}
}