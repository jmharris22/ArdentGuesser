import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class Camera {
	private double worldPosX, worldPosY;
	
	public Camera() {
		this.worldPosX = 280;
		this.worldPosY = 320;
	}

	public double getWorldPosX() {
		return worldPosX;
	}

	public void setWorldPosX(double worldPosX) {
		this.worldPosX = worldPosX;
	}

	public double getWorldPosY() {
		return worldPosY;
	}

	public void setWorldPosY(double worldPosY) {
		this.worldPosY = worldPosY;
	}
	
	public void update(GameContainer gameContainer, StateBasedGame game, int arg2)
			throws SlickException {
		Input input = gameContainer.getInput();
		
		int movePixels = 4;
		if(input.isKeyDown(Input.KEY_LCONTROL)){
			movePixels = 1;
		}
		if(input.isKeyDown(Input.KEY_LSHIFT)){
			movePixels = 8;
		}
		if(input.isKeyDown(Input.KEY_W)) {
			worldPosY = worldPosY + movePixels;
		};
		if(input.isKeyDown(Input.KEY_S)) {
			worldPosY = worldPosY - movePixels;
		};
		
		if(input.isKeyDown(Input.KEY_D)) {
			worldPosX = worldPosX - movePixels;
		};
		if(input.isKeyDown(Input.KEY_A)) {
			worldPosX = worldPosX + movePixels;
		};
		
	}
}
