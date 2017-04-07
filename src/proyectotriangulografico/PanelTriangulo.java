/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotriangulografico;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JPanel;
import javax.swing.BorderFactory;

/**
 *
 * @author Johans Gonzalez
 */
public class PanelTriangulo extends JPanel{
    double radio;
    String seleccion;
    String colorA;
    int tipo=1,lado1,lado2;
    double coordenadaX1=(this.getWidth()/2),coordenadaX2=100,coordenadaX3=100,coordenadaY1=(this.getHeight()/2),coordenadaY2=0,coordenadaY3=100,coordenadaX4,coordenadaY4;
    public PanelTriangulo () {
        setBackground(Color.GRAY);
        Dimension d = getSize();
        System.out.print(d.getHeight() + " " + d.getWidth());   
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);    
        if (tipo==1){ 
            Graphics2D g2d = (Graphics2D) g;
            Polygon polygon = new Polygon();
            polygon.addPoint((int)coordenadaX1,(int)coordenadaY1);
            polygon.addPoint((int)coordenadaX2,(int)coordenadaY2);
            polygon.addPoint((int)coordenadaX3,(int)coordenadaY3);        
            g.drawLine(0,this.getHeight()/2, this.getWidth(), this.getHeight()/2);
            g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());        
            g2d.setColor(colorArea(colorA));
            g2d.fill(polygon);
            g2d.setStroke(new BasicStroke(3.f));
            g2d.setColor(establecer(seleccion));
            g2d.draw(polygon); 
        }
        if (tipo==2){
            Graphics2D g2d = (Graphics2D) g;
            g.drawLine(0,this.getHeight()/2, this.getWidth(), this.getHeight()/2);
            g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
            g2d.setColor(establecer(seleccion));   
            g2d.setStroke(new BasicStroke(5.f));
            g2d.drawOval((int) coordenadaX1, (int) coordenadaY1, (int) radio,(int) radio);
            g2d.setColor(colorArea(colorA));
            g2d.fillOval((int) coordenadaX1,(int) coordenadaY1, (int) radio,(int) radio);
        }
        if (tipo==3){
            int coordX[]={(int)coordenadaX1+40,(int)coordenadaX2+40,(int)coordenadaX3+40,(int)coordenadaX4+40};
            int coordY[]={(int)coordenadaY1,(int)coordenadaY2,(int)coordenadaY3,(int)coordenadaY4};
            Graphics2D g2d = (Graphics2D) g;
            g.drawLine(0,this.getHeight()/2, this.getWidth(), this.getHeight()/2);
            g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight()); 
            g2d.setColor(colorArea(colorA));
            g2d.fillPolygon(coordX, coordY, 4);
            g2d.setStroke(new BasicStroke(3.f));
            g2d.setColor(establecer(seleccion));
            g2d.drawPolygon(coordX, coordY, 4);
        }
    }
    private Color establecer(String seleccion){
            if (seleccion=="AZUL")
                return Color.BLUE;
            if (seleccion=="ROJO")
                return Color.RED;
            if (seleccion=="BLANCO")
                return Color.WHITE;
            if (seleccion=="VERDE")
                return Color.GREEN;
            if (seleccion=="CYAN")
                return Color.CYAN;
            if (seleccion=="NARANJA")
                return Color.ORANGE;
            if (seleccion=="ROSADO")
                return Color.PINK;
            else return Color.PINK;
    }
    private Color colorArea(String colorArea){
            if (colorArea=="AZUL")
                return Color.BLUE;
            if (colorArea=="ROJO")
                return Color.RED;
            if (colorArea=="BLANCO")
                return Color.WHITE;
            if (colorArea=="VERDE")
                return Color.GREEN;
            if (colorArea=="NARANJA")
                return Color.ORANGE;
            if (colorArea=="CYAN")
                return Color.CYAN;
            if (colorArea=="ROSADO")
                return Color.PINK;
            else return Color.PINK;
    
    } 
    
    void establecer(logica.Punto P1,logica.Punto P2,logica.Punto P3){
        System.out.println(P1.getX()+" "+P1.getY());
        System.out.println(P2.getX()+" "+P2.getY());
        System.out.println(P3.getX()+" "+P3.getY());
        coordenadaX1=(P1.getX()+(this.getHeight()/2));
        coordenadaY1=((this.getHeight()/2)-P1.getY());
        coordenadaX2=(P2.getX()+(this.getHeight()/2));
        coordenadaY2=((this.getHeight()/2)-P2.getY());
        coordenadaX3=(P3.getX()+(this.getHeight()/2));
        coordenadaY3=((this.getHeight()/2)-P3.getY());
    }
    void establecerCirculo(logica.Punto P1,logica.Punto P2,double rad){
        this.radio=rad;
        coordenadaX1=(P1.getX()+((this.getWidth()/2)-(radio/2)));
        coordenadaY1=(((this.getHeight()/2)-(radio/2))-P1.getY());
    }
    void establecerCuadrado(logica.Punto P1,logica.Punto P2,logica.Punto P3,logica.Punto P4,int lado1, int lado2){
        coordenadaX1=(P1.getX()+(this.getHeight()/2));
        coordenadaY1=((this.getHeight()/2)-P1.getY());
        coordenadaX2=(P2.getX()+(this.getHeight()/2));
        coordenadaY2=((this.getHeight()/2)-P2.getY());
        coordenadaX3=(P3.getX()+(this.getHeight()/2));
        coordenadaY3=((this.getHeight()/2)-P3.getY());
        coordenadaX4=(P4.getX()+(this.getHeight()/2));
        coordenadaY4=((this.getHeight()/2)-P4.getY());
        this.lado1=lado1;
        this.lado2=lado2;
    }
    public String getColorA() {
        return colorA;
    }

    public void setColorA(String colorA) {
        this.colorA = colorA;
    }
    
    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
}
