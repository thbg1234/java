package a20230926;

import java.io.*;
import java.util.Scanner;

public class PersonInfo {

	String name;
	String city;
	int age;
	
	public PersonInfo(String name,String city,int age) {
		this.name=name;
		this.city=city;
		this.age=age;
		
	}
}
public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	System.out.println();
	String fileName =stdin.next();
	
	String s1= "고객 정보";
	
	PersonInfo p1=new PersonInfo("김지연","부산",25);
	PersonInfo p2=new PersonInfo("name","서울",29);
	ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
	
	oos.writeObject(s1);
	oos.writeObject(p1);
	oos.writeObject(p2);
	oos.close();
	System.out.println(fileName+"파일명으로 ");
	
}
}
