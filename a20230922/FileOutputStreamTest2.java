package a20230922;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class FileOutputStreamTest2 {
	public static void main(String[] args) throws IOException {
		OutputStream fos = new FileOutputStream("c:/aaa.txt");
		
		String str = "자바 프로그래밍 문자 스트림과 바이트 스트림 ";
		
		byte[] bt = str.getBytes(); 
		
		fos.write(bt);   	
		System.out.println("파일 생성하였습니다.");
		fos.close();  	
	}
}