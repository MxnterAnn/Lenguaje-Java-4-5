package lenguaje_java_4;

import java.awt.Color;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista2 extends JFrame {

    JTextField txtFrase,txtsubCadena;
    JLabel eti11, eti22, eti33, eti44;
    JButton btnAnalizar;

    public Vista2() {
        this.setTitle("EJERCICIO 2");
        this.setSize(300, 400);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtFrase = new JTextField();
        this.getContentPane().add(txtFrase, new AbsoluteConstraints(20, 20, 200, 30));
        txtsubCadena = new JTextField();
        this.getContentPane().add(txtsubCadena, new AbsoluteConstraints(20, 60, 200, 30));
        eti11 = new JLabel();
        this.getContentPane().add(eti11, new AbsoluteConstraints(20, 100, 200, 30));
        eti11.setBorder(new LineBorder(Color.black));
        eti11.setOpaque(true);
        eti22 = new JLabel();
        this.getContentPane().add(eti22, new AbsoluteConstraints(20, 140, 200, 30));
        eti22.setBorder(new LineBorder(Color.black));
        eti22.setOpaque(true);
        eti33 = new JLabel();
        this.getContentPane().add(eti33, new AbsoluteConstraints(20, 180, 200, 30));
        eti33.setBorder(new LineBorder(Color.black));
        eti33.setOpaque(true);
        eti44 = new JLabel();
        this.getContentPane().add(eti44, new AbsoluteConstraints(20, 220, 200, 30));
        eti44.setBorder(new LineBorder(Color.black));
        eti44.setOpaque(true);
        btnAnalizar = new JButton("Analizar");
        this.getContentPane().add(btnAnalizar, new AbsoluteConstraints(20, 260, 200, 30));

    }

    public static void main(String[] args) {
        Vista2 b = new Vista2();
        b.setVisible(true);

    }

}
