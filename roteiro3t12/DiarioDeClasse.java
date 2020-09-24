/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro3t12;

/**
 *
 * @author laris
 */
public class DiarioDeClasse {
    private String nomeDisciplina;
    private int numAlunos;
    private int numAulas;
    private float []notasProvas;
    private int []faltasPorAlunos;
    private int numAprovados;
    private int numReprovados;
    
    public void DiarioDeClasse(String nomeDisciplina){
        this.nomeDisciplina=nomeDisciplina;
    }
    public void DiarioDeClasse(String nomeDisciplina, int numAlunos, int numAulas){
        this.nomeDisciplina=nomeDisciplina;
        this.numAlunos=numAlunos;
        this.numAulas=numAulas;
        notasProvas=new float[numAlunos]; //alocacao de memoria para o vetor de notas de provas com a qtde de alunos
        faltasPorAlunos=new int[numAlunos]; //alocacao de memoria para o vetor de faltas com a qtde de alunos
    }
    public void FechaDiario(){
        this.numAprovados=0;
        this.numReprovados=0;
        double faltasPermitidas=(0.25*this.numAulas); //calculo do numero maximo de faltas perimitidas para fazer a comparacao
        for(int i=0;i<this.numAlunos;i++){
            if(notasProvas[i]>=60 && faltasPorAlunos[i]<=faltasPermitidas){
                this.numAprovados+=1;
            }
            else{
                this.numReprovados+=1;
            }
        }
    }
    public float getMediaTurma(){
        float mediaTurma=0;
        for(int i=0;i<this.numAlunos;i++){
            mediaTurma+=this.notasProvas[i]; //faço o somatorio de todas as notas percorrendo o vetor
        }
        mediaTurma/=this.numAlunos; //divido a soma total das notas pela qtde de alunos
        return mediaTurma;
    }
    public float getMaiorNota(){
        float maiorNota=0;
        int i=0;
        maiorNota=this.notasProvas[i];
        for(i=0;i<this.numAlunos;i++){
            if(maiorNota<notasProvas[i]){
                maiorNota=notasProvas[i];
            }
        }
        return maiorNota;
    }
    public float getMenorNota(){
        float menorNota=0;
        int i=0;
        menorNota=this.notasProvas[i];
        for(i=0;i<this.numAlunos;i++){
            if(menorNota>notasProvas[i]){
                menorNota=notasProvas[i];
            }
        }
        return menorNota;
    }
    
    //Getters e setters

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public int getNumAulas() {
        return numAulas;
    }

    public void setNumAulas(int numAulas) {
        this.numAulas = numAulas;
    }

    public float[] getNotasProvas() {
        return notasProvas;
    }

    public void setNotasProvas(float[] notasProvas) {
        this.notasProvas = notasProvas;
    }

    public int[] getFaltasPorAlunos() {
        return faltasPorAlunos;
    }

    public void setFaltasPorAlunos(int[] faltasPorAlunos) {
        this.faltasPorAlunos = faltasPorAlunos;
    }

    public int getNumAprovados() {
        
        return numAprovados;
    }

    public void setNumAprovados(int numAprovados) {
        
        this.numAprovados = numAprovados;
    }

    public int getNumReprovados() {
        return numReprovados;
    }

    public void setNumReprovados(int numReprovados) {
        this.numReprovados = numReprovados;
    }
    
}
