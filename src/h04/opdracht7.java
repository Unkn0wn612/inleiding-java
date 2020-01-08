package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht7 extends Applet {

    @Override
    public void init() {
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(20,20,50,50);
        g.setColor(Color.black);
        g.fillArc(30,25, 10,10,0,360);
        g.fillArc(50,25, 10,10,0,360);
        g.fillArc(30,50,10,10,0,360);
        g.fillArc(50,50,10,10,0,360);


    }
}
