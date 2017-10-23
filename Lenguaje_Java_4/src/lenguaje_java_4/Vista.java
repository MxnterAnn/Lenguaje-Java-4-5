package lenguaje_java_4;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class Vista extends JFrame {

    JTextField txtFrase;
    JLabel eti1, eti2, eti3, eti4;
    JButton btnAnalizar;

    public Vista() {
        this.setTitle("EJERCICIO 1");
        this.setSize(300, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        txtFrase = new JTextField();
        this.getContentPane().add(txtFrase, new AbsoluteConstraints(20, 20, 200, 30));

        eti1 = new JLabel();
        this.getContentPane().add(eti1, new AbsoluteConstraints(20, 60, 200, 30));
        eti1.setBorder(new LineBorder(Color.black));
        eti1.setOpaque(true);
        eti2 = new JLabel();
        this.getContentPane().add(eti2, new AbsoluteConstraints(20, 100, 200, 30));
        eti2.setBorder(new LineBorder(Color.black));
        eti2.setOpaque(true);
        eti3 = new JLabel();
        this.getContentPane().add(eti3, new AbsoluteConstraints(20, 140, 200, 30));
        eti3.setBorder(new LineBorder(Color.black));
        eti3.setOpaque(true);
        eti4 = new JLabel();
        this.getContentPane().add(eti4, new AbsoluteConstraints(20, 180, 200, 30));
        eti4.setBorder(new LineBorder(Color.black));
        eti4.setOpaque(true); 
         btnAnalizar = new JButton("Analizar");
        this.getContentPane().add(btnAnalizar, new AbsoluteConstraints(20, 220, 200, 30));
       
    }

    public static void main(String[] args) {
        Vista a = new Vista();
        a.setVisible(true);

    }

}
