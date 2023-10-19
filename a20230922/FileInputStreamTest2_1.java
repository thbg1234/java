package a20230922;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2_1 {

	public static void main(String[] args) {
		try {
			File file = new File("C/aaa.txt");
			
			FileInputStream fr = new FileInputStream(file);
			
			int i;
			while((i = fr.read()) != -1) {  
				System.out.print((char)i);
			}
			fr.close();		
			System.out.println("");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
