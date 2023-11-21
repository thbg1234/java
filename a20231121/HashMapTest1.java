package a20231121;

import java.nio.file.spi.FileSystemProvider;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		HashMap<String,String> dict = new HashMap<String,String>();
		dict.put("사과", "apple");
		dict.put("딸기", "strawberry");
		dict.put("포도", "grape");
		
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			System.out.println("알고 십은 과일 이름은 입력하세요(0은 종료)");
			String kor = stdIn.next();
			if(kor.equals("0")) {
				System.out.println("사전 종료");
				break;
			}
			String eng = dict.get(kor);
			if(eng==null) {
				System.out.println(kor+"는 없는 단어 입니다.");
			}
			else {
				System.out.println(eng);
			}
		}

	}

}
