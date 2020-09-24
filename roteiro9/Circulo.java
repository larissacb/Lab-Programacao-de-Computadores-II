/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;
import java.math.*;
public class Circulo extends Forma2D {
   private double raio;
   //Construtor

    public Circulo(double raio, int posicaoX, int posicaoY, float escala, String cor, int espessuraLinha) {
        super(posicaoX, posicaoY, escala, cor, espessuraLinha);
        this.raio = raio;
    }
    
    //Get e set
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
     //Metodos
    @Override
    public double getPerimetro(){
        return (2*Math.PI*raio*escala);
    }
    @Override
    public double getArea(){
        return(Math.PI*raio*raio*escala);
    }
    @Override
    public void desenha(){
        System.out.println("==== Circulo ====");
    }
   
}
