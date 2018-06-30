import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyFish {
	private final String IMG_NAME = "blueFishRight.png";
	public BufferedImage img;
	private Boolean isLeftImgShown;
	
	public MyFish() {
		try {
			this.img = ImageIO.read(new File(IMG_NAME));
			this.isLeftImgShown = false;
		} catch(IOException e){
			println("Can not read the Fish image. ");
		}
	}
	
	
	
	private void println(String str) {
		System.out.println(str);
	}
	
}

