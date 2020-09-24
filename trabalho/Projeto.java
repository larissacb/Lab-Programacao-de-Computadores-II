/*
 * ===== Trabalho Pratico de Programacao de Computadores 2 =====
 * Alunos: 
 * Douglas Fernandes da Costa
 * Gabriel Melo Sette Ataíde Arantes
 * Larissa de Castro Braga
 * Lucas Coelho de Lima
 */

package trabalho;

public class Projeto {
    private int codigo;
    private String nome;
    private int horas;

    public Projeto() { //Construtor vazio 
    }

    public Projeto(int codigo, String nome, int horas) { //Construtor que recebe parametros
        this.codigo = codigo;
        this.nome = nome;
        this.horas = horas;
    }
    public Projeto(int codigo){ //Método que recebe o codigo do projeto
        this.codigo = codigo;
    }
    //Getters e Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
