package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImg {
	public static void main(String[] args) throws Exception {
		String destpath = "C:\\Users\\User\\Desktop\\FileHandling\\test\\image.jpg";
		File destfile = new File(destpath);
		destfile.createNewFile();
		
		String sourcePath = "C:\\Dell\\tiger.jpg";
		File sourcefile = new File(sourcePath);
		FileInputStream fis = new FileInputStream(sourcefile);
		byte[] arr = new byte[(int)sourcefile.length()]; //getting the size of the source file and creating a byte array of that size to store image data in the form of byte
		fis.read(arr);  //reads the data from sourceFile and stores into byte array
		
		FileOutputStream fos = new FileOutputStream(destfile);
		fos.write(arr);
		
		fos.close();
		fis.close();
	}
}
