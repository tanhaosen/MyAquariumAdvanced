import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class MyCrab {
	private final String IMG_NAME = "crab.png";
	public BufferedImage img;
	
	public int x;
	public int y;

	public MyCrab(int screenWidth, int screenHeight) {
		try {
			this.img = ImageIO.read(new File(IMG_NAME));
			choseRandomLocation(screenWidth, screenHeight);
		}
		catch(IOException e) {
			println("Can't load the crab image. ");
		}
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
	
	private void println(String str) {
		System.out.println(str);
	}
}
