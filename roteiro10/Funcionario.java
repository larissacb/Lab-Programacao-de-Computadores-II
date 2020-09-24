/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro10;

public class Funcionario extends Pessoa implements Pagavel{
    private double salarioPorHora;
    private int horasTrabalhadas;
    
    //Construtor
    public Funcionario(double salarioPorHora, int horasTrabalhadas, String nome, int idade) {
        super(nome, idade);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }
    
    //Metodos
    public void imprimeDados(){
        System.out.println("================================");
        System.out.println("==== Ficha do funcionario: ====");
        System.out.println("Nome: "+super.nome);
        System.out.println("Idade: "+super.idade+" anos");
        System.out.println("Salario por hora: "+this.salarioPorHora);
        System.out.println("Horas trabalhadas: "+this.horasTrabalhadas);
        System.out.println("Salario: R$ "+ valorASerPago());
        System.out.println("================================");
    }
    
    //Metodos abstratos implmentados
    @Override
    public void respira(){
        System.out.println("Funcionario respirando...");
    }
    
    @Override
    public double valorASerPago(){
        return this.horasTrabalhadas*this.salarioPorHora;
    }
    
    //Gets e sets
    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
    
}
