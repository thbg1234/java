package a20231013;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class JTFJA1 extends JFrame implements ActionListener{
	private JTextField input;
	private JTextArea output;
	private JLabel j1 = new JLabel("택스트를 입력하세요");
	
	public JTFJA1() {
		input = new JTextField(20);
		output  = new  JTextArea(10,20);
		output.setEditable(false);    // 设置文本域不可编辑
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(input);
		p1.add(output);
		
		ct.add(p1);
		ct.add(j1);
		
		input.addActionListener(this);
		
		setTitle("JTextField and JTextArea");
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	public  void actionPerformed(ActionEvent e) {
		if(output.getLineCount()<=output.getRows()){
			output.append(e.getActionCommand()+"\n");
			input.setText("");
		}
		else{
			j1.setText("입력이 종료되었습니다");
			input.setEditable(false);
		}
	}
}

public class JTFJTATest1 {

	public static void main(String[] args) {
		new JTFJA1();

	}

}
