package h08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class voorbeeld extends Applet {
    Button knop;
    String schermtekst;

    @Override
    public void init() {
        schermtekst = "Doet deze knop wel iets?";
        knop = new Button("klik mij");
        add(knop);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("doet dezeknop wel iets", 50, 60);
    }

    class KnopListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            schermtekst ="ja deze knop doet wel iets";
            
        }
    }
}

