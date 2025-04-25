package fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializedEmployee{
	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\User\\Desktop\\FileHandling\\test\\serialize.txt";
		File file =  new File(path);
		file.createNewFile();
		
		Employee emp = new Employee(01,"Trisha",10000.00);
		
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emp);
		oos.flush();
		
		oos.close();
		fos.close();
		
	}
}
