package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class WritingData {
	public static void main(String[] args) throws IOException{
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\test\\demo.txt";
		File file = new File(path);
		
		//FileOutputStream fos = new FileOutputStream(file,true);
		FileWriter fw = new FileWriter(file,true);
		BufferedWriter bw = new BufferedWriter(fw);
		//String message = "Welcome Home";.
		String message1 = " Bye bye";
//		byte[] arr = message.getBytes();
//		fos.write(arr);
		
		for(int i=0;i<message1.length();i++) {
			bw.write(message1.charAt(i));
		}
		fw.flush();
		//fw.close();
	}
	
}
