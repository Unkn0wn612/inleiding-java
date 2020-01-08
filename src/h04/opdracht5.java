package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht5 extends Applet {

    @Override
    public void init() {
        setBackground(Color.blue);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(20,20,200,100,0,359);
    }
}
