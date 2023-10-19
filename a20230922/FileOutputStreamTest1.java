package a20230922;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		FileOutputStream fos = new FileOutputStream(sfile);
		
		int i;
		for(i = 1; i <= 20; i++) {
			fos.write(i); 
		}
		fos.close();  
		System.out.println(sfile + " 파일명으로 바이트 파일을 생성하였습니다.");
	}

}
