import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {
    public MyFrame() {

        setTitle("Ví dụ JFrame Java");

        setSize(400, 300);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel("Chào mừng đến với JFrame!");
        add(label);
    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
