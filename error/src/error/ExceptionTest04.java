
package error;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest04 {

	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("a.txt");
		int i;
		while((i = file.read()) != -1) {
			System.out.print((char)i);
		}
		file.close();
	}
}
