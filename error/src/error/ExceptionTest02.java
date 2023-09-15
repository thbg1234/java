package error;

import java.util.Scanner;

public class ExceptionTest02 {

	public static void main(String[] args) {
	
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("첫 번째 수 입력  : ");
		int num1 = stdIn.nextInt();
		System.out.print("두 번째 수 입력 : ");
		int num2 = stdIn.nextInt();
		
		try {
			System.out.println(num1 / num2);
		} catch (Exception e) {
		
			System.out.println("0으로 나눌 수 없습니다..");
			System.out.println("해당 예외  : " + e);
		
		}
	}
}
