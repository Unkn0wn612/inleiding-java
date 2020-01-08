package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(50,120,120,90);
        g.drawLine(170,120,100,80);
        g.drawLine(110,80,50,120);
        g.drawRect(80,150,40,30);
        g.drawRect(130,150,20,60);
    }
}
