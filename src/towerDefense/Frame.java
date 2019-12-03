package towerDefense;

import towerdefense.Screen;

import javax.swing.*;

public class Frame extends JFrame {
    public  JFrame jFrame;
    towerdefense.Screen screen;
    public static void main(String[] args) {
        new Frame();
    }
    public Frame(){
        jFrame=new JFrame();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(MAXIMIZED_BOTH);
        setUndecorated(true);
        setResizable(false);
        setTitle("TowerDefense");
        screen= new Screen(this);
        add(screen);
        setVisible(true);
    }
}
