package a20231006;

import javax.swing.*;
import java.awt.*;

class JPanel2 extends JFrame{
	public JPanel2() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(5,1));
		ct.add(new JRadioButton("java"));
		ct.add(new JRadioButton("C"));
		ct.add(new JRadioButton("VisualBasic"));
		ct.add(new JRadioButton("JSP"));
		ct.add(new JRadioButton("PHP"));
		JPanel jp2 = new JPanel();
		jp2.setLayout(new GridLayout(5,1));
		ct.add(new Button("java"));
		ct.add(new Button("C"));
		ct.add(new Button("VisualBasic"));
		ct.add(new Button("JSP"));
		ct.add(new Button("PHP"));
		setTitle("JPanel test1");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
}

public class JPanelTest2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

		new JPanel2();
	}

}
