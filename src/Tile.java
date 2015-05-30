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
	/** Tile's vertical order in the game map */
	private int height;
	private Tile[] neighbors;
	private TileType type;


	public Tile() {
		
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
