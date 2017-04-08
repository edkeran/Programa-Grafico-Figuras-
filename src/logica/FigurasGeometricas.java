/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * Clase Padre o superclase que guarda los atributos que heredaran las subclases
 * @author Michael Cardenas 
 * @author Edgar Kreicj
 */
public class FigurasGeometricas {
    private Punto puntoA;  //Creacion atributo de la clase Punto
    
    private Punto puntoB; // creacion atributo de la clase Punto

    private double area;
    
    private boolean validar;
  
    private double perimetro;
    
    private double altura;
    
    private double radio;
    
    private double lado1, lado2, lado3,lado4;
    
    /*
    *Constructor que inicializa las variables
    */
    public FigurasGeometricas(Punto puntoA, Punto puntoB) {
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }
    
    /*
    *Metoodo que calcula la distancia entre dos puntos este metodo lo llamaran
    *las subclases para usarlo
    */
    
    public double calcularLado(Punto punto,Punto puntodos){
        double auxiliarX=Math.pow(puntodos.getX()-punto.getX(), 2);
        double auxiliarY=Math.pow(puntodos.getY()-punto.getY(), 2);
        double lado=Math.sqrt(auxiliarX+auxiliarY);
        return lado;
    }
    /**
     * metodo que regresa el valor del puntoA
     * @return PuntoA 
     */
    public Punto getPuntoA() {
        return puntoA;
    }
    /**
     * metodo que recibe como parametro el puntoA
     * @param puntoA 
     */
    public void setPuntoA(Punto puntoA) {
        this.puntoA = puntoA;
    }
    
    /**
     * metodo que regresa el valor del puntoB
     * @return puntoB
     */
    public Punto getPuntoB() {
        return puntoB;
    }
    
    /**
     * metodo que recible el puntoB
     * @param puntoB 
     */
    public void setPuntoB(Punto puntoB) {
        this.puntoB = puntoB;
    }
    
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public boolean isValidar() {
        return validar;
    }

    public void setValidar(boolean validar) {
        this.validar = validar;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }
    
}

