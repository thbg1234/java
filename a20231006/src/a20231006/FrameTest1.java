package a20231006;

import java.awt.*;
import javax.swing.*;


class FirstFrame1{
	public FirstFrame1() {
		JFrame jf = new JFrame("first GUI program");
		
		Container ct = jf.getContentPane();
		
		JButton jb = new JButton("테스트 버튼");
		
		ct.add(jb);
		
		jf.setSize(400,300);
		
		jf.setVisible(true);
	}
}
public class FrameTest1 {
public static void main(String[] args) {
	new FirstFrame1();
	}
}
