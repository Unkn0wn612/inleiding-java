package h06;

import java.applet.Applet;
import  java.awt.*;
public class Opdracht2 extends Applet {
    int a;
    int b;
    int c;
    int d;
    int uitkomst;

    @Override
    public void init() {
        a = 60;
        b = 60;
        c = 24;
        d = 365;
        uitkomst = a*b;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("1 uur =" + uitkomst,20,20);
        uitkomst = uitkomst * c;
        g.drawString("dag ="+ uitkomst,20,50);
        uitkomst = uitkomst * d;
        g.drawString("jaar ="+ uitkomst,20,80);

    }
}
