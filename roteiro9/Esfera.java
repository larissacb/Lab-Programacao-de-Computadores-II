/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;
import java.math.*;
public class Esfera extends Forma3D{
    private double raio;
    
    //Construtor
    public Esfera(double raio, int posicaoX, int posicaoY, int posicaoZ, float escala, String cor, int espessuraLinha) {
        super(posicaoX, posicaoY, posicaoZ, escala, cor, espessuraLinha);
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
    public void desenha(){
        System.out.println("==== Esfera ====");
    }
    @Override
    public double getAreaSuperficial(){
        return(4*Math.PI*raio*raio*escala);
    }
    @Override
    public double getVolume(){
        return((4/3)*Math.PI*raio*raio*raio*escala);
    }
}
