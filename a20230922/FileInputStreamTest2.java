package a20230922;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:/aaa.txt");
		
		FileReader fr = new FileReader(file);
		
		int i;
		while((i = fr.read()) != -1) {  
			System.out.print((char)i);
		}
		fr.close();		
	}
}
