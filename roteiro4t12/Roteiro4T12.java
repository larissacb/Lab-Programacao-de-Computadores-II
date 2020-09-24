/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro4t12;

/**
 *
 * @author laris
 */
import java.util.Scanner;
public class Roteiro4T12 {

    /**
     * @param args the command line arguments
     */
    private static Funcionario funcionario;
    private static Produto produto;
    
    public static void main(String[] args) {
        //variaveis
        String s;
        int a=0, num1, menu;
        boolean aux = true;
        
        //construtores
        Scanner leia = new Scanner(System.in);
        Funcionario func = new Funcionario();
        Produto prod = new Produto();
        Fabrica fabrica = new Fabrica();
        Balanco balanco = new Balanco();
        
        //inicio do programa
        System.out.println("======Sistema da fabrica======");
        //nome da fabrica
        a=0;
        do{
            if(a>0) System.out.println("Inf. invalida!Digite novamente!");
            System.out.println("Digite o nome da fabrica:");
            s=leia.nextLine();
            a++;
        }while(!fabrica.setNome(s));
        //numero de funcionarios
        a=0;
        do{
            if(a>0) System.out.println("Inf. invalida!Digite novamente!");
            System.out.println("Digite o numero de funcionarios:");
            num1=leia.nextInt();
            a++;
        }while(!fabrica.setNumFuncionarios(num1));
        //passagem dos parametros dos funcionarios
        fabrica.AddFuncionario(funcionario); //chamo a funcao de add funcionario

        //numero de produtos
        a=0;
        do{
            if(a>0) System.out.println("Inf. invalida!Digite novamente!");
            System.out.println("Digite o numero de produtos:");
            num1=leia.nextInt();
            a++;
        }while(!fabrica.setNumProdutos(num1));
        
        fabrica.AddProduto(produto); //chamo a funcao de add produto
        
        while(aux==true){
            System.out.println("Escolha a Inf. que deseja visualizar:");
            System.out.println("================================================");
            System.out.println("1 - Inf. dos funcionarios");
            System.out.println("2 - Inf. dos produtos comercializados");
            System.out.println("3 - Gasto com salario dos funcionarios");
            System.out.println("4 - Venda dos produtos e gasto com producao");
            System.out.println("5 - Balanco final");
            System.out.println("0 - Sair");
            menu=leia.nextInt();
            switch(menu){
                case 0: //sair
                    aux=false;
                    break;
                    
                case 1: //informacoes dos funcionarios
                    for(int i=0;i<fabrica.getNumFuncionarios();i++){
                    System.out.println("================================================");
                    System.out.println("Funcionario No. "+(i+1));
                    System.out.println("Nome: "+fabrica.getFuncionario(i).getNome());
                    System.out.println("ID: "+fabrica.getFuncionario(i).getId());
                    System.out.println("Cargo: "+fabrica.getFuncionario(i).getCargo());
                    System.out.println("Salario: R$ "+fabrica.getFuncionario(i).getSalario());
                    System.out.println("================================================");
                    }
                    break;
                
                case 2: //informacoes dos produtos
                    for(int i=0;i<fabrica.getNumProdutos();i++){
                        System.out.println("================================================");
                        System.out.println("Produto No. "+(i+1));
                        System.out.println("Nome: "+fabrica.getProduto(i).getNome());
                        System.out.println("Valor de producao: R$ "+fabrica.getProduto(i).getValorProducao());
                        System.out.println("Valor de venda: R$ "+fabrica.getProduto(i).getValorVenda());
                        System.out.println("================================================");
                    }
                    break;
                    
                case 3: //gasto com salario de funcionarios
                    balanco.CalculaGastoComSalarios();
                    break;
                    
                case 4: //venda de produtos e gasto com producao
                    balanco.CalculaGanhoComVendas();
                    balanco.CalculaGastoComProducao(); //precisa calcular os 2 juntos por causa do vetor
                    break;
                    
                case 5: //balanco final
                    balanco.imprimeBalancoFinal();
                    break;
                default: 
                    System.out.println("Opcao invalida! Digite novamente!");
                    break;     
            }
        }
        
    }
}