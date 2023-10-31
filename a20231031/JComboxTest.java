package a20231031;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;
class JcomBox extends JFrame implements ItemListener{
	JLabel fruitLabel;
	public void JComBox() {
		JComboBox<String> fruitCombo = new JComboBox<String>();
		fruitLabel = new JLabel();
		
		String fruitlist[]= {"persimmom","banana","pear","apple","cherry","grape"};
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		
		for(int i=0;i<fruitlist.length;i++) {
			fruitCombo.addItem(fruitlist[i]);
		}
		ct.add(fruitCombo);
		ct.add(fruitLabel);
		fruitCombo.addItemListener(this);
		
		setTitle("JComboBox Test1");
		setSize(200,200);
		setVisible(true);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem();
		fruitLabel.setIcon(new ImageIcon(fruit+".jpg"));
		
	}
}



public class JComboxTest {

	public static void main(String[] args) {
		new JComboBox();

	}

}
