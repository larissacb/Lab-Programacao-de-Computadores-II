/*
 * Larissa de Castro Braga - 20183000581
 * Eng. Eletrica
 * 
 */
package roteiro3t12;

import java.util.Scanner; //"biblioteca" da leitura do teclado
public class Roteiro3t12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in); //construtor para o scanner 
        DiarioDeClasse d=new DiarioDeClasse(); //construtor para a classe diario de classe
        
        System.out.println("===Sistema academico===");
        int tam, a=0;
        String disciplina;
        //nome da disciplina
        do{
            if(a>0) System.out.println("Informacao invalida!Digite novamente!");
            System.out.println("Digite o nome da disciplina:");
            disciplina = leia.nextLine();
            tam=disciplina.length();
            a++;
        }while(tam<=0);
        //numero de alunos
        a=0;
        int numAlunos;
        do{
            if(a>0) System.out.println("Informacao invalida!Digite novamente!");
            System.out.println("Digite o numero de alunos matriculados na disciplina:");
            numAlunos=leia.nextInt();
            a++;
        }while(numAlunos<=0);
        //numero de aulas
        a=0;
        int numAulas;
        do{
            if(a>0) System.out.println("Informacao invalida!Digite novamente!");
            System.out.println("Digite o numero de aulas ministradas:");
            numAulas=leia.nextInt();
            a++;
        }while(numAulas<=0);
        d.DiarioDeClasse(disciplina, numAlunos, numAulas); //mando os parametros ja digitados e validados para a classe
        a=0;
        //vetor de notas de provas
        float[]notasProvas;
        notasProvas=new float[numAlunos]; //alocacao de memoria para o vetor de notas de provas da main
        for(int i=0;i<numAlunos;i++){ //entrada dos valores referentes as notas dos alunos e armazenamento em um vetor
            a=0;
            do{
                if(a>0) System.out.println("Informacao invalida!Digite novamente!");
                System.out.println("Digite a nota do "+(i+1)+"o aluno(a):");
                notasProvas[i]=leia.nextFloat();
                a++;
            }while(notasProvas[i]<=0 || notasProvas[i]>100); //fica em loop para garantir informacao de nota valida
        }
        d.setNotasProvas(notasProvas); //envio o vetor para a classe
        //vetor de numero de faltas
        int[]faltasPorAlunos;
        faltasPorAlunos=new int[numAlunos]; //alocacao de memoria
        for(int i=0;i<numAlunos;i++){
            a=0;
            do{
                if(a>0) System.out.println("Informacao invalida!Digite novamente!");
                System.out.println("Digite o numero de faltas do "+(i+1)+"o aluno(a):");
                faltasPorAlunos[i]=leia.nextInt();
                a++;
            }while(faltasPorAlunos[i]<0 || faltasPorAlunos[i]>numAulas); //fica em loop para garantir a digitacao de informacao valida
        }
        d.setFaltasPorAlunos(faltasPorAlunos); //envio o vetor para a classe 
        
        //visualizacao dos parametros calculados na classe
        boolean menu=true;
        int opcao;
        a=0;
        while(menu==true){
            System.out.println("==Escolha a informacao que deseja visualizar:==");
            System.out.println("1 - Fechar o diario");
            System.out.println("2 - Media da turma");
            System.out.println("3 - Maior e menor nota da turma");
            System.out.println("0 - Sair");
            opcao=leia.nextInt();
            
            switch(opcao){
                case 0:
                    menu=false;
                    break;
                case 1:
                    System.out.println("==Fechar o diario==");
                    System.out.println("Disciplina ministrada no semestre: "+d.getNomeDisciplina());
                    d.FechaDiario();
                    System.out.println("No. de alunos aprovados: "+d.getNumAprovados());
                    System.out.println("No. de alunos reprovados: "+d.getNumReprovados());
                    break;
                case 2:
                    System.out.println("==Media da turma==");
                    System.out.println("Media: "+d.getMediaTurma());
                    break;
                case 3:
                    System.out.println("==Maior e menor nota da turma==");
                    System.out.println("Maior nota: "+d.getMaiorNota());
                    System.out.println("Menor nota: "+d.getMenorNota());
                    break;
                default:
                    System.out.println("==Opcao invalida! Digite novamente!==");
                    break;
            }
        }
    }
    
}