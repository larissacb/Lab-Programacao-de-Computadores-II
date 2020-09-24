/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;


public abstract class Forma {
    protected float escala;
    protected String cor;
    protected int espessuraLinha;

    //Construtor
    public Forma(float escala, String cor, int espessuraLinha) {    
        this.escala = escala;
        this.cor = cor;
        this.espessuraLinha = espessuraLinha;
    }

    //Getters e setters
    public float getEscala() {
        return escala;
    }

    public void setEscala(float escala) {
        this.escala = escala;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getEspessuraLinha() {
        return espessuraLinha;
    }

    public void setEspessuraLinha(int espessuraLinha) {
        this.espessuraLinha = espessuraLinha;
    }
    
    //Metodos abstratos
    public abstract void desenha();
        
}
