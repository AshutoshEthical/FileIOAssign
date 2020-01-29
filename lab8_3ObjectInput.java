package FileIO;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class lab8_3ObjectInput {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("test1.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lab8_3Employee empNew = (Lab8_3Employee) ois.readObject();
		System.out.println(empNew.getEmpId());
		System.out.println(empNew.getEmpName());
	}

}
