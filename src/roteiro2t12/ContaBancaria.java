/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro2t12;

/**
 *
 * @author aluno
 */
public class ContaBancaria {
    private String numeroConta;
    private String agencia;
    private String nomeTitular; //(*)
    private double saldo;
    private double deposito;
    private double saque;
    public void setNomeTitular(String nometitular){ //Como nome do titular e privado para a main e e algo que posso querer alterar eu preciso de metodo (**)
        this.nomeTitular = nometitular; //1o nome titular se refere a (*) e o 2o refere-se ao (**)
    }
    public String getNomeTitular(){
        return nomeTitular;
    }
    
    public boolean setNumeroConta(String numeroconta){
        this.numeroConta = numeroconta; //recebe o valor da main e atribui ao que esta na classe
        int tam=(this.numeroConta.length()); //calculo o tamanho da string
        boolean teste=true;
        for(int i=0;i<tam;i++){
                if((this.numeroConta.charAt(i)>='0')&&(this.numeroConta.charAt(i)<='9')) teste=true;
                else {
                teste=false;
                i=(tam-1);//se tiver um caractere diferente de numero o for ja deve ser parado
                }
        }
        if(tam!=6 || teste==false) teste=false; //condiçoes finais para avaliar os dados digitados
        else teste=true;
        return teste;
    }
    public String getNumeroConta(){
        return numeroConta;
    }
    
    public boolean setAgencia(String agencia){
        this.agencia = agencia;
        int tam=(this.agencia.length()); //calcula o tamanho da string
        boolean testeTraco = false, testeTam=false, testeNumerico=false;
        if(tam!=6) testeTam=false;
        else testeTam=true;
        
        if(testeTam==true){
            if(this.agencia.charAt(4)=='-') testeTraco = true;
            else testeTraco=false;
        }

        if(testeTraco==true){ //significa que tem o caractere traço - no numero da agencia
            for(int i=0;i<4;i++){
                if((this.agencia.charAt(i)>='0')&&(this.agencia.charAt(i)<='9')) testeNumerico=true;
                else {
                testeNumerico=false;
                i=(tam-1);//se tiver um caractere diferente de numero o for ja deve ser parado
                }
            }
        }
        
        boolean testeFinal=false;
        if(testeNumerico==true){ //significa que todos os numeros da parte inicial da agencia estao ok
            if(this.agencia.charAt(5)=='x'||(this.agencia.charAt(5)>='0'&& this.agencia.charAt(5)<='9')) testeFinal=true;
            else testeFinal=false;
        }
        boolean teste=(testeTam && testeTraco && testeNumerico && testeFinal); //faço uma porta and com todos os testes
        return teste;
        
    }
    public String getAgencia(){
        return agencia;
    }
    
    private void setSaldo(double saldo1){ //foi alterado para atender as especificações do programa 
        this.saldo = saldo1;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean setDeposito(double deposito){
        boolean teste = false;
        this.deposito = deposito;
        
        if(this.deposito<=0.0) teste=false; //teste para valores validos de dinheiro depositdo
        else {
            teste=true;
            this.saldo+=this.deposito; //se o valor depositado for valido soma ao saldo
        }
        return teste;
    }
    public boolean setSaque(double saque){
        boolean teste1 = false;
        boolean teste2 = false;
        this.saque=saque;
        if(this.saque>this.saldo) teste1=false; //valor desejado de saque indesejado !falso = true
        else{
            teste1=true;
            //this.saldo-=this.saque; //se for um valor valido, retira o valor sacado do saldo da conta
        }  
        if(this.saque<=0.0) teste2=false;
        else teste2=true;
        
        boolean teste=(teste1 && teste2);
        if (teste==true) this.saldo-=this.saque;
        return teste;
    }
}
