package pkginterface;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Constr {

    JPanel cont = new JPanel();
    private final int heigth;
    private final String text;
    private final int x;
    private final int y;
    private final int width;

    public Constr(int x, int y, int width, int heigth, String text, JFrame jFrame) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heigth = heigth;
        this.text = text;
        JButton b = new JButton(text);
        b.setBounds(x, y, heigth, width);
        cont.setLayout(null);
        cont.add(b);
        jFrame.setContentPane(cont);
    }
}
