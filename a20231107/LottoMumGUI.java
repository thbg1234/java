package a20231107;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

class Lotto extends JFrame implements ActionListener{
	private JLabel lotto_num = new JLabel();
	public Lotto() {
		JButton lotto = new JButton("로또 번호 자동생성 ");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(lotto);
		ct.add(lotto_num);
		lotto.addActionListener(this);
		setTitle("Lotto Number Generate");
		setSize(300,250);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		Random r = new Random();
		int[] lnum = new int[6];
		int tmp;
		int i = 0;
		a:while(i<6) {
			tmp = r.nextInt(45)+1;
			for(int j = 0; j<= i ; j++) {
				if(tmp == lnum[j])
					continue a;
			}
			lnum[i] = tmp;
			i++;
		}
		lotto_num.setText("이번 주 로또 당첨번호:"+Arrays.toString(lnum));
	}
}


public class LottoMumGUI {
	public static void main(String[] args) {
		new Lotto();
	}
}
