import javax.swing.*;
import java.awt.*;

public class RL extends JApplet {

    public RL() throws HeadlessException {
        final RLTextArea pane = new RLTextArea();
        setContentPane(pane);
    }
}