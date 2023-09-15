package error;
import java.util.Scanner;

public class ExceptionTest01 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력  : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 :");
		int num2 = stdIn.nextInt();
		
		System.out.println(num1 / num2);
	}
}
