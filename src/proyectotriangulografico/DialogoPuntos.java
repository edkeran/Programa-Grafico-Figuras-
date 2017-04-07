/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.Circulo;
import logica.Cuadrado;
import logica.FigurasGeometricas;
import logica.Triangulo;

/**
 *
 * @author EDGAR
 */
public class DialogoPuntos extends JDialog implements ActionListener{
    private JTextField jTextPane1;
    private JTextField jTextPane2;
    private JTextField jTextPane3;
    private JTextField jTextPane4;
    private JTextField jTextPane5;
    private JTextField jTextPane6;
    private JTextField jTextPane7;
    private JTextField jTextPane8;
    private int cont=0;
    InterfazTriangulo y;
    String informacion=null;
    JButton boton;
    JLabel texto;
    logica.Punto p1,p2,p3,p4;
    double numero,numero2,numero3,numero4,numero5,numero6,numero7,numero8;
    private int botonEscogido;
    
    public DialogoPuntos(InterfazTriangulo frame,int escogido) {
         y=frame;
         this.botonEscogido=escogido;
         if (this.botonEscogido==1){
             generarDialogoTriangulo();
         }
         if (this.botonEscogido==2){
             generarDialogoCirculo();
         }
         if (this.botonEscogido==3){
             generarDialogoCuadrado();
         }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
            if(validarDatos()&&(botonEscogido==1)) {
                System.out.println(botonEscogido);
                informacion=this.jTextPane1.getText();
                numero= Integer.parseInt(informacion);
                informacion=this.jTextPane2.getText();
                numero2=Integer.parseInt(informacion);
                informacion=this.jTextPane3.getText();
                numero3=Integer.parseInt(informacion);
                informacion=this.jTextPane4.getText();
                numero4=Integer.parseInt(informacion);
                informacion=this.jTextPane5.getText();
                numero5=Integer.parseInt(informacion);
                informacion=this.jTextPane6.getText();
                numero6=Integer.parseInt(informacion);
                p1= new logica.Punto(numero,numero2);
                p2= new logica.Punto(numero3,numero4);
                p3= new logica.Punto(numero5,numero6);
                y.getPanelTriangulo().establecer(p1, p2, p3);
                FigurasGeometricas t1 = new Triangulo(p1,p2,p3);
                if (t1.isValidar()){
                 y.getPanelBotones().getEtiquetaArea().setText("EL AREA ES :"+t1.getArea());
                 y.getPanelBotones().getEtiquetaPerimetro().setText("EL PERIMETRO ES: "+t1.getPerimetro());
                 y.getPanelBotones().getEtiquetaAltura().setText("LA ALTURA ES:"+t1.getAltura());
                 y.getPanelTriangulo().setTipo(1);
                 y.getPanelTriangulo().repaint();
                 setVisible(false);
                 dispose();
                }
                else{
                  JOptionPane.showMessageDialog(this, "LOS PUNTOS INGRESADOS NO FORMAN UN TRIANGULO","MESAJE", JOptionPane.ERROR_MESSAGE);
                }  
            }
            if ((validarDatos())&&(botonEscogido==2)){
                System.out.println(botonEscogido);
                informacion=this.jTextPane1.getText();
                numero= Integer.parseInt(informacion);
                informacion=this.jTextPane2.getText();
                numero2=Integer.parseInt(informacion);
                informacion=this.jTextPane3.getText();
                numero3=Integer.parseInt(informacion);
                informacion=this.jTextPane4.getText();
                numero4=Integer.parseInt(informacion);
                p1= new logica.Punto(numero,numero2); 
                p2= new logica.Punto(numero3,numero4);
                FigurasGeometricas t1 = new Circulo(p1,p2);
                y.getPanelTriangulo().setTipo(2);
                y.getPanelBotones().getEtiquetaArea().setText("EL AREA ES :"+t1.getArea());
                y.getPanelBotones().getEtiquetaPerimetro().setText("EL PERIMETRO ES: "+t1.getPerimetro());
                y.getPanelBotones().getEtiquetaAltura().setText("EL RADIO ES: "+t1.getRadio());
                y.getPanelTriangulo().establecerCirculo(p1, p2,t1.getRadio());
                y.getPanelTriangulo().repaint();
                cont++;
                if (cont==2){
                cont=0;
                setVisible(false);
                dispose();
                }
            }
            if ((validarDatos())&&(botonEscogido==3)){
                System.out.println(botonEscogido);
                informacion=this.jTextPane1.getText();
                numero= Integer.parseInt(informacion);
                informacion=this.jTextPane2.getText();
                numero2=Integer.parseInt(informacion);
                informacion=this.jTextPane3.getText();
                numero3=Integer.parseInt(informacion);
                informacion=this.jTextPane4.getText();
                numero4=Integer.parseInt(informacion);
                informacion=this.jTextPane5.getText();
                numero5=Integer.parseInt(informacion);
                informacion=this.jTextPane6.getText();
                numero6=Integer.parseInt(informacion);
                informacion=this.jTextPane7.getText();
                numero7=Integer.parseInt(informacion);
                informacion=this.jTextPane8.getText();
                numero8=Integer.parseInt(informacion);
                p1= new logica.Punto(numero,numero2);
                p2= new logica.Punto(numero3,numero4);
                p3= new logica.Punto(numero5, numero6);
                p4= new logica.Punto(numero7,numero8);
                FigurasGeometricas t1 = new Cuadrado(p1,p2,p3,p4);
                if (t1.isValidar()){
                    y.getPanelTriangulo().setTipo(3);
                    y.getPanelTriangulo().repaint();
                }
                else {
                    JOptionPane.showMessageDialog(this, "LOS PUNTOS INGRESADOS NO FORMAN UN CUADRADO","MESAJE", JOptionPane.ERROR_MESSAGE);
                }
            }
    }
    
    private boolean validarDatos() {
        if (botonEscogido==1){
             if(this.jTextPane1.getText().equals("")||this.jTextPane2.getText().equals("")||this.jTextPane3.getText().equals("")
                ||this.jTextPane4.getText().equals("")||this.jTextPane5.getText().equals("")||this.jTextPane6.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "DEBE DIGITAR TODOS LOS CAMPOS", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            return false;
            }
        }
        if (botonEscogido==2){
            if(this.jTextPane1.getText().equals("")||this.jTextPane2.getText().equals("")||this.jTextPane3.getText().equals("")
                    ||this.jTextPane4.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "DEBE DIGITAR TODOS LOS CAMPOS", "MENSAJE", JOptionPane.ERROR_MESSAGE);
                return false;
                }
        }
        if (botonEscogido==3){
            if(this.jTextPane1.getText().equals("")||this.jTextPane2.getText().equals("")||this.jTextPane3.getText().equals("")
                    ||this.jTextPane4.getText().equals("")||this.jTextPane5.getText().equals("")||this.jTextPane6.getText().equals("")||this.jTextPane7.getText().equals("")
                    ||this.jTextPane8.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "DEBE DIGITAR TODOS LOS CAMPOS", "MENSAJE", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }
    private void generarDialogoTriangulo(){
         setLayout(new GridLayout(18,1));
         setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
         setTitle("INGRESAR PUNTOS");
         setSize(600,600);
         setLocationRelativeTo(null);
         jTextPane1= new JTextField(80);
         jTextPane2= new JTextField(80);
         jTextPane3= new JTextField(80);
         jTextPane4= new JTextField(80);
         jTextPane5= new JTextField(80);
         jTextPane6= new JTextField(80);
         boton = new JButton("lectura");
         JLabel texto2= new JLabel("COORDENADA 1 EN Y");
         JLabel texto3= new JLabel("COORDENADA 2 EN X");
         JLabel texto4= new JLabel("COORDENADA 2 EN Y");
         JLabel texto5= new JLabel("COORDENADA 3 EN X");
         JLabel texto6= new JLabel("COORDENADA 3 EN Y");
         add(jTextPane1,BorderLayout.NORTH);
         texto= new JLabel("COORDENADA 1 EN X");
         add(texto,BorderLayout.NORTH);
         add(jTextPane2,BorderLayout.NORTH);
         add(texto2,BorderLayout.NORTH);
         add(jTextPane3,BorderLayout.NORTH);
         add(texto3,BorderLayout.NORTH);
         add(jTextPane4,BorderLayout.NORTH);
         add(texto4,BorderLayout.NORTH);
         add(jTextPane5,BorderLayout.NORTH);
         add(texto5,BorderLayout.NORTH);
         add(jTextPane6,BorderLayout.NORTH);
         add(texto6,BorderLayout.NORTH);
         add(boton,BorderLayout.SOUTH);
         setVisible(true);
         this.boton.addActionListener(this);
         System.out.print(informacion);
         System.out.print(botonEscogido);
    }
    private void generarDialogoCirculo(){
         setLayout(new GridLayout(18,1));
         setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
         setTitle("INGRESAR PUNTOS");
         setSize(600,600);
         setLocationRelativeTo(null);
         jTextPane1= new JTextField(80);
         jTextPane2= new JTextField(80);
         jTextPane3= new JTextField(80);
         jTextPane4= new JTextField(80);
         boton = new JButton("lectura (Por favor presionelo dos veces)");
         JLabel texto2= new JLabel("COORDENADA 1 EN Y");
         JLabel texto3= new JLabel("COORDENADA 2 EN X");
         JLabel texto4= new JLabel("COORDENADA 2 EN Y");
         add(jTextPane1,BorderLayout.NORTH);
         texto= new JLabel("COORDENADA 1 EN X");
         add(texto,BorderLayout.NORTH);
         add(jTextPane2,BorderLayout.NORTH);
         add(texto2,BorderLayout.NORTH);
         add(jTextPane3,BorderLayout.NORTH);
         add(texto3,BorderLayout.NORTH);
         add(jTextPane4,BorderLayout.NORTH);
         add(texto4,BorderLayout.NORTH);
         add(boton,BorderLayout.SOUTH);
         setVisible(true);
         this.boton.addActionListener(this);
         System.out.print(informacion);
         System.out.print(botonEscogido);
    }
    private void generarDialogoCuadrado(){
        setLayout(new GridLayout(18,1));
         setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
         setTitle("INGRESAR PUNTOS");
         setSize(600,600);
         setLocationRelativeTo(null);
         jTextPane1= new JTextField(80);
         jTextPane2= new JTextField(80);
         jTextPane3= new JTextField(80);
         jTextPane4= new JTextField(80);
         jTextPane5= new JTextField(80);
         jTextPane6= new JTextField(80);
         jTextPane7= new JTextField(80);
         jTextPane8= new JTextField(80);
         boton = new JButton("lectura");
         JLabel texto2= new JLabel("COORDENADA 1 EN Y");
         JLabel texto3= new JLabel("COORDENADA 2 EN X");
         JLabel texto4= new JLabel("COORDENADA 2 EN Y");
         JLabel texto5= new JLabel("COORDENADA 3 EN X");
         JLabel texto6= new JLabel("COORDENADA 3 EN Y");
         JLabel texto7= new JLabel("COORDENADA 4 EN X");
         JLabel texto8= new JLabel("COORDENADA 4 EN Y");
         add(jTextPane1,BorderLayout.NORTH);
         texto= new JLabel("COORDENADA 1 EN X");
         add(texto,BorderLayout.NORTH);
         add(jTextPane2,BorderLayout.NORTH);
         add(texto2,BorderLayout.NORTH);
         add(jTextPane3,BorderLayout.NORTH);
         add(texto3,BorderLayout.NORTH);
         add(jTextPane4,BorderLayout.NORTH);
         add(texto4,BorderLayout.NORTH);
         add(jTextPane5,BorderLayout.NORTH);
         add(texto5,BorderLayout.NORTH);
         add(jTextPane6,BorderLayout.NORTH);
         add(texto6,BorderLayout.NORTH);
         add(jTextPane7,BorderLayout.NORTH);
         add(texto7,BorderLayout.NORTH);
         add(jTextPane8,BorderLayout.NORTH);
         add(texto8,BorderLayout.NORTH);
         add(boton,BorderLayout.SOUTH);
         setVisible(true);
         this.boton.addActionListener(this);
         System.out.print(informacion);
         System.out.print(botonEscogido);
    }
    public double getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(int numero3) {
        this.numero3 = numero3;
    }

    public double getNumero4() {
        return numero4;
    }

    public void setNumero4(int numero4) {
        this.numero4 = numero4;
    }

    public double getNumero5() {
        return numero5;
    }

    public void setNumero5(int numero5) {
        this.numero5 = numero5;
    }

    public double getNumero6() {
        return numero6;
    }

    public void setNumero6(int numero6) {
        this.numero6 = numero6;
    }

    public int getBotonEscogido() {
        return botonEscogido;
    }

    public void setBotonEscogido(int botonEscogido) {
        this.botonEscogido = botonEscogido;
    }
    
}
