package a20231013;

import java.awt.*;

import javax.swing.*;

class JButton1 extends JFrame{
	public JButton1() {
		ImageIcon korea = new ImageIcon("C:\\Project\\image\\korea.gif");
		ImageIcon usa = new ImageIcon("C:\\Project\\image\\usa.gif");
		ImageIcon germany = new ImageIcon("‪C:\\Project\\image\\germany.gif");
		
		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa);
		nat.setRolloverIcon(germany);
		
		Container ct = getContentPane();
		
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		
		setTitle("JButton Test");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}


public class JButtonTest1 {
    public static void main(String[] args) {
		new JButton1();
	}
}
