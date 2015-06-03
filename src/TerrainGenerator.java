import java.util.Random;
import Math.SimplexNoise;


public class TerrainGenerator {
	private int width;
	private int height;
	private int[][] grid;
	private Tile[][] tiles;
	
	public TerrainGenerator(int width, int height){
		this.width = width;
		this.height = height;
		this.grid = new int[height][width];
		this.tiles = new Tile[height][width];
		this.generateTerrain();
	}
	
	
	private void generateTerrain(){
		
		SimplexNoise simplexNoise=new SimplexNoise(100,0.1,5000);

		Random rnd=new Random(5000);

	    double xStart=0;
	    double XEnd=rnd.nextDouble() * 10000;
	    double yStart=0;
	    double yEnd=rnd.nextDouble() * 10000;

	    int xResolution=200;
	    int yResolution=200;

	    double[][] result=new double[xResolution][yResolution];
		
		for(int i=0;i<height;i++){
	        for(int j=0;j<width;j++){
	            int x=(int)(xStart+i*((XEnd-xStart)/xResolution));
	            int y=(int)(yStart+j*((yEnd-yStart)/yResolution));
	            result[i][j]=0.5*(1+simplexNoise.getNoise(x,y));
	           double printResult = 100.0*result[i][j];
	           int integerResultClamp = (int) Math.abs(printResult);
	           integerResultClamp = integerResultClamp%2;
	           this.grid[i][j] = integerResultClamp;
	        }
	    }
		
		//Create tile map and set the tiles' heights.
		int counter = 0;
		for(int i=0;i<height;i++){
	        for(int j=0;j<width;j++){
	        	this.tiles[i][j] = new Tile(i, j, counter);
	        	this.tiles[i][j].setHeight(this.grid[i][j]);
	        	this.tiles[i][j].setType(Tile.TileType.Flat);
	        	counter++;
	        }
		}
		
		boolean correctionsMade = true;
		boolean leftToRightFixes = false;
		boolean topToBottomFixes = false;
		while(correctionsMade){
			leftToRightFixes = fixTransitionsLeftToRight(grid);
			topToBottomFixes = fixTransitionsTopToBottom(grid);
			
			if(!leftToRightFixes && !topToBottomFixes) {
				correctionsMade = false;
			}
		}
	}
	
	
	private boolean fixTransitionsLeftToRight(int[][] grid)
	{
		boolean correctionsMade = false;
		int counter = 0;
		for(int i=0;i<height;i++){
	        for(int j=0;j<width;j++){
	        		tiles[i][j].setCounter(counter);
	        		counter++;
	        	}
	        }
		
		return correctionsMade;
	}
	private boolean fixTransitionsTopToBottom(int[][] grid)
	{
		boolean correctionsMade = false;
		return correctionsMade;
	}
	
	public Map getMap(){
		return new Map(width, height, tiles);
	}
	
}
