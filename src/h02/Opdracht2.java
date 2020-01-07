package h02;

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {
    @Override
    public void init() {
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Chiraz", 50, 80);
        g.drawString("Nazirz", 50, 100);

    }
}

