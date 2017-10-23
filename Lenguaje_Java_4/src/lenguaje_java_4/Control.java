package lenguaje_java_4;

import java.awt.event.*;
import javax.swing.JOptionPane;

public class Control implements ActionListener {

    Vista a;
    int n1;

    public Control() {
        a = new Vista();
        a.setVisible(true);
        a.btnAnalizar.addActionListener(this);
    }

    public int esNumero(String x) {
        int n = 0;
        try {
            n = Integer.parseInt(x);
            return n;
        } catch (Exception e) {
            return 0;
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == a.btnAnalizar) {
            String n = a.txtFrase.getText();
            n1 = esNumero("" + n.length());

            if (n1 == 0) {
                JOptionPane.showMessageDialog(a, "Error");
            } else {

                a.eti1.setText(n.toUpperCase());
                a.eti2.setText(n.toLowerCase());
                a.eti3.setText("" + n.length());
                a.eti4.setText("" + n.replace(" ", "").length());
            }
        }

    }

    public static void main(String[] args) {
        Control c = new Control();
    }
}
