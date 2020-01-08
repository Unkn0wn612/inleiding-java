package h04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    @Override
    public void init() {
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(75,185,185,75);
        g.drawLine(75,185,75,75);
        g.drawLine(75,75,185,75);

    }
}
