package _p143_p144_ManejoInterfazGUI;

import javax.swing.*;
import java.awt.event.*;

public class _p143_PagaTrabajador extends JFrame implements ActionListener{
    
    JLabel lblHoras, lblTasa, lblPagaXHora,lblMensajeFinal;
    JTextField txtHoras, txtTasa, txtPagaXHora;
    JButton btnCalcular, btnSalir;

    public _p143_PagaTrabajador() {
        super("Calcular la paga de un Trabajador");
        setLayout(null);

        lblHoras = new JLabel("Horas Trabajadas   :");
        lblHoras.setBounds(10, 20, 200, 30);
        add(lblHoras);
        txtHoras = new JTextField();
        txtHoras.setBounds(125, 20, 200, 30);
        add(txtHoras);

        lblTasa = new JLabel("Tasa de Impuestos :");
        lblTasa.setBounds(10, 50, 200, 30);
        add(lblTasa);
        txtTasa = new JTextField();
        txtTasa.setBounds(125, 50, 200, 30);
        add(txtTasa);

        lblPagaXHora = new JLabel("Paga por  Hora        :");
        lblPagaXHora.setBounds(10, 80, 200, 30);
        add(lblPagaXHora);
        txtPagaXHora = new JTextField();
        txtPagaXHora.setBounds(125, 80, 200, 30);
        add(txtPagaXHora);

        lblMensajeFinal = new JLabel(" [Resultado Aqui]");
        lblMensajeFinal.setBounds(10, 30, 300, 200);
        add(lblMensajeFinal);

        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(30, 140, 100, 40);
        add(btnCalcular);
        btnSalir = new JButton("Salir");
        btnSalir.setBounds(150, 140, 100, 40);
        add(btnSalir);
        btnCalcular.addActionListener(this);
        btnSalir.addActionListener(this);
    }

    public float getPagaBruta(float hora, float paga) {
        return hora * paga;
    }
    public float getImpuesto(float pagabruta, float tasa) {
        return pagabruta * tasa;
    }
    public float getPagaNeta(float pagabruta, float impuesto) {
        return pagabruta - impuesto;
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCalcular) {
            float hora = Float.parseFloat(txtHoras.getText());
            float tasa = Float.parseFloat(txtTasa.getText());
            float paga = Float.parseFloat(txtPagaXHora.getText());
            float PagaBruta = getPagaBruta(hora, paga);
            float impuesto = getImpuesto(PagaBruta, tasa);
            float PagaNeta = getPagaNeta(PagaBruta, impuesto);

            lblMensajeFinal.setText(String.format(
                "Paga Bruta: %.2f , Impuestos: %.2f , Paga Neta: %.2f" , PagaBruta, impuesto, PagaNeta));
        } else if (e.getSource() == btnSalir) {
            JOptionPane.showMessageDialog(this, "Gracias por usar este programa", "Despedida",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    public static void main(String[] args) {
        _p143_PagaTrabajador app = new _p143_PagaTrabajador();
        app.setBounds(10, 10, 410, 240);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
