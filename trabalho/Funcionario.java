/*
 * ===== Trabalho Pratico de Programacao de Computadores 2 =====
 * Alunos: 
 * Douglas Fernandes da Costa
 * Gabriel Melo Sette Ataíde Arantes
 * Larissa de Castro Braga
 * Lucas Coelho de Lima
 */
package trabalho;
import java.util.ArrayList;

public class Funcionario {
    private int numero;
    private String nome; 
    private String endereco;
    private int dependentes;
    private ArrayList<Projeto> projetos; //Utilização de ArrayList para melhor organização dos dados armazenados
    private static int numFuncionario; //Váriavel estática para efetuar a contagem       
    public Funcionario() { //Construtor vazio, faz contagem do numero de Fucionarios 
        projetos = new ArrayList<>();
        ++numFuncionario;
    }

    public Funcionario(int numero, String nome, String endereço, int dependentes) { //Construtor que recebe parametros e faz contagem do numero de Funcionarios
        this.numero = numero;
        this.nome = nome;
        this.endereco = endereço;
        this.dependentes = dependentes;
        projetos = new ArrayList<>();
        ++numFuncionario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
//Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereço) {
        this.endereco = endereço;
    }

    public int getDependentes() {
        return dependentes;
    }

    public void setDependentes(int dependentes) {
        this.dependentes = dependentes;
    }

    public ArrayList<Projeto> getProjetos() {
        return projetos;
    }
    
    public static int getNumFuncionario(){
        return numFuncionario;
    }

    public static void setNumFuncionario(int numFuncionario) {
        Funcionario.numFuncionario = numFuncionario;
    }
    
    public void addProjeto(Projeto p){  //Método que adiciona um projeto
        if(projetos.size()<5) //Condição que impede que alguém tenha mais de 5 projetos
            projetos.add(p);
        else
            System.out.println("Não foi possível adicionar projeto"); //Mensagem para informar o usuario que não foi possível adicionar o projeto 
        
    }
    
    public void delProjeto(int c){ //Método que apaga um projeto    
         if(projetos.size()<=5 && projetos.size()>0) //Condição que impede que o usuario tenha um numero negativo de projetos
            projetos.remove(c);
        else
            System.out.println("Não foi possível remover projeto");  //Mensagem para informar o usuario que não foi possível remover o projeto 
    }
    
    public void imprimeProjetos(){ //Método que imprime os projetos de um funcionário
        for(int i=0;i<projetos.size();++i){  //Percorre o Array de projetos                    
            System.out.println("===== Projeto " + (i+1) + " =====");
            System.out.println("O código do projeto " + (i+1) + " : " + projetos.get(i).getCodigo());
            System.out.println("O nome do projeto " + (i+1) + " : " + projetos.get(i).getNome());
            System.out.println("As horas trabalhadas no projeto "  + (i+1) + " : " + projetos.get(i).getHoras());
        }
    }
    
    public int tamArrayListProjetos(){ //Método para retornar o tamanho do ArrayList de Projetos
        return projetos.size();
    }
    
    public Projeto getProjetos(int j) { //Método para pegar uma posição específica do ArrayList de Projetos 
        return projetos.get(j);
    }
    
}
