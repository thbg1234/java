package report2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Report2 extends JFrame implements ActionListener {
    private JLabel label;
    private JTextField textField;
    private JButton buttonCircle, buttonTriangle, buttonSquare, buttonClear;
    private JTextArea textArea;
    public Report2() {
        super("도형의 넓이 구하기-석홍신");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        label = new JLabel("길이를 입력하고,도형의 버튼을 클릭하게요");
        textField = new JTextField(10);
        buttonCircle = new JButton("원");
        buttonCircle.addActionListener(this);
        buttonTriangle = new JButton("삼각형");
        buttonTriangle.addActionListener(this);
        buttonSquare = new JButton("사각형");
        buttonSquare.addActionListener(this);
        buttonClear = new JButton("리셋");
        buttonClear.addActionListener(this);
        JPanel panel = new JPanel(new GridLayout(3, 1));
        panel.add(label);
        panel.add(textField);
        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(buttonCircle);
        buttonPanel.add(buttonTriangle);
        buttonPanel.add(buttonSquare);
        buttonPanel.add(buttonClear);
        panel.add(buttonPanel);
        textArea = new JTextArea(10, 20);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(panel, BorderLayout.NORTH);
        container.add(scrollPane, BorderLayout.CENTER);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        try {
            double num = Double.parseDouble(input);
            double result = 0;
            if (e.getSource() == buttonCircle) {
                result = Math.PI * num * num;
                textArea.append("원의 넓이：" + result + "\n");
            } else if (e.getSource() == buttonTriangle) {
                result = 0.5 * num * num;
                textArea.append("삼각형의 넓이：" + result + "\n");
            } else if (e.getSource() == buttonSquare) {
                result = num * num;
                textArea.append("사각형의 넓이：" + result + "\n");
            }
            
            textField.setText("");
        } catch (NumberFormatException ex) {
            textArea.setText("길이(숫자)를 입력하셔야 합니다\n");
        }
        
        if (e.getSource() == buttonClear) {
            textArea.setText("");
        }
    }
    public static void main(String[] args) {
        new Report2();
    }
}