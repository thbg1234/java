package a20231010;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Event2 extends JFrame{
	JLabel jl;
	JButton jb1,jb2;
	public Event2() {
		Container ct= getContentPane();
		ct.setLayout(new FlowLayout());
		jb1= new JButton("爱你");
		jb2= new JButton("幸福");
		jl = new JLabel("请点击按钮");
		jb1.addActionListener(new EventProcess());
		jb2.addActionListener(new EventProcess());
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		setTitle("Event Test2");
		setSize(250,150);
		setVisible(true);
		
	}
	private class EventProcess implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			jl.setText(e.getActionCommand());
		}
	}
}


public class EventTest2 {
    public static void main(String[] args) {
	new Event2();
}
}
