/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;


public abstract class Forma2D extends Forma {
    protected int posicaoX;
    protected int posicaoY;
    
    //Constutor
    public Forma2D(int posicaoX, int posicaoY, float escala, String cor, int espessuraLinha) {
        super(escala, cor, espessuraLinha);
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
    }
       
    //Getters e setters
    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }
    
    //Metodos abstratos
    public abstract double getPerimetro();
    public abstract double getArea();
    
    @Override
    public void desenha(){
        
    }
}
