package a20231114;

import java.util.*;


public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] name = {"kim","lee","park","jung","oh"};
		
		ArrayList<String> Iname = new ArrayList<String>(Arrays.asList(name));
		System.out.println("조기값"+Iname);
		
		Iname.add("ha");
		System.out.println("ha 추가 후 리스트 값"+Iname);
		
		Iname.set(0, "값");
		
		Iname.add(3,"최");
		
		System.out.println("김 벤김,최 추가 후 리스트 값"+Iname);
		
		Collections.shuffle(Iname);
		System.out.println("shuffle() 메소드 적용 리스트 값:"+Iname);
		
		Collections.sort(Iname);
		System.out.println("sort() 메소드 적용 리스트 값"+Iname);
		
		System.out.println("5번째 값"+Iname.get(4));
		
		Collections.fill(Iname,"김");
		System.out.println("모든 요소틀\"김\"으로 설정된 값:"+Iname);
		

	}

}
