package 과제1;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
class JLabel1 extends JFrame {
    private JLabel result = new JLabel();
    public ImageIcon i1, i2;
    
    public JLabel1() {
        i1 = new ImageIcon("C:\\Project\\image\\apple.jpg");
        i2 = new ImageIcon("C:\\Project\\image\\pear.jpg");
        JButton apple = new JButton("apple");
        JButton pear = new JButton("pear");
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        ct.add(apple);
        ct.add(pear);
        ct.add(result);
        
        ActionListener listener = new ButtonClickListener();
        apple.addActionListener(listener);
        pear.addActionListener(listener);
        
        setTitle("JLabel Test1");
        setSize(300, 250);
        setVisible(true);
    }
    
    private class ButtonClickListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if(ae.getActionCommand().equals("good apple")) {
                result.setText("good apple");
                result.setIcon(i1);
            } else {
                result.setText("good pear");
                result.setIcon(i2);
            }
        }
    }
}
public class JLabelTest2 {
    public static void main(String[] args) {
        new JLabel1();
    }
}