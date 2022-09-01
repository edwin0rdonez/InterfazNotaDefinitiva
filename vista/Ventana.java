package vista;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import modelo.notas;

public class Ventana<lblDefinitiva> extends JFrame implements  ActionListener{
    public Ventana(){
        setTitle("Nota Definitiva"); // Titulo
        setSize(600, 500); // Dimension de la ventana
        setVisible(true); // Pone visible la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 
        iniciarComponentes();
    }
    private void iniciarComponentes(){
        lblExamen = new JLabel("Examen :");
        lblTaller = new JLabel("Taller :");
        lblExposicion = new JLabel("Exposicion :");
        lblQuiz = new JLabel("Quiz :");
        lblDefinitiva = new JLabel("Definitiva :");
        txtExamen = new JTextField(10);
        txtTaller = new JTextField(10);
        txtExposicion = new JTextField(10);
        txtQuiz = new JTextField(10);
        txtDefinitiva = new JTextField(10);
        txtDefinitiva.setEditable(false);

        btnCalcular = new JButton("Calcular");
        btnSalir = new JButton("Salir");  
        
        btnCalcular.addActionListener(this);  // El actionPerformed está en 
                                              // esta misma clase
        btnSalir.addActionListener(this);

        contenedorPpal = getContentPane();
        contenedorPpal.setLayout(new GridLayout(6,2));

        contenedorPpal.add(lblExamen);
        contenedorPpal.add(txtExamen);

        contenedorPpal.add(lblTaller);
        contenedorPpal.add(txtTaller);

        contenedorPpal.add(lblExposicion);
        contenedorPpal.add(txtExposicion);

        contenedorPpal.add(lblQuiz);
        contenedorPpal.add(txtQuiz);

        contenedorPpal.add(lblDefinitiva);
        contenedorPpal.add(txtDefinitiva);

        contenedorPpal.add(btnCalcular);
        contenedorPpal.add(btnSalir);
        pack();


    }
    private JLabel lblExamen;
    private JLabel lblTaller;
    private JLabel lblExposicion;
    private JLabel lblQuiz;
    private JLabel lblDefinitiva;
    private JTextField txtExamen;
    private JTextField txtTaller;
    private JTextField txtExposicion;
    private JTextField txtQuiz;
    private JTextField txtDefinitiva;
    private JButton btnCalcular;
    private JButton btnSalir;
    private Container contenedorPpal;

    @Override
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == btnCalcular){
            float examen = Float.parseFloat(txtExamen.getText());
            float taller = Float.parseFloat(txtTaller.getText());
            float exposicion = Float.parseFloat(txtExposicion.getText());
            float Quiz = Float.parseFloat(txtQuiz.getText());

            notas estudiante = new notas(examen, taller, exposicion, Quiz);

            estudiante.calcularDefinitiva();

            float definitiva = estudiante.getDefinitiva();

            txtDefinitiva.setText(definitiva + "");
        }else if(e.getSource() == btnSalir){
            
            JOptionPane.showMessageDialog(this, "Va a salir");
            dispose(); //Cierre la ventana
        }
    }

    
}
