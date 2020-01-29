package FileIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Lab8_3Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream("test1.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Lab8_3Employee emp = new Lab8_3Employee("Ashu",1001);
		oos.writeObject(emp);
		oos.close();
	}

}
