
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

/**
 * clase encargada de pintar el fondo de la figura geometrica
 * @author EDGAR Kreicj
 * @author  Michael Cardenas
 */
public class DialogoColorArea  extends JDialog implements ActionListener {
    private static final String btnColor="seleccion";
    private String item;
    private JButton boton;
    protected comboBox caja;
    InterfazTriangulo j;
    public DialogoColorArea(InterfazTriangulo frame) {
        this.j=frame;
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONAR AREA");
        setSize(300,300);
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        caja=new comboBox();
        boton = new JButton("Seleccion");
        boton.setActionCommand(btnColor);
        boton.addActionListener(this);
        add(boton,BorderLayout.SOUTH);
        add(caja.caja1);
        setLocationRelativeTo(null);
        setVisible(true);
            
    }
/**
 * metodo que deriva de JDialog y se implementa obligatoriamente y controla las acciones de la seleccion de color para el area
 * @param ae 
 */
    @Override
    public void actionPerformed(ActionEvent ae) {
        item=caja.caja1.getSelectedItem().toString();
        j.getPanelTriangulo().setColorA(item);
        j.getPanelTriangulo().repaint();
        setVisible(false);
        dispose();
       // InterfazTriangulo a = new InterfazTriangulo(b,item);
    }
    
}
