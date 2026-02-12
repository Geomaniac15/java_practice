import javax.swing.*;

public class HelloWorldSwing {
    private JFrame a = new JFrame();
    private JPanel panel = new JPanel();
    private JButton b = new JButton("Click Me!");

    public HelloWorldSwing() {
        panel.add(b);
        a.setContentPane(panel);
        a.setTitle("Hello World!");
        a.setSize(300, 300);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        a.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloWorldSwing();
    }
}
