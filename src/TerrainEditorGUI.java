import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class TerrainEditorGUI {
	
	private Image heighButtonImage, worldCoordinatesButtonImage, countButtonImage;
	private boolean showHeight, showWorldCoordinates, showCount;
	
	
	public TerrainEditorGUI() {
		this.showHeight = false;
		this.showWorldCoordinates = false;
		this.showCount = false;
	}
	
	
	
	public void init(GameContainer gameContainer, StateBasedGame game)
			throws SlickException {
		this.heighButtonImage = new Image("art/terraineditor/H.png");
		this.worldCoordinatesButtonImage = new Image("art/terraineditor/W.png");
		this.countButtonImage = new Image("art/terraineditor/C.png");
	}
	
	public void render(GameContainer gameContainer, StateBasedGame game, Graphics g, Camera c)
			throws SlickException {
		
		
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, int arg2)
			throws SlickException {
		Input input = gameContainer.getInput();
		if(input.isMousePressed(Input.MOUSE_LEFT_BUTTON )) {
			int mouseX = input.getMouseX();
			int mouseY = input.getMouseY();
		}
	}
	
}
