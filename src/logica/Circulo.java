/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

public class Circulo extends FigurasGeometricas{
    static final double PI=3.141592; //Variable tipo final y estatica compartida para todas las clases y objetos
    /**
     * metodo constructor que inicializa atributos y llama a los atributos de la superclase
     * @param puntoA
     * @param puntoB
     * 
     */
    public Circulo(Punto puntoA, Punto puntoB) {
        super(puntoA, puntoB); //Aqui se llama a la superclase
        calcularArea();
        calcularPerimetro();
        calcularRadio();
    }
        
        /**
         * metodo que regresa a la funcion de la superclase los puntos
         * @return  super
         */
        private void calcularDistanciaPuntos(){
             super.calcularLado(getPuntoA(), getPuntoB());
        }
        
        private void calcularRadio(){
            super.setRadio(super.calcularLado(getPuntoA(), getPuntoB()) / 2);
        }
      /**
       * metodo que regresa el resultado del area
       * @return  PI*Math.pow(radio,2);
       */
      private void calcularArea(){
           super.setArea(PI*Math.pow(super.calcularLado(getPuntoA(), getPuntoB())/2,2));
      }
      /**
       * Metodo que calcula el perimetro y lo retorna
       * @return 2*PI*radio;
       */
       private void calcularPerimetro(){
          super.setPerimetro(2*PI * super.calcularLado(getPuntoA(), getPuntoB()) / 2);
      }
       /**
        * metodo que calcula el diametro y lo retorna
        * @return radio*2;
        */
       private double calcularDiametro(){
          return super.calcularLado(getPuntoA(), getPuntoB()) / 2 * 2;
      }

}

