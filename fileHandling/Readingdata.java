package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingdata {
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\test\\demo.txt";
		File file = new File(path);
		//FileInputStream fis = new FileInputStream(file);
		FileReader fr = new FileReader(file);
		int x;
		while((x=fr.read())!=-1) {
			System.out.print((char)x);
		}
	}
}
