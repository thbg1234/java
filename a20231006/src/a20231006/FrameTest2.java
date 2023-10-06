package a20231006;



import java.awt.*;
import javax.swing.*;


class FirstFrame2 extends JFrame{
	public FirstFrame2() {
		JFrame jf = new JFrame("2nd GUI program");
		Container ct = jf.getContentPane();
		JButton jb = new JButton("테스트버튼");
		ct.add(jb);
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}

public class FrameTest2 {
	
	public static void main(String[] args) {
		new FirstFrame2();
	}
}
