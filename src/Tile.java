import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

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


	public Tile() {
		
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
	
}
