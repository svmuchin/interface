package pkginterface;

import javax.swing.JFrame;

public class Interface {

    public static void main(String[] args) {
        JFrame f = new JFrame("окно");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 500);
        f.setVisible(true);
        Constr c = new Constr(10, 10, 50, 100, "кнопка", f, "Button");
    }
}