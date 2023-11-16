package _p146_EstudianteGUI_V2;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
import java.io.File;
import java.util.ArrayList;


public class App extends JFrame implements ActionListener {
    ArrayList<Estudiante> datos;
    JMenuBar menuBar;
    JMenu mnuArchivo, mnuAyuda;
    JMenuItem smnAbrir, smnSalir, smnAcercade, smnGuardar;
    JPanel pnlTabla,pnlDatos;
    JDialog jdlAcercaDe;
    JLabel lblDatos,lblNombre,lblEdad,lblPeso,lblCorreo;
    JTextField txtNombre,txtEdad,txtPeso,txtCorreo;
    JScrollPane spane;
    JTable table;
    DefaultTableModel modelo;
    JFileChooser fchArchivo;
    JButton btnAgregar, btnGrabar;

    public App() {
        super("Datos de Estudiantes");

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        mnuArchivo = new JMenu("Archivo");
        menuBar.add(mnuArchivo);
        smnAbrir = new JMenuItem("Abrir");
        smnAbrir.addActionListener(this);
        mnuArchivo.add(smnAbrir);
        smnSalir = new JMenuItem("Salir");
        smnSalir.addActionListener(this);
        smnGuardar = new JMenuItem("Guardar");
        mnuArchivo.add(smnGuardar);
        smnGuardar.addActionListener(this);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(smnSalir);
        mnuAyuda = new JMenu("Ayuda");
        menuBar.add(mnuAyuda);
        smnAcercade = new JMenuItem("Acerca de ..");
        mnuAyuda.add(smnAcercade);
        smnAcercade.addActionListener(this);
        jdlAcercaDe = new JDialog(this,"Acerca de ..");
        jdlAcercaDe.setSize(300,250);
        jdlAcercaDe.setLocationRelativeTo(null);
        lblDatos = new JLabel("<html>Programación Oriendada a Objetos I<br>Carlos Castañeda Ramírez</html>",JLabel.CENTER);
        lblDatos.setFont(new Font("Times New Roman",Font.BOLD, 18));
        jdlAcercaDe.add(lblDatos);

        setLayout(new GridLayout(3, 1));

        pnlTabla = new JPanel();
        pnlTabla.setLayout(new BoxLayout(pnlTabla,BoxLayout.X_AXIS));
        getContentPane().add(pnlTabla);
        spane = new JScrollPane();
        spane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        pnlTabla.add(spane);
        table = new JTable();
        table.getTableHeader().setBackground(Color.yellow);
        table.getTableHeader().setForeground(Color.black);
        spane.setViewportView(table);
        modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{"Nombre","Edad","Peso","Correo"});
        table.setModel(modelo);
        table.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int ren = table.rowAtPoint(e.getPoint());
                mostrarDatos(ren);
            }
        });
        pnlDatos = new JPanel();
        getContentPane().add(pnlDatos);
        pnlDatos.setLayout(new GridLayout(4, 2, 0, 0));
        lblNombre = new JLabel("Nombre");
        lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
        txtNombre = new JTextField();
        pnlDatos.add(lblNombre);
        pnlDatos.add(txtNombre);
        lblEdad = new JLabel("Edad");
        lblEdad.setHorizontalAlignment(SwingConstants.RIGHT);
        txtEdad = new JTextField();
        pnlDatos.add(lblEdad);
        pnlDatos.add(txtEdad);
        lblPeso = new JLabel("Peso");
        lblPeso.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPeso = new JTextField();
        pnlDatos.add(lblPeso);
        pnlDatos.add(txtPeso);
        lblCorreo = new JLabel("Correo:");
        lblCorreo.setHorizontalAlignment(SwingConstants.RIGHT);
        txtCorreo = new JTextField();
        pnlDatos.add(lblCorreo);
        pnlDatos.add(txtCorreo);
        JPanel pnlBotones = new JPanel();

        btnAgregar = new JButton("Agregar");
        btnAgregar.addActionListener(this);
        pnlBotones.add(btnAgregar);
        btnGrabar = new JButton("Grabar");
        btnGrabar.setEnabled(false);
        btnGrabar.addActionListener(this);
        pnlBotones.add(btnGrabar);
        add(pnlBotones);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == smnSalir) {
            dispose();
        } else if(e.getSource()== smnAcercade) {
            jdlAcercaDe.setVisible(true);
        } else if (e.getSource() == smnAbrir) {
            fchArchivo = new JFileChooser();
            fchArchivo.setCurrentDirectory(new File("."));
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            int res = fchArchivo.showOpenDialog(null);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    datos = Util.desSerializarDatos(arch.getName());
                    this.cargarDatos();
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if(e.getSource()== smnGuardar) {
            fchArchivo = new JFileChooser();
            fchArchivo.setFileFilter(new FileNameExtensionFilter("Archivos de datos(.dat)", new String[]{"dat"}));
            fchArchivo.setCurrentDirectory(new File("."));
            int res = fchArchivo.showSaveDialog(this);
            File archivo = fchArchivo.getSelectedFile();
            if (res == JFileChooser.APPROVE_OPTION) {
                File arch = fchArchivo.getSelectedFile();
                try {
                    Util.serializarDatos(arch.getName(),datos);
                    JOptionPane.showMessageDialog(this, "Datos Grabados en : " +
                    arch.getName(),"Correcto" ,JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(this, "Error al procesar el archivo", "Error",JOptionPane.ERROR_MESSAGE);
                }
            }
        } else if(e.getSource()==btnAgregar) {
            activarCampos(true);
            limpiarCampos();
            txtNombre.requestFocus();
            btnAgregar.setEnabled(false);
            btnGrabar.setEnabled(true);
        } else if(e.getSource()==btnGrabar) {
            guardarCampos();
            limpiarCampos();
            activarCampos(false);
            btnGrabar.setEnabled(false);
            btnAgregar.setEnabled(true);
        }
    }

    public void cargarDatos() {
        DefaultTableModel dm = (DefaultTableModel)table.getModel();
        while(dm.getRowCount()>0) dm.removeRow(0);
        Object[] obj = new Object[4];
        for (int i = 0; i < datos.size(); i++) {
            obj[0] = datos.get(i).getNombre();
            obj[1] = datos.get(i).getEdad();
            obj[2] = datos.get(i).getPeso();
            obj[3] = datos.get(i).getCorreo();
            modelo.addRow(obj);
        }
    }

    public void mostrarDatos(int ren) {
        txtNombre.setText(datos.get(ren).getNombre());
        txtEdad.setText(Integer.toString((datos.get(ren).getEdad())));
        txtPeso.setText(Double.toString((datos.get(ren).getPeso())));
        txtCorreo.setText(datos.get(ren).getCorreo());
    }
    public void activarCampos(boolean actdes) {
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        cp.setEnabled(actdes);
    }
    public void limpiarCampos() {
        for (Component cp : pnlDatos.getComponents())
        if(cp instanceof JTextField)
        ((JTextField)cp).setText("");
    }
    public void guardarCampos() {
        Estudiante est = new Estudiante();
        est.setNombre( txtNombre.getText() );
        est.setEdad( Integer.parseInt(txtEdad.getText() ));
        est.setPeso( Double.parseDouble(txtPeso.getText()) );
        est.setCorreo( txtCorreo.getText() );
        datos.add(est);
        cargarDatos();
    }

    public static void main(String[] args) {
        App app = new App();
        app.setBounds(10, 10, 550, 400);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.datos = Util.inicializarDatos();
        app.cargarDatos();
        app.activarCampos(false);
    }
}
