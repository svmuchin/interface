package pkginterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Constr {

    JPanel cont = new JPanel();

    public Constr(int x, int y, int width, int heigth, String text, JFrame jFrame) {
        JButton b = new JButton(text);
        b.setName(text);
        b.setBounds(x, y, heigth, width);
        cont.setLayout(null);
        cont.add(b);
        jFrame.setContentPane(cont);
    }
}
