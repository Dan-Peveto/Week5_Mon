import javax.swing.JFrame;

public class TestJFrame extends JFrame {
    public TestJFrame() {
        super("Gui Test");
        setContentPane(new MyJPanel());
        setSize(600, 600);
        setLocation(500, 500);
        setVisible(true);
    }
}
