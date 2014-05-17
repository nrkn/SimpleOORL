package rl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class RLTextArea extends JTextArea implements KeyListener {
    final private String map = "####  ####\n"
             + "#  ####  #\n"
             + "#        #\n"
             + "##      ##\n"
             + " #      # \n"
             + " #      # \n"
             + "##      ##\n"
             + "#        #\n"
             + "#  ####  #\n"
             + "####  ####";

    private int x = 5;
    private int y = 5;

    public RLTextArea() {
        setEditable(false);
        setFont(new Font("monospaced",Font.PLAIN,14));
        repaintMap();
        addKeyListener(this);
    }

    private void moveHero(int dx, int dy) {
        if (map.charAt(indexFromCoords(x + dx, y + dy)) == ' ') {
            x = x + dx;
            y = y + dy;
        }
    }

    void repaintMap(){
        char[] currentMap = map.toCharArray();
        currentMap[indexFromCoords(x, y)] = '@';
        setText(new String(currentMap));
    }

    private int indexFromCoords(int x, int y){
        return y * (map.indexOf("\n") + 1) + x;
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_LEFT:  moveHero (-1,0); break;
            case KeyEvent.VK_RIGHT: moveHero (1,0);  break;
            case KeyEvent.VK_UP:    moveHero (0,-1); break;
            case KeyEvent.VK_DOWN:  moveHero (0,1);  break;
        }
        repaintMap();
    }
    public void keyTyped(KeyEvent e) {}

    public void keyReleased(KeyEvent e) {}
}
