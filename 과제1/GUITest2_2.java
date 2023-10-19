package 과제1;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class FileLoadListener implements ActionListener {
    private JTextArea contents;
    private JTextField f_name;
    
    public FileLoadListener(JTextArea contents, JTextField f_name) {
        this.contents = contents;
        this.f_name = f_name;
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String s = f_name.getText();
            FileInputStream fis = new FileInputStream(s);
            DataInputStream dis = new DataInputStream(fis);
            
            contents.setText(dis.readUTF());
            fis.close();
            System.out.println(s+"파일을 읽어 왔습니다.");
        }
        catch(Exception e) {
            System.out.println("파일이 존재하지 않습니다.");
        }
    }
}
class GUI2 extends JFrame {
    private JTextArea contents;
    private JTextField f_name;
    
    public GUI2() {
        contents = new JTextArea(10, 20);
        f_name = new JTextField("파일 이름을 입력하세요", 20);
        JButton jb = new JButton("파일 불러오기");
        contents.setEditable(false);
        
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JPanel pl = new JPanel();
        
        pl.add(f_name);
        pl.add(jb);
        
        ct.add(pl);
        ct.add(contents);
        
        FileLoadListener listener = new FileLoadListener(contents, f_name);
        jb.addActionListener(listener);
        
        setTitle("GUI Test");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class GUITest2_2 {
    public static void main(String[] args) {
        new GUI2();
    }
}
