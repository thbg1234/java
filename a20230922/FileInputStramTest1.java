
package a20230922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStramTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print(" ");
		
		FileInputStream fis = new FileInputStream(sfile);
		
		int i;
		while((i = fis.read()) != -1) {  
			System.out.print((char)i);
		}
		fis.close();   
		
		System.out.println(sfile + "");
	}
}
