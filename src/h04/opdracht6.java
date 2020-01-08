package h04;

import java.applet.Applet;
import java.awt.*;
import java.awt.image.ImageObserver;

public class opdracht6 extends Applet {

    @Override
    public void init() {
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics g) {
        g.fillOval(20,20,50,100);
        g.setColor(Color.red);
        g.fillArc(35,40, 20,20,0,360);
        g.setColor(Color.orange);
        g.fillArc(35,60, 20,20,0,360);
        g.setColor(Color.green);
        g.fillArc(35,80, 20,20,0,360);
    }
}
