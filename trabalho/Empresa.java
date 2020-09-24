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

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private ArrayList<Funcionario> funcionarios; //Utilização de ArrayList para melhor organização dos dados armazenados
    public Empresa() { //Construtor vazio
         funcionarios = new ArrayList<Funcionario>();
    }

    public Empresa(String cnpj, String razaoSocial) {   //Construtor com passagem de parametros
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        funcionarios = new ArrayList<Funcionario>();
    }   
    //Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Funcionario getFuncionario(int i) {
        return funcionarios.get(i);
    }
    //Outros metodos
    public Funcionario getFuncionarioPeloNum(int numFun) {  //Método que acessará o ArrayList de funcionarios pelo numero do funcionario
        int indice=0;
        for(int i=0;i<funcionarios.size();++i){ //Percorre o Array 
            if(funcionarios.get(i).getNumero()==numFun) //Comparação para encontrar o funcionario pretendido
                indice=i;
                break;
        }
        return funcionarios.get(indice);//Retorna o funcionario desejado
    }
    
    public boolean existeFuncionario(int numFun) { //Método que verifica a existência do funcionário 
        for(int i=0;i<funcionarios.size();++i){  //Percorre o Array de Funcionario
            if(funcionarios.get(i).getNumero()==numFun) //Comparação para encontrar o funcionario pretendido
                return true; //Retorna verdadeiro caso encontrado
        }
        return false; //Retorna falso caso não seja encontrado 
    }

    public void addFuncionario(Funcionario f){ //Método que adiciona um novo funcionário
        if(funcionarios.size()<100) //Condição que verifica se existe menos de 100 funcionarios na empresa
            funcionarios.add(f);                                                
        else
            System.out.println("Não foi possível adicionar funcionario");  //Mensagem para informar o usuario que não foi possível adicionar o funcionário 
       
    }
    
    public void delFuncionario(int c){ //Método que remove um funcionario da empresa
        if(funcionarios.size()<=100 && funcionarios.size()>0) //Condição que verifica se o numero de funcionários da empresa está entre 0 e 100 funcionários
            funcionarios.remove(c);
        else
            System.out.println("Não foi possível remover funcionario");  //Mensagem para informar o usuario que não foi possível remover o funcionário
    }
    
    public void imprimeFuncionarios(){ //Método que imprime os dados Funcionarios
        for(int i=0;i<funcionarios.size();++i){//Percorre o ArrayList de Funcionarios
            System.out.println("===== Funcionário " + (i+1) + " =====");
            System.out.println("Número do funcionário" + (i+1) + ": " + funcionarios.get(i).getNumero());
            System.out.println("Nome do funcionário" + (i+1) + ": " + funcionarios.get(i).getNome());
            System.out.println("Endereco do funcionário " + (i+1) + ": " + funcionarios.get(i).getEndereco());
            System.out.println("No. de dependentes do funcionário"  + (i+1) + ": " + funcionarios.get(i).getDependentes());
        }
    }
    
    public int tamArrayList(){ //Método para descobrir o tamanho do ArrayList
        return funcionarios.size(); //Retorna o tamanho
    }
    
    public void exclusaoProjeto(int i){ //Método para excluir um funcionario sem projetos 
        if(funcionarios.get(i).tamArrayListProjetos()<=0){ //Se o funcionario na posiçao tiver um ArrayList de projetos de tamanho 0 ele é excluido da empresa
            funcionarios.remove(i);
        }
    }
    public boolean encontraFuncionario(int num){   //Método para procura de um funcionário
        for(int i=0; i<funcionarios.size(); i++){ //Percorre o ArrayList de Funcionarios
            if(funcionarios.get(i).getNumero() == num){ //Condição que verifica a existencia de um funcionário com este número
                //-----Impressao dos dados do funcionario encontrado-----//
                System.out.println("===== Funcionario encontrado ====="); 
                System.out.println("Nome: "+funcionarios.get(i).getNome());
                System.out.println("Endereco: "+funcionarios.get(i).getEndereco());
                System.out.println("No. de dependentes: "+funcionarios.get(i).getDependentes());
                return true; //Retorna verdadeiro caso o funcionario for encontrado
            }   
        }
        return false; //Retorna falso caso o funcionario não seja encontrado
    }
    
    public int dependente(int i){  //Método que retorna a quantidade dependentes do funcionário 
        return funcionarios.get(i).getDependentes();
    }
    
}