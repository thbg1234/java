package a20231117;

import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<Integer> num1 = new TreeSet<Integer>();
		TreeSet<Integer> num2 = new TreeSet<Integer>();
		
		int i ;
		for (i=4;i>=0 ;i--) {
			num1.add(i);
			num2.add(i*2);
		}
		System.out.println("num1 집ㅎ합의 내용:"+num1);
		System.out.println("num2 집ㅎ합의 내용:"+num2);
		
		TreeSet<Integer>union = new TreeSet<Integer>(num1);
		TreeSet<Integer>intersection = new TreeSet<Integer>(num1);
		TreeSet<Integer>difference = new TreeSet<Integer>(num1);
		
		union.addAll(num2);
		intersection.retainAll(num2);
		difference.removeAll(num2);
		
		System.out.println("합집합"+union);
		System.out.println("교집합"+intersection);
		System.out.println("차집합"+difference);
		
		TreeSet<Integer> num3 = new TreeSet<Integer>();
		TreeSet<Integer> num4 = new TreeSet<Integer>();
		
		for (i=4;i>=0 ;i--) {
			num3.add(i);
			num4.add(i*2);
		}
		System.out.println("num3 집ㅎ합의 내용:"+num3);
		System.out.println("num4 집ㅎ합의 내용:"+num4);
		
		TreeSet<Integer>union1 = new TreeSet<Integer>(num3);
		TreeSet<Integer>intersection1 = new TreeSet<Integer>(num3);
		TreeSet<Integer>difference1 = new TreeSet<Integer>(num3);
		
		union.addAll(num4);
		intersection.retainAll(num4);
		difference.removeAll(num4);
		
		System.out.println("합집합"+union1);
		System.out.println("교집합"+intersection1);
		System.out.println("차집합"+difference1);
	}
}
