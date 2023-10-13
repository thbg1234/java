package a20231013;

import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		jtf = new JTextField(10);
		ImageIcon apple = new ImageIcon("C:\\Project\\image\\apple.jpg");
		ImageIcon banana = new ImageIcon("C:\\Project\\image\\banana.jpg");
		ImageIcon persimmom = new ImageIcon("C:\\Project\\image\\persimmom.jpg");
		ImageIcon pear = new ImageIcon("C:\\Project\\image\\pear.jpg");
		ImageIcon grape = new ImageIcon("C:\\Project\\image\\grape.jpg");
		JButton jb1= new JButton("苹果",apple);
		JButton jb2= new JButton("香蕉",banana);
		JButton jb3= new JButton("柿子",persimmom);
		JButton jb4= new JButton("梨",pear);
		JButton jb5= new JButton("葡萄",grape);
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,2));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jb3);
		ct.add(jb4);
		ct.add(jb5);
		ct.add(jtf);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);
		jb5.addActionListener(this);
		setTitle("JButton Test2");
		setSize(250,300);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}

public class JButtontest2 {
	public static void main(String[] args) {
		new JButton2();
	}

}
