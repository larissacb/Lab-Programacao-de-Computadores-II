/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro9;

import java.util.Scanner;
public class Roteiro9 {

    public static void main(String[] args) {
        //Construtor
        Scanner leia = new Scanner(System.in);
        //Variaveis
        boolean loop=true;
        int menu, espessuraLinha, posicaoX, posicaoY, posicaoZ, i;
        float escala;
        String cor;
        double lado, raio, aresta1, aresta2, aresta3;
        //Loop para o menu
        while(loop==true){
            System.out.println("============ Menu ============");
            System.out.println("1 - Adicionar quadrado");
            System.out.println("2 - Adicionar circulo");
            System.out.println("3 - Adicionar esfera");
            System.out.println("4 - Adicionar paralelepipedo");
            System.out.println("0 - Sair");
            System.out.print("Informe a opcao escolhida: ");
            menu = leia.nextInt();
            System.out.println("===============================");
            switch(menu){                
                case 0: //sair
                    loop=false;
                    break;
                case 1: //add quadrado
                    System.out.print("Escala: ");
                    escala = leia.nextFloat();
                    System.out.print("Cor: ");
                    cor = leia.nextLine();
                    leia.nextLine();
                    System.out.print("Espessura da linha: ");
                    espessuraLinha = leia.nextInt();
                    System.out.print("Lado: ");
                    lado = leia.nextInt();
                    System.out.print("Posicao X: ");
                    posicaoX = leia.nextInt();
                    System.out.print("Posicao Y: ");
                    posicaoY = leia.nextInt();
                    Quadrado q = new Quadrado(lado, posicaoX, posicaoY, escala, cor, espessuraLinha);
                    System.out.println("===============================");
                    q.desenha();
                    System.out.println("Area: "+q.getArea());
                    System.out.println("Perimetro: "+q.getPerimetro());
                    System.out.println("===============================");
                    break;
                case 2: //add circulo
                    System.out.print("Escala: ");
                    escala = leia.nextFloat();
                    System.out.print("Cor: ");
                    cor = leia.nextLine();
                    leia.nextLine();
                    System.out.print("Espessura da linha: ");
                    espessuraLinha = leia.nextInt();
                    System.out.print("Posicao X: ");
                    posicaoX = leia.nextInt();
                    System.out.print("Posicao Y: ");
                    posicaoY = leia.nextInt();
                    System.out.print("Raio: ");
                    raio = leia.nextDouble();
                    Circulo c = new Circulo(raio, posicaoX, posicaoY, escala, cor, espessuraLinha);
                    System.out.println("===============================");
                    c.desenha();
                    System.out.println("Area: "+c.getArea());
                    System.out.println("Perimetro: "+c.getPerimetro());
                    System.out.println("===============================");
                    break;                         
                case 3: //add esfera
                    System.out.print("Escala: ");
                    escala = leia.nextFloat();
                    System.out.print("Cor: ");
                    cor = leia.nextLine();
                    leia.nextLine();
                    System.out.print("Espessura da linha: ");
                    espessuraLinha = leia.nextInt();
                    System.out.print("Posicao X: ");
                    posicaoX = leia.nextInt();
                    System.out.print("Posicao Y: ");
                    posicaoY = leia.nextInt();
                    System.out.print("Posicao Z: ");
                    posicaoZ = leia.nextInt();
                    System.out.print("Raio: ");
                    raio = leia.nextDouble();
                    Esfera e = new Esfera(raio, posicaoX, posicaoY, posicaoZ, escala, cor, espessuraLinha);
                    System.out.println("===============================");
                    e.desenha();
                    System.out.println("Area superficial: "+e.getAreaSuperficial());
                    System.out.println("Volume: "+e.getVolume());
                    System.out.println("===============================");
                    break;
                case 4: //add paralelepipedo
                    System.out.print("Escala: ");
                    escala = leia.nextFloat();
                    System.out.print("Cor: ");
                    cor = leia.nextLine();
                    leia.nextLine();
                    System.out.print("Espessura da linha: ");
                    espessuraLinha = leia.nextInt();
                    System.out.print("Posicao X: ");
                    posicaoX = leia.nextInt();
                    System.out.print("Posicao Y: ");
                    posicaoY = leia.nextInt();
                    System.out.print("Posicao Z: ");
                    posicaoZ = leia.nextInt();
                    System.out.print("Aresta 1: ");
                    aresta1 = leia.nextDouble();
                    System.out.print("Aresta 2: ");
                    aresta2 = leia.nextDouble();
                    System.out.print("Aresta 3: ");
                    aresta3 = leia.nextDouble();
                    Paralelepipedo p = new Paralelepipedo(aresta1, aresta2, aresta3, posicaoX, posicaoY, posicaoZ, escala, cor, espessuraLinha);
                    System.out.println("===============================");
                    p.desenha();
                    System.out.println("Area superficial: "+p.getAreaSuperficial());
                    System.out.println("Volume: "+p.getVolume());
                    System.out.println("===============================");
                    break;      
                default:
                    System.out.println("=== Opcao invalida! Digite novamente! ===");
                    break;
                
            }//fim switch case
        }//fim loop
    }//fim main
    
}
