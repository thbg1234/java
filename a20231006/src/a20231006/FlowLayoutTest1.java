package a20231006;

import java.awt.*;
import javax.swing.*;

class FlowLayout1 extends JFrame{
	public FlowLayout1() {
		Container ct = getContentPane();
		FlowLayout f1 = new FlowLayout(FlowLayout.LEFT,10,15);
		ct.setLayout(f1);
		for(int i=1; i <=15;i++)
			ct.add(new JButton("button"+i));
		setTitle("FlowLayout Test1");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class FlowLayoutTest1 {
	public static void main (String[] args) {
		new FlowLayout1();
	}

}
