/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro4t12;

import java.util.Scanner;

/**
 *
 * @author laris
 */
public class Balanco {
    private Fabrica fabrica;
    private float despesaTotalSalarios;
    private int[] qtddVendidaPorProduto;
    private float despesaTotalProducao;
    private float receitaTotalVendas;
    
    public void Balanco(Fabrica fabrica){
        this.fabrica=fabrica;
    }
    
    public void CalculaGastoComSalarios(){
        //construtores
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();
        Produto prod = new Produto();
        Fabrica fabrica = new Fabrica();
        
        for(int a=0;a<fabrica.getNumFuncionarios();a++){
            this.despesaTotalSalarios+=(fabrica.getFuncionario(a).getSalario());
        }
        
        System.out.println("================================================");
        System.out.println("Gasto com salario de funcionarios: R$ "+this.despesaTotalSalarios);
        System.out.println("================================================");
    }
    
    public void CalculaGastoComProducao(){
        //variaveis
        this.despesaTotalProducao=0;
        
        //construtores
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();
        Produto prod = new Produto();
        Fabrica fabrica = new Fabrica();
        
        for(int a=0;a<fabrica.getNumProdutos();a++){
            this.despesaTotalProducao+=(fabrica.getProduto(a).getValorProducao()*this.qtddVendidaPorProduto[a]);
        }
        
        System.out.println("================================================");
        System.out.println("Gasto com producao do(s) produto(s): R$ "+this.despesaTotalProducao);
        System.out.println("================================================");
    }
    
    public void CalculaGanhoComVendas(){
        //variaveis
        this.receitaTotalVendas=0;
        
        //construtores
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();
        Produto prod = new Produto();
        Fabrica fabrica = new Fabrica();
        this.qtddVendidaPorProduto = new int[fabrica.getNumProdutos()]; //alocacao de memoria para o vetor
        
        for(int i=0;i<fabrica.getNumProdutos();i++){
            System.out.println("Informe a Qtde. de itens vendidos do produto "+(i+1));
            this.qtddVendidaPorProduto[i]=leia.nextInt();   
            this.receitaTotalVendas+=(this.qtddVendidaPorProduto[i]*fabrica.getProduto(i).getValorVenda()); //multiplico a qtde de produtos vendida pelo preco unitario
        }
        
        System.out.println("================================================");
        System.out.println("Ganho com a venda do(s) produto(s): R$ "+this.receitaTotalVendas);
        System.out.println("================================================");
        
    }
    
    public String getNomeFabrica(){
        Fabrica fabrica = new Fabrica();
        return fabrica.getNome();
    }
    
    public float getDespesaTotalProducao(){
        return despesaTotalProducao;
    }
    
    public float getDespesaTotalSalarios(){
        return this.despesaTotalSalarios;
    }
    
    public float getReceitaTotalVendas(){
        return this.receitaTotalVendas;
    }
    
    public float getLucro(){
        float gastos;
        float lucro;
        gastos=this.despesaTotalSalarios+this.despesaTotalProducao;
        lucro = (this.receitaTotalVendas)-(gastos);
        return lucro;
    }
    
    public void imprimeBalancoFinal(){
        System.out.println("================================================");
        System.out.println("Gasto com salario de funcionarios: R$ "+despesaTotalSalarios);
        System.out.println("================================================");
        System.out.println("Gasto com producao do(s) produto(s): R$ "+despesaTotalProducao);
        System.out.println("================================================");
        System.out.println("Ganho com a venda do(s) produto(s): R$ "+receitaTotalVendas);
        System.out.println("================================================");
        if(getLucro()<0) System.out.println("Prejuizo: R$ "+getLucro());
        else System.out.println("Lucro: R$ "+getLucro());
        System.out.println("================================================");
        
    }
    
}