/** Represents a tile of the game world terrain
*
* @author Justin Harris
* @version 0.01
*/
public class Tile {
	
	/** Tile's vertical order in the game map */
	private int height;
	private Tile[] neighbors;
	
	public Tile() {
		
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
