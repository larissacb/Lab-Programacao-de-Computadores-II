/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;


public abstract class Forma3D extends Forma{
    protected int posicaoX;
    protected int posicaoY;
    protected int posicaoZ;
    
    //Construtor
    public Forma3D(int posicaoX, int posicaoY, int posicaoZ, float escala, String cor, int espessuraLinha) {    
        super(escala, cor, espessuraLinha);
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.posicaoZ = posicaoZ;
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

    public int getPosicaoZ() {
        return posicaoZ;
    }

    public void setPosicaoZ(int posicaoZ) {
        this.posicaoZ = posicaoZ;
    }
    
    //Metodos abstratos
    public abstract double getAreaSuperficial();
    public abstract double getVolume();
    
    @Override
    public void desenha(){
        
    }
    
}
