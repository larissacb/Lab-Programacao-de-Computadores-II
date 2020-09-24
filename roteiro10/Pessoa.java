/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro10;

public abstract class Pessoa implements Animal{
    protected String nome;
    protected int idade;
    
    //Construtor
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    //Metodo abstrato
    public abstract void imprimeDados();
    
}
