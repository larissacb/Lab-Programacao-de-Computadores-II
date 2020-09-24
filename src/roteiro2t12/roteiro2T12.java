/*
 * Nome: Larissa de Castro Braga - Matricula: 20183000581
 * Eng. Eletrica - 5T34
 */
package roteiro2t12;
import java.util.Scanner;
/**
 *
 * @author aluno
 */
public class roteiro2T12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        ContaBancaria c = new ContaBancaria();
        //===Declaração de variaveis===
        int menu=1, tam=0, a=0;
        boolean aux=true;
        //=============================
        while(aux==true){//Loop para rodar o programa
            if(menu==0){
                aux=false; //programa fecha o loop
            }
            else if(menu==1){ //criar conta
                System.out.println("========Operacao: Criar conta========");
                System.out.println("Digite o nome do cliente:");
                c.setNomeTitular(inp.nextLine());//Leitura da variavel
                
                String string; //declaração da string chamada string que sera usada na leitura de numero da conta e agencia
                do{ //leitura do numero da conta
                    if(a>0) System.out.println("Dado invalido!Digite novamente!"); //condicao para imprimir msg de erro
                    System.out.println("Digite o numero da conta:");
                    string = (inp.nextLine()); //passa o numero da conta para a set e la sao feitos os testes
                    a++;
                }while(!c.setNumeroConta(string)); //se for não falso (vdd) vai ficar em loop no do while
                
                a=0; //variavel usada para a msg de erro
                do{ //leitura do numero da agencia
                    if(a>0)System.out.println("Dado invalido!Digite novamente!"); //condição para imprimir msg de erro
                    System.out.println("Digite o numero da agencia");
                    string = (inp.nextLine());
                    a++;
                }while(!c.setAgencia(string)); //se for nao falso(vdd) vai ficar em loop no do while
                
                double saldoInicial; //declaraçao da variavel que armazenara o valor do saldo inicial qdo a conta for criada
                a=0; //variavel usada para a msg de erro
                do{
                    if(a>0)System.out.println("Dado invalido!Digite novamente!"); //condição para imprimir msg de erro
                    System.out.println("Insira um valor de saldo para abrir a conta:");
                    saldoInicial = inp.nextDouble(); //leitura do valor do saldo
                    a++;
                }while(!c.setDeposito(saldoInicial));
                if(saldoInicial>=1000000.0){
                    System.out.println("================================================================");
                    System.out.println("ATENCAO: O deposito efetuado sera informado ao gerente do banco");
                    System.out.println("================================================================");
                }
                System.out.println("====Conta criada com sucesso!=====");
                System.out.println("Titular: "+c.getNomeTitular());
                System.out.println("Agencia: "+c.getAgencia());
                System.out.println("No. da conta: "+c.getNumeroConta());
                System.out.println("Saldo: R$ "+c.getSaldo());
                System.out.println("==================================");
                menu=4; //volta para o menu
            }
            
            else if(menu==2){ //saque
                System.out.println("========Operacao: Efetuar Saque========");
                System.out.println("Na conta do cliente "+c.getNomeTitular()+" esta disponivel o valor R$ "+c.getSaldo());
                a=0;
                double saque=0.0; //declaração da variavel usada para armazenar o valor desejado de saque
                do{
                   if(a>0)System.out.println("Valor invalido!Digite novamente!"); //condição para imprimir msg de erro
                   System.out.println("Digite o valor de saque: ");
                   saque=inp.nextDouble(); //leitura do valor
                   a++;
                }while(!c.setSaque(saque));
                
                System.out.println("==========Comprovante de saque==========");
                System.out.println("Titular: "+c.getNomeTitular());
                System.out.println("Agencia: "+c.getAgencia());
                System.out.println("No. da conta: "+c.getNumeroConta());
                System.out.println("Valor sacado: R$ "+saque);
                System.out.println("Saldo: R$ "+c.getSaldo());
                System.out.println("========================================");
                menu=4; //volta para o menu de opçoes de acoes
            }
            
            else if(menu==3){ //deposito
                System.out.println("========Operacao: Deposito========");
                System.out.println("Na conta do cliente "+c.getNomeTitular()+" esta disponivel o valor R$ "+c.getSaldo());
                a=0;
                double deposito=0.0; //declaracao da variavel usada na leitura do valor do deposito
                do{
                    if(a>0)System.out.println("Valor invalido!Digite novamente!"); //condição para imprimir msg de erro
                    System.out.println("Digite o valor de deposito: ");
                    deposito=inp.nextDouble(); //leitura do teclado
                    a++;
                }while(!c.setDeposito(deposito));
                
                if(deposito>=1000000.0) { //informacao solicitada pelo prof
                    System.out.println("===============================================================");
                    System.out.println("ATENCAO: O deposito efetuado sera informado ao gerente do banco");
                    System.out.println("===============================================================");
                }
                System.out.println("========Comprovante de deposito========");
                System.out.println("Titular: "+c.getNomeTitular());
                System.out.println("Agencia: "+c.getAgencia());
                System.out.println("No. da conta: "+c.getNumeroConta());
                System.out.println("Valor depositado: R$ "+deposito);
                System.out.println("Saldo: R$ "+c.getSaldo());
                System.out.println("=======================================");
                menu=4; //volta para o menu de opçoes de acoes
            }
            
            else if(menu==4){ //menu
                System.out.println("=======================================");
                System.out.println("Escolha a operacao que deseja fazer");
                System.out.println("2 - Efetuar saque");
                System.out.println("3 - Deposito");
                System.out.println("0 - Sair");
                System.out.println("=======================================");
                menu=(inp.nextInt());//leitura de variavel
            }
            
            else{ //qualquer opcao de menu invalida
                System.out.println("Operacao invalida");
                menu=4; //volta para o menu
            }
        }
        
        
    }
    
}
