package Swing;
import javax.swing.*;
public class MDIExample {
    public MDIExample()
    {
        JFrame f = new JFrame("MDI Example");
        f.setSize(600,400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JDesktopPane d = new JDesktopPane();
        JInternalFrame internalFrame = new JInternalFrame("Document 1", true, true, true, true);
        internalFrame.setSize(300,300);
        internalFrame.setVisible(true);
        d.add(internalFrame);
        f.add(d);
    }

    public static void main(String[] args) {
        new MDIExample();
    }
}
