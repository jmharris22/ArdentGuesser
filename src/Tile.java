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
	private static final int TILE_HEIGHT = 32;
	private static final int TILE_WIDTH = 64;
	private int counter;
	
	
	public Tile(int gridX, int gridY, int counter) {
		this.x = gridX;
        this.y = gridY;
        this.counter = counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public static SpriteSheet getTileSheet() {
		if(tileSheet == null) {
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
	
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g, Camera c, int colX, int colY)
			throws SlickException {
		float screenX;
		float screenY;
		switch(this.type) {
			case Flat:
				
				screenX = (this.x - this.y) * TILE_WIDTH/2;
				screenY = (this.x + this.y) * TILE_HEIGHT/2;
				screenY = (float) (c.getWorldPosY() - screenY);
				screenX = (float) (c.getWorldPosX() - screenX);
				if(this.height == 1) {
					screenY = screenY - TILE_HEIGHT/2;
				}
				getTileSheet().getSubImage(0, 0).draw(screenX,screenY);
				
				//String heightString = "" + this.height;
				//g.drawString(heightString, screenX + TILE_WIDTH/2 - 6 , screenY + TILE_HEIGHT/2 - 12);
				
				//String coords = this.x + "," + this.y;
				//g.drawString(coords, screenX + TILE_WIDTH/2 - 6 , screenY + TILE_HEIGHT/2 - 12);
				
				g.drawString(("" + this.counter), screenX + TILE_WIDTH/2 - 6 , screenY + TILE_HEIGHT/2 - 12);
				
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
				screenX = (this.x - this.y) * TILE_WIDTH/2;
				screenY = (this.x + this.y) * TILE_HEIGHT/2;
				screenY = (float) (c.getWorldPosY() - screenY);
				screenX = (float) (c.getWorldPosX() - screenX);
				getTileSheet().getSubImage(0, 1).draw(screenX,screenY);
				break;
			case SlopeDownNorthWest:
				break;
			case SlopeDownSouthEast:
				break;
			case SlopeDownSouthWest:
				
				screenX = (this.x - this.y) * TILE_WIDTH/2;
				screenY = (this.x + this.y) * TILE_HEIGHT/2 + 16;
				screenY = (float) (c.getWorldPosY() - screenY);
				screenX = (float) (c.getWorldPosX() - screenX);
				getTileSheet().getSubImage(2, 0).draw(screenX,screenY);
				
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
