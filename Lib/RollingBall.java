package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RollingBall extends JPanel {
public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(80, 80,90, 100);
        g.fillArc(80, 80,90, 90,0, 180);

    }
}

