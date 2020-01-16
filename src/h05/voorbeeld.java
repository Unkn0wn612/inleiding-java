package h05;

import java.applet.Applet;
import java.awt.*;

public class voorbeeld extends Applet {
    @Override
    public void init() {
    }

    @Override
    public void paint(Graphics g) {
        g.drawLine(20,20,100,20);
        g.drawString("lijn",40,35);
        g.drawRect(20,50,100,50);
        g.drawString("rechthoek",40,115);
        g.drawRoundRect(20,130,100,50,15,15);
        g.drawString("afgeronde rechthoek",20,200);
        g.setColor(Color.magenta);
        g.fillRoundRect(140,130,100,50,100,50);
        g.setColor(Color.black);
        g.drawString("ovaal",170,200);
        g.drawOval(280,130,50,50);
        g.drawString("circle",290,200);
        g.setColor(Color.magenta);
        g.fillRect(140,50,100,50);
        g.setColor(Color.black);
        g.drawOval(140,50,99,49);
        g.drawString("gevulde rechthoek ovaal",135,115);
        g.drawOval(280,50,100,50);
        g.drawString("taartpunt ovaal",290,115);
        g.setColor(Color.magenta);
        g.fillArc(320,50,100,100,0,45);

    }
}
