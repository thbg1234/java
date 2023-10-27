package a20231027;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;
	JRadioButton[] jr = new JRadioButton[5];
	String[] hobby = {"걷기","등산","골프","스킨스쿠버","페러글라이딩"};
	

	public JRadioButton1(){
		jl = new JLabel();
		JLabel jl1 = new JLabel("당신의 취미는?");
		JLabel jl2 = new JLabel("당신의 나이는?");
		JCheckBox[] jc = new JCheckBox[5];
		String[] age = {"20","30","40","50","60"};
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		ButtonGroup gb = new ButtonGroup();
		
		for (int i = 0 ; i < 5 ; i++) {
			jr[i] = new JRadioButton(hobby[i]);
			jc[i] = new JCheckBox(age[i]);
			hobbypanel.add(jr[i]);
			agepanel.add(jc[i]);
			jc[i].addActionListener(this);
			gb.add(jc[i]);
		}
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		setTitle("JRadioButtonTest1");
		setSize(350,300);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미:";
		for(int i = 0 ; i < 5 ;i++) {
			if(jr[i].isSelected()==true) {
				s+=hobby[i]+"";
			}
		}
		s=s+"당신의 나이:";
		jl.setText(s+ae.getActionCommand());
	}
	
}
public class JRadioButtonTest1 {
	public static void main(String[] args) {
		new JRadioButton1();
	}
}
