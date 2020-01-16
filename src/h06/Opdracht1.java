package h06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht1 extends Applet {
    int a;
    int b;
    int c;
    int uitkomst;

    @Override
    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("113 delen door 4 =" + uitkomst,20,20);
        g.drawString("ik krijg:" + uitkomst, 20,50);
        g.drawString("jan krijgt:" + uitkomst,20,70);
        g.drawString("ali krijgt:" + uitkomst,20,90);
        g.drawString("Jeannette krijgt:" + uitkomst,20,110);

    }
}
