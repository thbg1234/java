package a20230922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("저장 파일명을 입력하세요 : ");
		String sfile = stdIn.next();
		
		String source = "비어 있어야 비로소 가득해지는 사랑 \\n\" + \"영원히 사랑한다는 것은 \\n\" + \"평온한 마음으로 아침을 맞는다는 것입니다. \\n";
		
		FileWriter fw = new FileWriter(sfile);
		
		fw.write(source);  
		
		fw.close();
		
		System.out.println("파일이 생성되었습니다.");
	}

}
