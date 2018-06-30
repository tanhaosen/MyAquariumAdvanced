import java.awt.Color;
import java.util.Random;

public class MyFood {
	public int x;
	public int y;
	public int diameter;
	public Color color;
	
	public MyFood(int screenWidth, int screenHeight) {
		choseRandomLocation(screenWidth, screenHeight);
	}
	
	private void choseRandomLocation(int screenW, int screenH) {
		Random rand = new Random();
		this.x = rand.nextInt(screenW);
		this.y = rand.nextInt(screenH);
	}
	
	public int[] getLocation() {
		int[] location = new int[2];
		location[0] = this.x;
		location[1] = this.y;
		return location;
	}
}
