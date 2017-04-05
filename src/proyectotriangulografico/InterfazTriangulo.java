/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *
 * @author Edgar Andres Krejci Bautista
 */
public class InterfazTriangulo extends JFrame{
    
    String seleccion;
    
    String colorArea;
        
    
    private PanelImagen panelImagen;
    
    private PanelOpciones panelOpciones;
    
    private PanelBotones panelBotones;
    
    private PanelTriangulo panelTriangulo;
    
    private DialogoColorLinea color;

   /* public InterfazTriangulo(PanelTriangulo panelTriangulo,String objeto) {
        setTitle("PROGRAMA TRIANGULO -- EDGAR ANDRES KREJCI BAUTISTA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(  );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones(  );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setColorA(objeto);
        setVisible(true);
        
    }*/
    public InterfazTriangulo() {
        setTitle("PROGRAMA TRIANGULO -- EDGAR ANDRES KREJCI BAUTISTA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(  );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones( this,true );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setSeleccion(seleccion);
        setVisible(true);
    }
/*
    public InterfazTriangulo(String seleccion) {
        this.seleccion = seleccion;
        setTitle("PROGRAMA TRIANGULO -- EDGAR ANDRES KREJCI BAUTISTA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(  );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones(  );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setSeleccion(seleccion);
        setVisible(true);
    }

    public InterfazTriangulo(Punto p1, Punto p2, Punto p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        setTitle("PROGRAMA TRIANGULO -- EDGAR ANDRES KREJCI BAUTISTA");
        setSize(600, 600);
        setLocationRelativeTo(null);        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());        
        
        panelImagen = new PanelImagen( );
        getContentPane().add(panelImagen, BorderLayout.NORTH);
        
        panelOpciones = new PanelOpciones(  );
        getContentPane().add(panelOpciones, BorderLayout.SOUTH);
                
        panelBotones = new PanelBotones(  );
        getContentPane().add(panelBotones, BorderLayout.WEST);

        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.establecer(p1,p2,p3);
        setVisible(true);
    }*/
    void setearColor(String item){
        seleccion=panelBotones.colorArea.caja.item;
        panelTriangulo = new PanelTriangulo (  );
        getContentPane().add(panelTriangulo, BorderLayout.CENTER);
        panelTriangulo.setSeleccion(seleccion);
        setVisible(true);
    }
    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }


    public PanelTriangulo getPanelTriangulo() {
        return panelTriangulo;
    }

    public PanelBotones getPanelBotones() {
        return panelBotones;
    }
    
    
}
