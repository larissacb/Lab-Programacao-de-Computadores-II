/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro4t12;

/**
 *
 * @author laris
 */
import java.util.Scanner;
public class Fabrica {
    private String nome;
    private int numFuncionarios;
    private Funcionario[] funcionario;
    private int numProdutos;
    private Produto[] produto;
    
    public void Fabrica(){
        
    }
    public void Fabrica(String nome){
        this.nome=nome;
    }
    
    public void AddFuncionario(Funcionario novoFuncionario){
        //variaveis
        String s;
        int a=0;
        float num;
        
        //construtores
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();
        
        funcionario = new Funcionario[this.getNumFuncionarios()]; ///alocacao de memoria para o vetor de funcionarios
        //loop para a obtencao dos dados dos funcionarios
        for(int i=0;i<this.getNumFuncionarios();i++){
            this.funcionario[i]= new Funcionario(); //referencia do construtor
            
            //nome
            System.out.println("Digite o nome do(a) "+(i+1)+"o funcionario(a)");
            funcionario[i].setNome(leia.nextLine());
            //id
            System.out.println("Digite a ID do(a) "+(i+1)+"o funcionario(a)"); 
            funcionario[i].setId(leia.nextLine());
            //cargo
            System.out.println("Digite o cargo do(a) "+(i+1)+"o funcionario(a)");
            funcionario[i].setCargo(leia.nextLine());
            //salario
            System.out.println("Digite o salario do(a) "+(i+1)+"o funcionario(a)");
            funcionario[i].setSalario(leia.nextFloat());
            leia.nextLine(); //limpa o buffer
        }
        
    }
    
    public void AddProduto(Produto novoProduto){
        //variaveis
        String s;
        int a=0;
        float num;
        
        //construtores
        Scanner leia = new Scanner(System.in);
        Produto prod = new Produto();
        
        produto = new Produto[this.getNumProdutos()]; //alocacao de memoria do vetor de produtos
        
        //loop para obtencao dos dados dos produtos da fabrica
        for(int i=0;i<this.getNumProdutos();i++){
            this.produto[i]= new Produto(); //referencia do construtor
            //nome do produto
            System.out.println("Digite o nome do "+(i+1)+"o produto:");
            produto[i].setNome(leia.nextLine());
            //valor de producao
            System.out.println("Digite o valor de producao do "+(i+1)+"o produto:");
            produto[i].setValorProducao(leia.nextFloat());
            //valor de venda
            System.out.println("Digite o valor de venda do "+(i+1)+"o produto:");
            produto[i].setValorVenda(leia.nextFloat());
            leia.nextLine(); //limpa o buffer
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        this.nome = nome;
        int tam=0;
        tam=this.nome.length();
        if(tam<=0) return false; //nao falso e vdd
        else return true; //nao vdd e falso
    }

    public int getNumFuncionarios() {
        return numFuncionarios;
    }

    public boolean setNumFuncionarios(int numFuncionarios) {
        this.numFuncionarios = numFuncionarios;
        if(this.numFuncionarios<=0) return false; //nao falso e vdd
        else return true; //nao vdd e falso
    }

    public Funcionario getFuncionario(int indice){
        return funcionario[indice];
    }
    
    public Produto getProduto(int indice){
        return produto[indice];
    }

    public int getNumProdutos() {
        return numProdutos;
    }

    public boolean setNumProdutos(int numProdutos) {
        this.numProdutos = numProdutos;
        if(this.numProdutos<=0) return false; //nao falso e vdd
        else return true; //nao vdd e falso
    }
    
    
}
