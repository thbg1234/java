package a20231010;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

class JLabel1 extends JFrame implements ActionListener{
	private JLabel result = new JLabel();
	public ImageIcon i1,i2;
	public JLabel1() {
		i1 = new ImageIcon("C:\\Project\\image\\apple.jpg");
		i2 = new ImageIcon("C:\\Project\\image\\pear.jpg");
		JButton apple=new JButton("苹果");
		JButton pear=new JButton("梨");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		apple.addActionListener(this);
		pear.addActionListener(this);
		setTitle("JLabel Test1");
		setSize(300,250);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()=="苹果") {
			result.setText("好吃的苹果");
			result.setIcon(i1);
		}else {
			result.setText("好吃的梨");
			result.setIcon(i2);
		}
	}
}


public class JLabelTest1 {
	public static void main(String[] args) {
		new JLabel1();
	}

}
