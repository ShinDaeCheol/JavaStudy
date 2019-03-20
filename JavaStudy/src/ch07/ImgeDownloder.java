package ch07;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;

public class ImgeDownloder {
	public static void main(String[] args) {
		// 쉬프트 +컨트롤 + 앞파벳 o =>한방에 임폴트
		for (int i = 0; i < 10; i++) {

		}

		File outputFile = new File("c:/dev/test.jgp");

		URL url = null;
		BufferedImage bi = null;

		try {
			url = new URL("https://gimg.gilbut.co.kr/book/BN002385/rn_view_BN002385.jpg");
			bi = ImageIO.read(url);
			ImageIO.write(bi, "png", outputFile);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
