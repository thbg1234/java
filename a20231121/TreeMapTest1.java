package a20231121;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TreeMap<Integer,String> score = new TreeMap<Integer,String>();
		
		score.put(88, "국어");
		score.put(100, "영어");
		score.put(76, "수학");
		score.put(80, "과학");
		score.put(69, "컴퓨터");
		
		Map.Entry<Integer,String> high_low = score.firstEntry();
		System.out.println("기잠 낮은 성적은"+high_low.getKey()+"점이미");
		
		high_low = score.lastEntry();
		System.out.println();
		
		Map<Integer,String> cd = score.headMap(80);
		Map<Integer,String> ab = score.tailMap(80);
		
		System.out.println("학점A,B에 헤담 과목과 점수:" + ab);
		System.out.println("학점C,D에 헤담 과목과 점수:" + ab);
		
		System.out.println("점수 순으로 출력(낮은 점수부터):"+score);
		System.out.println("점수 순으로 출력(높은 점수부터):"+score.descendingMap());

	}

}
