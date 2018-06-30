import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MyFish {
	private final String IMG_NAME = "blueFishRight.png";
	private BufferedImage img;
	private Boolean isLeftImgShown;
	
	public MyFish() {
		try {
			img = ImageIO.read(new File(IMG_NAME));
			isLeftImgShown = false;
		} catch(IOException e){
			println("Can not read the Fish image. ");
		}
	}
	
	
	
	private void println(String str) {
		System.out.println(str);
	}
	
}

