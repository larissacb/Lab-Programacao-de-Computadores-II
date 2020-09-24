/*
 * ===== Trabalho Pratico de Programacao de Computadores 2 =====
 * Alunos: 
 * Douglas Fernandes da Costa
 * Gabriel Melo Sette Ataíde Arantes
 * Larissa de Castro Braga
 * Lucas Coelho de Lima
 */
package trabalho;
import java.util.Scanner;

public class Trabalho {

    public static void menu(){
        System.out.println("\tOpções do menu principal ");
        System.out.println("1 - Inclusão de um novo funcionário");
        System.out.println("2 - Inclusão de novos projetos para um funcionário");
        System.out.println("3 - Exclusão de projetos de um funcionário");
        System.out.println("4 - Exclusão de funcionários que não trabalham em nenhum projeto");
        System.out.println("5 - Consulta de um funcionário");
        System.out.println("6 - Imprimir contra-cheque");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");
        }
    
    public static void inclusaoFuncionario(Empresa em){ //Método que inclui Funcionários na Empresa
        Scanner entrada = new Scanner(System.in); //Declaração do Scanner
        System.out.println("=================================");
        //Recolhimento dos Dados do funcionário
        System.out.print("Digite o número do funcionário: ");     
        int numero=entrada.nextInt();
        System.out.print("Digite o nome do funcionário: ");
        entrada.nextLine();
        String nome=entrada.nextLine();
        System.out.print("Digite o endereço do funcionário: ");
        String endereco=entrada.nextLine();
        System.out.print("Digite o número de dependentes do funcionário: ");
        int dependentes=entrada.nextInt();
        Funcionario f=new Funcionario(numero,nome,endereco,dependentes); //Passagem de parametros do novo funcionario 
        em.addFuncionario(f); //Adiciona-se o Funcionario ao ArrayList de funcionarios
        System.out.print("Em quantos projetos o funcionário trabalha?: ");
        int numProjetos=entrada.nextInt();
        for(int i=0;i<numProjetos;++i){ //Loop para adicionar o numero de projetos informado ao funcionario
            System.out.println("===== Adicioando projeto " + (i+1) + " =====");
            System.out.print("Digite o código do projeto " + (i+1) + ": ");
            int codigo=entrada.nextInt();
            System.out.print("Digite o nome do projeto " + (i+1) + ": ");
            entrada.nextLine();
            String nomeProjeto=entrada.nextLine();
            System.out.print("Digite o número de horas trabalhadas por semana no projeto " + (i+1) + ": ");
            int horas=entrada.nextInt();
            Projeto p=new Projeto(codigo,nomeProjeto,horas); //Passagem de parametros do novo projeto adicionado
            em.getFuncionario(Funcionario.getNumFuncionario()-1).addProjeto(p); //Adiciona-se o Projeto ao ArrayList de funcionarios
        }
    }
    
    public static void inclusaoProjetosFuncionario(Empresa em){ //Inclusão de novos projetos ao Funcionario
        Scanner entrada = new Scanner(System.in);//Declaração do Scanner
        System.out.println("================================="); 
        //Recolhimento dos Dados do novo Projetos
        System.out.print("Número do funcionário para o qual se deseja acrescentar novos projetos: ");
        int numFunAddProj = entrada.nextInt();
        if(em.existeFuncionario(numFunAddProj)==true){ //Verificação da existencia do funcionario para adicionar o novo Projeto
           //Impresão dos projetos dos quais o funcionário já faz parte
            System.out.println("O nome do funcionário: " + em.getFuncionarioPeloNum(numFunAddProj).getNome());
            System.out.println("O endereço do funcionário: " + em.getFuncionarioPeloNum(numFunAddProj).getEndereco());
            System.out.println("O número de dependentes do funcionário: " + em.getFuncionarioPeloNum(numFunAddProj).getDependentes());
            em.getFuncionarioPeloNum(numFunAddProj).imprimeProjetos();
            int numProjetos;
            do{
                System.out.print("Quantos projetos você deseja adicionar para funcionário ?: ");
                numProjetos=entrada.nextInt();
                if(numProjetos+em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()>5) //Condição que impede que alguém tenha mais de 5 projetos
                    System.out.println("Não é possível adicionar esse número de projetos"); //Mensagem para informar o usuario que não foi possível adicionar o projeto 
            }while(numProjetos+em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()>5);
            
            for(int i=0;i<numProjetos;++i){
                System.out.println("===== Incluindo projeto " + (em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()+1) + " =====");
                System.out.print("Digite o código do projeto " + (em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()+1) + ": ");
                int codigo=entrada.nextInt();
                System.out.print("Digite o nome do projeto " + (em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()+1) + ": ");
                entrada.nextLine();
                String nomeProjeto=entrada.nextLine();
                System.out.print("Digite o número de horas trabalhadas por semana no projeto " + (em.getFuncionarioPeloNum(numFunAddProj).getProjetos().size()+1) + ": ");
                int horas=entrada.nextInt();
                Projeto p=new Projeto(codigo,nomeProjeto,horas);
                em.getFuncionarioPeloNum(numFunAddProj).addProjeto(p);             
            }
        }
        else System.out.println("===== Funcionário nao existe no sistema =====");
    }
    
    public static void exclusaoProjetosFuncionario(Empresa em){ //Método para excluir o Projetos
        Scanner entrada = new Scanner(System.in);//Declaração do Scanner
        System.out.println("=================================");
        System.out.print("Numero do funcionário que deseja remover projetos: ");
        int numFunc = entrada.nextInt();
        if(em.existeFuncionario(numFunc)== true){ //Verificação da existencia do funcionário
            //Imprime os projetos do funcionario para o usuario escolher qual deles quer remover
            System.out.println("O nome do funcionário: " + em.getFuncionarioPeloNum(numFunc).getNome());
            System.out.println("====== Projetos do funcionário ======");
            em.getFuncionarioPeloNum(numFunc).imprimeProjetos();
            System.out.print("Informe o codigo do projeto que deseja remover: ");
            int proj = entrada.nextInt();
            em.getFuncionarioPeloNum(numFunc).delProjeto(proj); //Apaga o projeto do funcionario
        }
        else System.out.println("===== Funcionário nao existe no sistema =====");
    }
    
    public static void exclusaoFuncionarioSemProjetos(Empresa em){ //Método para excluir funcionarios sem projetos
        for(int i=0; i<em.tamArrayList(); i++){ //Percorre o ArrayList de funcionarios
            em.exclusaoProjeto(i); //Passo como parametro a posicao iniciada no for
        }
    }
    
    public static void consultaFuncionario(Empresa em){ //Método que verifica um funcionário
        Scanner entrada = new Scanner(System.in); //Declaração do Scanner
        System.out.println("=================================");
        System.out.print("Informe o codigo do funcionario: ");
        int codigo = entrada.nextInt();
        boolean existe = em.encontraFuncionario(codigo); 
        if(existe==true) em.getFuncionarioPeloNum(codigo).imprimeProjetos();
        else System.out.println("===== Funcionário procurado nao existe no sistema =====");
    }
        
    public static void imprimirContraCheque(Empresa em){ //Método que Imprime o Contra Cheque 
        Scanner entrada = new Scanner(System.in); //Declaração do Scanner
        double dependente=0;
        double horas=0;
        double salarioBruto=0;
        for(int i=0; i<em.tamArrayList(); i++){ //Percorre o ArrayList de Funcionarios
            for(int j=0; j<em.getFuncionario(i).tamArrayListProjetos();j++){ //Percorre o ArrayList de projetos de cada funcionario
                dependente=em.getFuncionario(i).getDependentes();
                horas+=em.getFuncionario(i).getProjetos(j).getHoras();  
            }
            //Impressão dos dados
            System.out.println("");
            System.out.println("=================================");
            System.out.println("Funcionario: "+em.getFuncionario(i).getNome());
            System.out.println("No: "+em.getFuncionario(i).getNumero());
            System.out.println("Total de horas semanais: "+horas);
            horas*=45;
            dependente*=25;
            salarioBruto=horas+dependente;
            System.out.println("Salário bruto: "+salarioBruto);
            System.out.println("Desconto INSS: "+(0.085*salarioBruto));
            System.out.println("Desconto IR: "+(0.15*salarioBruto));
            System.out.println("=================================");
            horas=0; dependente=0; salarioBruto=0;
        }
        horas=0; dependente=0; salarioBruto=0;
    }
    
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in); //Declaração do consturutor do Scanner
      //Recolhimento dos dados da Empresa
      System.out.print("Digite o CNPJ da empresa: ");
      String cnpj = entrada.nextLine();
      System.out.print("Digite o Razão Social da empresa: ");
      String razaoSocial = entrada.nextLine();
      Empresa em = new Empresa(cnpj,razaoSocial); //Declaração do Construtor  
      int op_inicial;
      System.out.println("=================================");
      //====Loop do Menu====
      do{
          menu();
          op_inicial=entrada.nextInt();
          switch(op_inicial){
              case 0: break;
              case 1: inclusaoFuncionario(em); break;
              case 2: inclusaoProjetosFuncionario(em); break;
              case 3: exclusaoProjetosFuncionario(em); break;
              case 4: exclusaoFuncionarioSemProjetos(em); break;
              case 5: consultaFuncionario(em); break;
              case 6: imprimirContraCheque(em); break;
              default: System.out.println("===== Opção inválida =====");
          }
      }while(op_inicial!=0);
    }
    
}