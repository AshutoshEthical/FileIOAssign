package FileIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Lab8_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String str="";
		FileWriter fw = new FileWriter("test1.txt");
		fw.write("HELLO");
		fw.flush();
		//fw.close();
		FileReader fr = new FileReader("test1.txt");
		int a = fr.read();
		while(a!=-1)
		{
			str=str+(char)a;
			System.out.println((char)a);
			a=fr.read();
		}
		StringBuilder s = new StringBuilder(str);
		s.reverse();
		String str1= s.toString();
		fw.write(str1);
		fw.close();
	}

}
