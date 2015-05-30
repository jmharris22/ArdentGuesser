
public class Map {
	private Tile[][] grid;
	private int width;
	private int height;
	public Map(int width, int height) {
		this.width = width;
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
}
