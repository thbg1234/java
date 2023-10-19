package 과제1;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import javax.swing.*;
class FileCreationListener implements ActionListener {
    private JTextArea contents;
    private JTextField f_name;
    
    public FileCreationListener(JTextArea contents, JTextField f_name) {
        this.contents = contents;
        this.f_name = f_name;
    }
    
    public void actionPerformed(ActionEvent ae) {
        try {
            String s = f_name.getText();
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);
            
            dos.writeUTF(contents.getText());
            fos.close();
            System.out.print(s + "파일이 생성되었습니다.");
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}
class GUI1 extends JFrame {
    private JTextArea contents;
    private JTextField f_name;
    
    public GUI1() {
        contents = new JTextArea("파일의 내용을 입력하세요.", 10, 20);
        f_name = new JTextField("파일 이름을 입력하세요", 20);
        JButton jb = new JButton("파일로 생성");
        
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        JPanel pl = new JPanel();
        
        pl.add(f_name);
        pl.add(jb);
        
        ct.add(contents);
        ct.add(pl);
        
        FileCreationListener listener = new FileCreationListener(contents, f_name);
        jb.addActionListener(listener);
        
        setTitle("GUI Test");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
public class GUITest1_1 {
    public static void main(String[] args) {
        new GUI1();
    }
}
