package a20231010;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Event1 extends JFrame implements ActionListener{
	JLabel jl;
	public Event1() {
		Container ct=getContentPane();
		ct.setLayout(new FlowLayout());
		JButton jb = new JButton("按钮");
		jl= new JLabel("请点击按钮");
		jb.addActionListener(this);
		ct.add(jb);
		ct.add(jl);
		setTitle("Event Test1");
		setSize(200,100);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		jl.setText("做得好");
	}
}


public class EventTest1 {
    public static void main(String[] args) {
	new Event1();
}
}
