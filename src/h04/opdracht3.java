package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht3 extends Applet {
    @Override
    public void init() {
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(40,20, 200,50);
        g.setColor(Color.white);
        g.fillRect(40,70, 200,50);
        g.setColor(Color.blue);
        g.fillRect(40,120,200,50);
        g.setColor(Color.darkGray);
        g.fillRect(20,20,20,250);
    }
}
