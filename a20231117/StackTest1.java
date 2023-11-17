package a20231117;

import java.util.Scanner;
import java.util.Stack;

public class StackTest1 {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		
		Scanner stdIn = new Scanner(System.in);
		for(int i = 0 ; i < 4; i++) {
			System.out.println("과일 이름을 입력");
			String fruits = stdIn.next();
			stack.push(fruits);
		}
		
		System.out.println("찾고 싶은 과일 이름을 입력");
		String f_name = stdIn.next();
		int fruit = stack.search(f_name);
		if(fruit != -1) {
			System.out.println("스택에시"+f_name+"의 위지는"+fruit);
		}else {
			System.out.println("스택에시"+f_name+"가 없습니다");
		}
		
		System.out.println("과일 리스트<스택> 삭제");
		while(stack.empty()) {
			String obj = stack.pop();
			System.out.println("<스택>에서 pop:"+obj);
		}
	}

}
