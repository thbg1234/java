package a20231031;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class RadioPanel extends JPanel implements ActionListener{
	ButtonGroup gb = new ButtonGroup();
	JLabel jl1 = new JLabel("당신의 성별은?");
	JLabel jl2 = new JLabel("");
	
	JRadioButton[] jr = new JRadioButton[5];
	String[] gender = {"남자","여자"};
	
	public RadioPanel() {
		for(int i=0;i<2;i++) {
			jr[i] = new JRadioButton(gender[i]);
			add(jr[i]);
			gb.add(jr[i]);
			jr[i].addActionListener(this);
		}
		add(jl1);
		add(jl2);
	}
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		jl2.setText(s);
	}
	public ComboxPane1() {
		JComboBox<String> jcb = new JComboBox<String>();
		jcb.addItem("A형");
		jcb.addItem("B형");
		jcb.addItem("C형");
		jcb.addItem("D형");
		
		add(jl1);
		add(jl2);
		add(jcb);
		
		jcb.addItemListener(this);
	}
}

class ComboxPanel extends JPanel ItemListener{
	JLabel jl1 = new JLabel("당신의 혈액형은?");
	JLabel jl2 = new JLabel("");
	

}

class JTabPane extends JFrame{
	public JTabPane() {
	    Container ct = getContentPane();
	    JTabbedPane jtp = new JTabbedPane();
	    
	    RadioPanel rp = new RadioPanel();
	    ComboxPanel cp = new ComboxPanel();
	    jtp.addTab("성별",rp);
	    jtp.addTab("혈액형은",rp);
	    
	    ct.add(jtp);
	    
	    setTitle("JTabbelPaneTest1");
	    setSize(400,150);
	    setVisible(true);
	}
}


public class JTablePaneTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new RadioPanel();
	}

}
