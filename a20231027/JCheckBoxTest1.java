package a20231027;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class jc extends JFrame implements ItemListener{

	JCheckBox jc1,jc2,jc3,jc4;
	JTextField jtf;
	
	public jc(){
		jtf = new JTextField(10);
		JCheckBox jc1 = new JCheckBox("JSP");
		JCheckBox jc2 = new JCheckBox("PHP");
		JCheckBox jc3 = new JCheckBox("ASP");
		JCheckBox jc4 = new JCheckBox("Servlet");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jc1);
		ct.add(jc2);
		ct.add(jc3);
		ct.add(jc4);
		ct.add(jtf);
		jc1.addItemListener(this);
		jc2.addItemListener(this);
		jc3.addItemListener(this);
		jc4.addItemListener(this);
		setTitle("");
		setSize(250,100);
		setVisible(true);

	}

		public void itemStateChanged(ItemEvent ie) {
			jtf.setText(((JCheckBox)ie.getItem()).getText());
		}
}


public class JCheckBoxTest1 {
	public static void main(String[] args) {
		new jc();
	}
}
