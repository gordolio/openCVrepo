package org.javaopencvbook;

import org.javaopencvbook.utils.ImageProcessor;
import org.javaopencvbook.utils.ImageViewer;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.highgui.Highgui;

public class App 
{
	static{ System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

	public static void main(String[] args) throws Exception {
		String filePath = "src/main/resources/images/clouds.png";
		Mat newImage = Highgui.imread(filePath, Highgui.CV_LOAD_IMAGE_GRAYSCALE);

		if(newImage.dataAddr()==0){
			System.out.println("Couldn't open file " + filePath);
		}else{

			GUI gui = new GUI("Kernel Example", newImage);
			gui.init();
		}
		return;
	}
}