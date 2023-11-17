package a20231117;

import java.util.*;

public class LinkedListTest1 {
	public static void main(String[] args) {
		ArrayList<Integer>alist = new ArrayList<Integer>();
		LinkedList<Integer>llist = new LinkedList<Integer>();
		
		int i;
		long start,stop;
		start = System.currentTimeMillis();
		for(i = 0;i<1000;i++) {
			alist.add(500,i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - 순자적 삽입 시간:"+(stop - start));
		
		
		start = System.currentTimeMillis();
		for(i = 0;i<1000;i++) {
			llist.add(500,i);
		}
		stop = System.currentTimeMillis();
		System.out.println("ArrayList - 순자적 삽입 시간:"+(stop - start));
	}
}
