/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro10;

import java.util.Scanner;
import java.util.ArrayList;

public class Roteiro10 {

    public static void main(String[] args) {
        //Construtores
        Scanner leia = new Scanner(System.in);
        ArrayList<Animal> animais = new ArrayList<>();
        ArrayList<Pagavel> pagavel = new ArrayList<>();
        ArrayList<Peixe> peixe = new ArrayList<>();
        
        //Variaveis
        boolean loop=true;
        int menu, idade, horasTrabalhadas, i;
        String nome, especie;
        double salarioPorHora, valorASerPago;
        
        while(loop==true){
            System.out.println("==== Escolha uma das opcoes abaixo: ====");
            System.out.println("1 - Add Funcionario");
            System.out.println("2 - Add Tubarao");
            System.out.println("3 - Imprimir dados dos arrays lists");
            System.out.println("0 - Sair");
            System.out.print("Opcao escolhida --> ");
            menu = leia.nextInt();
            System.out.println("================================");
            
            switch(menu){
                case 0: //sair
                    loop=false;
                    break;
                case 1: //add funcionario
                    leia.nextLine(); //limpa o buffer
                    System.out.print("Nome: ");
                    nome = leia.nextLine();
                    System.out.print("Idade: ");
                    idade = leia.nextInt();
                    System.out.print("Salario por hora: ");
                    salarioPorHora = leia.nextDouble();
                    System.out.print("Horas trabalhadas: ");
                    horasTrabalhadas = leia.nextInt();
                    Funcionario f = new Funcionario(salarioPorHora, horasTrabalhadas, nome, idade);
                    f.imprimeDados();
                    pagavel.add(f);
                    animais.add(f);
                    break;
                case 2: //add tubarao
                    leia.nextLine(); //limpa o buffer
                    System.out.print("Especie: ");
                    especie = leia.nextLine();
                    Tubarao t = new Tubarao(especie);
                    peixe.add(t);
                    animais.add(t);
                    break;
                case 3: //imprimir dados
                    System.out.println("==== Imprimindo os dados... ====");
                    //array list pagavel
                    for(i=0; i<pagavel.size(); i++){
                        System.out.println("Valor a ser pago ao funcionario "+(i+1)+": R$ "+pagavel.get(i).valorASerPago());
                        //pagavel.get(i).
                    }
                    System.out.println("================================");
                    //array list animais
                    for(i=0;i<animais.size(); i++){
                        animais.get(i).respira();
                    }
                    System.out.println("================================");
                    //array list peixes
                    for(i=0; i<peixe.size(); i++){
                        peixe.get(i).nadar();
                    }
                    System.out.println("================================");
                    break;
                default:
                    System.out.println("Opcao invalida! Digite novamente");
                    break;
            }//fim do switch case
        }//Fim do while loop
    }
    
}
