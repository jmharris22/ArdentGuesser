
public class Camera {
	private double worldPosX, worldPosY;
	
	public Camera() {
		this.worldPosX = 0;
		this.worldPosY = 0;
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
}
