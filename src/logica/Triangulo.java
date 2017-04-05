/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * subclase Triangulo que hereda los atributos y metodos de la superclase 
 * @author Michael Cardenas 
 * @author Edgar Kreicj
 */
public class Triangulo extends FigurasGeometricas{
    private Punto puntoC;
    /**
     * metodo constructor que inicializa los atributos
     * @param puntoA
     * @param puntoB
     * @param puntoC 
     */
    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        super(puntoA, puntoB); //Aqui se llaman los atributos de la Superclase para inicializarlos 
        this.puntoC = puntoC;
        super.setValidar(isTriangulo());
        super.setArea(darArea());
        super.setPerimetro(darPerimetro());
        
    }
    /**
     * Metodo que reune los demas metodos que realizan los calculos
     * 
     */
     public void iniciar() {
        if(isTriangulo()) {
            System.out.println("Lado1 = " + lado1());
            System.out.println("Lado2 = " + lado2());
            System.out.println("Lado3 = " + lado3());
            System.out.println("El perimetro es: " + darPerimetro());
            System.out.println("El Area es: " + darArea());
            System.out.println("El Tipo de triangulo es: " + darTipoTriangulo());            
                  
        } else {
            System.out.println("Las coordenadas no indican que es un triangulo");
        }    
    }
     
     
     /**
      * metodo que regresa los puntos en el metodo de la superclase usado
      * para calcular distancia
      * @return super.calcularLado 
      */
     private double lado1(){
         return super.calcularLado(getPuntoA(),getPuntoB() );
     }
     /**
      * metodo que regresa el metodo de la superclase con los valores de la subclase
      * @return  super.calcularLado
      */
     private double lado2(){
         return super.calcularLado(getPuntoB(), this.puntoC);
     }
     /**
      * metodo que regresa el metodo de la superclase con los valores de la subclase
      * @return  super.calcularLado
      */
     private double lado3(){
         return super.calcularLado(this.puntoC,getPuntoA());
     }
     /**
      * metodo que valida si es un triangulo o no segun los lados
      * @return  true
      */
     
     
     public boolean isTriangulo() {
        double pendiente1;
        double pendiente2;
        double pendiente3;
        if( (getPuntoA().getX() == getPuntoB().getX()) && (getPuntoB().getX()== this.puntoC.getX()) ){
            return false;
        } else {
            if ( (getPuntoA().getY() == getPuntoB().getY()) && (getPuntoB().getY() == this.puntoC.getY())) {
                return false;
            }
            /**
             * Aqui se evaluan las pendientes de los puntos del triangulo para determinar si pertenecen a una misma recta
             */
            else {
                pendiente1=(getPuntoB().getY()-getPuntoA().getY()) / getPuntoB().getX() - getPuntoA().getX();
                pendiente2=(puntoC.getY() - getPuntoB().getY()) / (puntoC.getX() - getPuntoB().getX());
                pendiente3=(this.puntoC.getY() - getPuntoA().getY()) / (this.puntoC.getX() - getPuntoA().getX());
                if ((pendiente1==pendiente2)&&(pendiente2==pendiente3)){
                    return false;
                }
                else {
                    if ((pendiente1==pendiente2)||(pendiente2==pendiente3)||(pendiente1==pendiente3)){
                        return false;
                    }
                }
            }  
        }
        return true;      
    }
     
     private double darPerimetro() {
        return lado1() + lado2() + lado3() + super.getPerimetro();
    }
    
    /**
     * Metodo que da el area de un triangulo
     * @return  area
     */
    private int darArea() {
        double s = darPerimetro() / 2;
        double valorLado1 = s - lado1();
        double valorLado2 = s - lado2();
        double valorLado3 = s - lado3();
        double area = Math.sqrt(s * valorLado1 * valorLado2 * valorLado3);
        setArea(area);
        return (int) (area+ super.getArea());
    }
    
    /**
     * Retorna el tipo de triangulo
     * @return TipoTriangulo
     */
    private String darTipoTriangulo() {
        if ((lado1()==lado2())||(lado2()==lado3())||(lado1()==lado3())){
            return "EL TRIANGULO ES ISOSCELES";
        }
        else {
            if ((lado1()!=lado2())&&(lado1()!=lado3())&&(lado3()!=lado2())){
                return "EL TRIANGULO ES ESCALENO";
            }
            else {
                return "EL TRIANGULO ES EQULATERO";
            }
        }   
    }  
     
     /**
      * metodo que regresa el valor del puntoC
      * @return  puntoC
      */
    public Punto getPuntoC() {
        return puntoC;
    }
    /**
     * metodo que recibe el valor de la clase punto PuntoC
     * @param puntoC 
     */
    public void setPuntoC(Punto puntoC) {
        this.puntoC = puntoC;
    }
    
    
    
}
