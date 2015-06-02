import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.StateBasedGame;

/** Represents a tile of the game world terrain
*
* @author Justin Harris
* @version 0.01
*/
public class Tile {
	
	
	public static enum TileType {
	    Flat, SlopeDownSouthEast, SlopeDownSouthWest, SlopeDownNorthWest,
	    SlopeDownNorthEast, SteepSlopeEast, SteepSlopeWest, SteepSlopeFace,
	    HalfSlopeWest, HalfSlopeEast, HalfSlopeNorth, HalfSlopeAdjoin, AdjoiningTriangleFace,
	    TopHalfSlopeWest, TopHalfSlopeEast, TopHalfSlopeNorth, TopHalfSlopeSouth
	}
	
	private static SpriteSheet tileSheet;
	
	/** Tile's vertical order in the game map */
	private int height;
	private Tile[] neighbors;
	private TileType type;
	private int x, y;

	public Tile(int gridX, int gridY) {
		this.x = (int) (gridX * 64);
        this.y = (int) (gridY * 32);
	}

	public static SpriteSheet getTileSheet() {
		if(getTileSheet() == null) {
			try {
				setTileSheet(new SpriteSheet(new Image("art/terrain/Tiles.png"), 64, 64));
			} catch (SlickException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return tileSheet;
	}

	public static void setTileSheet(SpriteSheet tileSheet) {
		Tile.tileSheet = tileSheet;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}
	
	
	public void init(GameContainer gameContainer, StateBasedGame game)
			throws SlickException {
		

	}
	
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g, Camera c)
			throws SlickException {
		switch(this.type) {
			case Flat:
				
				break;
			case AdjoiningTriangleFace:
				break;
			case HalfSlopeAdjoin:
				break;
			case HalfSlopeEast:
				break;
			case HalfSlopeNorth:
				break;
			case HalfSlopeWest:
				break;
			case SlopeDownNorthEast:
				break;
			case SlopeDownNorthWest:
				break;
			case SlopeDownSouthEast:
				break;
			case SlopeDownSouthWest:
				break;
			case SteepSlopeEast:
				break;
			case SteepSlopeFace:
				break;
			case SteepSlopeWest:
				break;
			case TopHalfSlopeEast:
				break;
			case TopHalfSlopeNorth:
				break;
			case TopHalfSlopeSouth:
				break;
			case TopHalfSlopeWest:
				break;
			default:
				break;
		}
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, int arg2)
			throws SlickException {
		
		
	}
	
	
}
