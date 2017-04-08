/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
/**
 * clase encargada de pintar las lineas o bordes de las figuras
 * @author Edgar Andres Krejci Bautista
 * @author  Michael Cardenas
 */
public class DialogoColorLinea extends JDialog implements ActionListener {
    private static final String btnColor="seleccion";
    private String item="ROJO";
    private JButton boton;
    protected comboBox caja;
    private InterfazTriangulo h;
    public DialogoColorLinea() {
        
    }
    /**
     * 
     * @param frame  el cuadro nuevo que aparecera con las opciones de colores
     */
    public DialogoColorLinea(InterfazTriangulo frame) {
        h=frame;
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setTitle("SELECCIONAR LINEAS");
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
 * controla las accioness de seleciion de color
 * @param ae 
 */
    @Override
    public void actionPerformed(ActionEvent ae) {
        item=caja.caja1.getSelectedItem().toString();
        h.getPanelTriangulo().setSeleccion(item);
        h.getPanelTriangulo().repaint();
        setVisible(false);
        dispose();
    }
/**
 * 
 * retorna el item o opcion selecccionada
 */
    public String getItem() {
        return item;
    }
/**
 * recibe como parametro el item o la seleccion de color
 * @param item 
 */
    public void setItem(String item) {
        this.item = item;
    }

}
