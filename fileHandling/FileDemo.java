package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\test\\demo";
		String rename =  "C:\\Users\\User\\Desktop\\FileHandling\\test";
		File file = new File(path);
		File renamefile = new File(rename);
		//file.mkdir();
//		file.renameTo(renamefile);
//		System.out.println(file.getAbsolutePath());
//		System.out.println(file.getParentFile());
//		System.out.println(renamefile.getName());
//		
//		renamefile.delete();
//		renamefile.createNewFile();
//		
		String[] arr = renamefile.list();
		for(String s : arr) {
			System.out.println(s);
		}
		System.out.println(renamefile.canRead());
		System.out.println(renamefile.canWrite());
	}
}
