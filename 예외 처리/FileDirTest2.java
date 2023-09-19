package exceptiontest7;
import java.io.File;

public class FileDirTest2 {
	public static void main(String[] args) {
		String dir = "C:/Windows1";
		File f1 = new File(dir);  
		
		try {    
			System.out.println("검색 디렉토리 : " + dir);
			System.out.println("===================");
			
	
			String s[] = f1.list();
			
			for(int i = 0; i < s.length; i++) {
			
				File f = new File(dir + "/" + s[i]);
				if(f.isDirectory()) {
					System.out.println(s[i] + " : 디렉토리");
				}
				else {
					System.out.println(s[i] + " : 파일");
				}
			}
		}
		catch (Exception e) {   
			System.out.println("지정한 " + dir + "는 디렉토리가 아닙니다.");
			System.out.println(e);
		}
	}
}
