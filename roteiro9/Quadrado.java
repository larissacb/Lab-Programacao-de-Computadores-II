/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;

public class Quadrado extends Forma2D{
    private double lado;
    //Construtor 
    public Quadrado(double lado, int posicaoX, int posicaoY, float escala, String cor, int espessuraLinha) {
        super(posicaoX, posicaoY, escala, cor, espessuraLinha);
        this.lado = lado;
    }
    
    //Get e set
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Metodos
    @Override
    public double getPerimetro(){
        return (4*lado*escala);
    }
    @Override
    public double getArea(){
        return(lado*lado*escala);
    }
    @Override
    public void desenha(){
        System.out.println("==== Quadrado ====");
    }
    
}
