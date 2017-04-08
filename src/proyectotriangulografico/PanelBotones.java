/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Johans Gonzalez
 */
public class PanelBotones extends JPanel implements ActionListener{
    
    DialogoColorLinea color;
    
    String lectura;
    
    DialogoColorArea colorArea;
    
    private static final String PUNTOS = "PUNTOS";
    
    String v="ROJO";
    
    private static final String COLOR_LINEA = "COLOR_LINEA";
    
    private static final String COLOR_FONDO = "COLOR_FONDO";
    
    private InterfazTriangulo triangulo;
    
    private JButton btnColorLinea;
    
    private JButton btnColorFondo;
    
    private JLabel etiquetaArea;
    
    private JLabel etiquetaPerimetro;
    
    private JLabel etiquetaAltura;
    
    PanelBotones(InterfazTriangulo interfaz, boolean b) {
        this.triangulo=interfaz;
        setLayout(new GridLayout(6, 1));
        setBackground(Color.WHITE);
        
        btnColorLinea = new JButton("Cambiar Lineas");
        btnColorLinea.setActionCommand(COLOR_LINEA);
        btnColorLinea.addActionListener(this);
        add(btnColorLinea);
        
        btnColorFondo = new JButton("Cambiar Fondo");
        btnColorFondo.setActionCommand(COLOR_FONDO);
        btnColorFondo.addActionListener(this);
        add(btnColorFondo);
        
        etiquetaArea = new JLabel("Area: "+((100*100)/2));
        add(etiquetaArea);
        
        etiquetaPerimetro = new JLabel("Perimetro: "+((Math.sqrt(Math.pow(100,2)+Math.pow(100,2)))+200));
        add(etiquetaPerimetro);

        etiquetaAltura = new JLabel("Altura: "+100);
        add(etiquetaAltura);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case COLOR_LINEA:
                System.out.print("Imprimio boton color linea");
                color=new DialogoColorLinea(triangulo);
                lectura=color.getItem();
                break;
            case COLOR_FONDO:
                System.out.print("Imprimio boton color fondo");
                colorArea=new DialogoColorArea(triangulo);
                break;        
        }
        
    }
    private void obtener(){
        color.getItem();
    }

    public DialogoColorLinea getColor() {
        return color;
    }

    public void setColor(DialogoColorLinea color) {
        this.color = color;
    }

    public JLabel getEtiquetaArea() {
        return etiquetaArea;
    }

    public void setEtiquetaArea(JLabel etiquetaArea) {
        this.etiquetaArea = etiquetaArea;
    }

    public JLabel getEtiquetaPerimetro() {
        return etiquetaPerimetro;
    }

    public void setEtiquetaPerimetro(JLabel etiquetaPerimetro) {
        this.etiquetaPerimetro = etiquetaPerimetro;
    }

    public JLabel getEtiquetaAltura() {
        return etiquetaAltura;
    }

    public void setEtiquetaAltura(JLabel etiquetaAltura) {
        this.etiquetaAltura = etiquetaAltura;
    }
    
}
