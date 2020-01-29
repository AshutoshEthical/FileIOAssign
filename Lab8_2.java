package FileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Lab8_2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("Numbers.txt");
		Scanner sc = new Scanner(fr);
		/* int a= sc.nextInt(); */
		String a = sc.nextLine();
		String parts[] = a.split(",");
		int numParts[] = new int[parts.length];
		for(int i=0;i<parts.length;i++) {
			numParts[i] = Integer.parseInt(parts[i]);
			if(numParts[i]%2==0)
				System.out.print(numParts[i]+" ");
		}
		
	}

}
