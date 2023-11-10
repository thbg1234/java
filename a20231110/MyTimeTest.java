package a20231110;

import java.awt.FlowLayout;
import java.awt.event.*;
import java.time.LocalDate;
import java.util.StringTokenizer;
import javax.swing.*;

public class MyTimeTest extends JFrame implements ActionListener {
    private JLabel jl1 = new JLabel("出生日期（yyyy mm dd）");
    private JTextField jtf = new JTextField(10);
    private JButton button1 = new JButton("计算");
    private JTextArea jta1 = new JTextArea(5, 20);
    private JTextArea jta2 = new JTextArea(5, 20);

    public MyTimeTest() {
        setTitle("出生日期计算器");
        setLayout(new FlowLayout());
        add(jl1);
        add(jtf);
        add(button1);
        add(jta1);
        add(jta2);
        button1.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String birth = jtf.getText();
        StringTokenizer st1 = new StringTokenizer(birth);
        int year = Integer.parseInt(st1.nextToken());
        int month = Integer.parseInt(st1.nextToken());
        int day = Integer.parseInt(st1.nextToken());

        LocalDate my_birth = LocalDate.of(year, month, day);
        LocalDate hundred = my_birth.plusYears(100);

        jta1.setText("您的出生日期为：" + my_birth.toString());
        jta2.setText("100岁生日：" + hundred.toString());
    }

    public static void main(String[] args) {
        MyTimeTest t = new MyTimeTest();
    }
}

