import javax.swing.*;

public class SimpleOORL {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Object Oriented Rogue Like");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final RLTextArea rlta = new RLTextArea();
        frame.getContentPane().add(rlta);
        frame.pack();
        frame.setVisible(true);
    }
}
