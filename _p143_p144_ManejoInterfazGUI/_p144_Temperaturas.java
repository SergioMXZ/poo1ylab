package _p143_p144_ManejoInterfazGUI;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class _p144_Temperaturas extends JFrame implements ActionListener, ChangeListener {
    JPanel p1;
    JLabel lblFarenheit, lblCentigrados;
    JTextField txtFarenheit, txtCentigrados;
    ButtonGroup grpOpciones;
    JRadioButton rbtFarenheit, rbtCentigrados;
    JButton btnCalcular, btnSalir;

    public _p144_Temperaturas() {
        super("Convierte a Farenheit o a Centigrados");
        setLayout(new FlowLayout());

        p1 = new JPanel();
        p1.setLayout(new GridLayout(5, 2));

        lblFarenheit = new JLabel("Farenheit: ", JLabel.RIGHT); p1.add(lblFarenheit);
        txtFarenheit = new JTextField(); p1.add(txtFarenheit);
        lblCentigrados = new JLabel("Centigrados: ", JLabel.RIGHT); p1.add(lblCentigrados);
        txtCentigrados = new JTextField(); p1.add(txtCentigrados);

        grpOpciones = new ButtonGroup();
        rbtFarenheit = new JRadioButton("Farenheit");
        rbtCentigrados = new JRadioButton("Centigrados");
        grpOpciones.add(rbtFarenheit); grpOpciones.add(rbtCentigrados);
        p1.add(rbtFarenheit); p1.add(rbtCentigrados);

        add(p1);

        btnCalcular = new JButton("Aceptar"); add(btnCalcular);
        btnSalir = new JButton("Salir"); add(btnSalir);

        rbtFarenheit.addChangeListener(this);
        rbtCentigrados.addChangeListener(this);
        
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public void stateChanged(ChangeEvent e) {
        txtFarenheit.setEnabled(true);
        txtCentigrados.setEnabled(true);
        if (rbtFarenheit.isSelected()) {
            txtFarenheit.setEnabled(false);
        } else {
            txtCentigrados.setEnabled(false);
        }
    }

    public void actionPerformed(ActionEvent e) {
        float f, c;
        if (e.getSource() == btnCalcular) {
            try {
                if (rbtFarenheit.isSelected()) {
                    c = Float.parseFloat(txtCentigrados.getText());
                    f = (c * 9/5) + 32  ;
                    txtFarenheit.setText(String.format("%.2f", f));
                    
                } else if (rbtCentigrados.isSelected()) {
                    f = Float.parseFloat(txtFarenheit.getText());
                    c = (f - 32) * 5/9;
                    txtCentigrados.setText(String.format("%.2f", c));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Faltan valores",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnSalir) {
            dispose();
        }
    }

    public static void main(String[] args) {
        _p144_Temperaturas app = new _p144_Temperaturas();
        app.setBounds(10, 10, 400, 200);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
