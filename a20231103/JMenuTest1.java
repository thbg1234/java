package a20231103;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



class JMenu1 extends JFrame implements ActionListener {
	JTextField jtf;
	
	public void JMeny1() {
	Container ct = getContentPane();
	
	ct.setLayout(new BorderLayout());
	
	JMenuBar jmb = new JMenuBar();
	
	JMenu menu1 = new JMenu("파일");
	JMenu menu2 = new JMenu("편집");
	
	JMenuItem jmi = new JMenuItem("새파일");
	jmi.addActionListener(this);
	menu1.add(jmi);
	
	jmi = new JMenuItem("저장하기");
	jmi.addActionListener(this);
	menu1.add(jmi);
	
	jmi = new JMenuItem("열기");
	jmi.addActionListener(this);
	menu2.add(jmi);
	
	jmi = new JMenuItem("절라내기");
	jmi.addActionListener(this);
	menu2.add(jmi);
	
	jmi = new JMenuItem("복사");
	jmi.addActionListener(this);
	menu1.add(jmi);
	
	JCheckBoxMenuItem jcmi = new JCheckBoxMenuItem("열기");
	jcmi.addActionListener(this);
	menu2.add(jcmi);
	
	JRadioButtonMenuItem jrbmi = new JRadioButtonMenuItem("수정가능상테");
	jcmi.addActionListener(this);
	menu2.add(jcmi);
	
	jmb.add(menu1);
	jmb.add(menu2);
	
	setJMenuBar(jmb);
	
	jtf = new JTextField();
	ct.add(jtf,BorderLayout.SOUTH);
	
	setTitle("JMenuTest1");
	setSize(300,200);
	setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		jtf.setText(e.getActionCommand());
	}
}


public class JMenuTest1 {
	public static void main(String[] args) {
		new JMenu1();
	}
}
