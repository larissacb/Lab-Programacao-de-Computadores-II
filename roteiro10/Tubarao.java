/*
 * Larissa de Castro Braga - Eng. Eletrica
 * Matricula: 20183000581
 */
package roteiro10;

public class Tubarao implements Peixe{
    private String especie;

    public Tubarao(String especie) {
        this.especie = especie;
    }
    
    @Override
    public void nadar(){
        System.out.println("O tubarao esta nadando...");
    }
    
    @Override
    public void respira(){
        System.out.println("O tubarao esta respirando...");
    }
}
