/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;

public class Paralelepipedo extends Forma3D {
    private double aresta1;
    private double aresta2;
    private double aresta3;
    //Construtor
    public Paralelepipedo(double aresta1, double aresta2, double aresta3, int posicaoX, int posicaoY, int posicaoZ, float escala, String cor, int espessuraLinha) {
        super(posicaoX, posicaoY, posicaoZ, escala, cor, espessuraLinha);
        this.aresta1 = aresta1;
        this.aresta2 = aresta2;
        this.aresta3 = aresta3;
    }
    
    
    //Get e set
    public double getAresta1() {
        return aresta1;
    }

    public void setAresta1(double aresta1) {
        this.aresta1 = aresta1;
    }

    public double getAresta2() {
        return aresta2;
    }

    public void setAresta2(double aresta2) {
        this.aresta2 = aresta2;
    }

    public double getAresta3() {
        return aresta3;
    }

    public void setAresta3(double aresta3) {
        this.aresta3 = aresta3;
    }
    
    @Override
    public void desenha(){
        System.out.println("==== Paralelepipedo ====");
    }
    @Override
    public double getAreaSuperficial(){
        return(2*(aresta1*aresta2 + aresta1*aresta3 + aresta2*aresta3)*escala);
    }
    @Override
    public double getVolume(){
        return(aresta1*aresta2*aresta3*escala);
    }
}
