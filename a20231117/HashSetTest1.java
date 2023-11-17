package a20231117;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest1 {

	public static void main(String[] args) {
		HashSet<Integer>odd = new HashSet<Integer>();
		HashSet<Integer>even = new HashSet<Integer>();
		
		for (int i=1;i<=10;i+=2) {
			odd.add(i);
			even.add(i+1);
			
		}
		
		System.out.println("odd 집합의 내용:"+odd);
		System.out.println("event 집합의 내용:"+even);
		
		boolean setChanged = odd.add(5);
		System.out.println("odd 의 5추가 성곰?" +setChanged);
		
		setChanged = even.add(12);
		System.out.println("odd 의 12추가 성곰?" +setChanged);
		
		System.out.println("odd 집합의 내용:"+odd);
		System.out.println("even 집합의 내용:"+even);
		
		System.out.println("odd에서 작은 값"+Collections.min(odd));
		System.out.println("odd에서 작은 값"+Collections.max(even));
		
		Iterator<Integer>it = even.iterator();
		int sum = 0;
		while(it.hasNext()) {
			sum = sum+it.next();
		}
		System.out.println("even 집합의 합은"+sum);
	}
}
