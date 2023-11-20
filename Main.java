import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Hello Wolrds");

        JFrame window = new JFrame();
        window.setVisible(true);
        window.setSize(500, 500);
        window.setLocation(500, 500);
         
        TestJFrame test = new TestJFrame();

    }
}