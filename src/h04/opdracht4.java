package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4 extends Applet {

    @Override
    public void init() {
        setBackground(Color.lightGray);
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(19,180,19,10);
        g.drawLine(19, 180, 180,180 );
        g.drawString("valerie",15, 205);
        g.setColor(Color.yellow);
        g.fillRect(20,120,30,60);
        g.setColor(Color.black);
        g.drawString("jeroen",60, 205);
        g.setColor(Color.orange);
        g.fillRect(50,20,30,160);
        g.setColor(Color.black);
        g.drawString("hans",100,205);
        g.setColor(Color.magenta);
        g.fillRect(80,60,30,120);
    }
}
