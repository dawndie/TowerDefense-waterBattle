package towerdefense;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyHandler implements KeyListener {

    private towerdefense.Screen screen;


    public KeyHandler(towerdefense.Screen screen) {
        this.screen = screen;

    }

    public void keyReleased(KeyEvent e) {

    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        System.out.print("KEYCODE: " + keyCode + "\n");

    }

}
