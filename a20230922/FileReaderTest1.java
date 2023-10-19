package a20230922;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest1 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		try {
			System.out.print("읽을 파일명을 입력하세요 :: ");
			String sfile = stdIn.next();  
			
			FileReader fr = new FileReader(sfile);
			int i;
			while((i = fr.read()) != -1) {  
				System.out.print((char)i);
			}
			fr.close();  
			
		} catch (FileNotFoundException e) {  
			System.out.println("파일이 없습니다.");
		} catch (IOException e) {
			System.out.println("읽어 들일 파일이 없습니다..");
		}
	}
}
