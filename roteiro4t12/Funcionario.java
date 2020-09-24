/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roteiro4t12;

/**
 *
 * @author laris
 */
public class Funcionario {
    private String nome;
    private String id;
    private String cargo;
    private float salario;
    
    public void Funcionario(){
    }
    
    public void Funcionario(String nome, String id, String cargo, float salario){ 
        this.nome=nome;
        this.id=id;
        this.cargo=cargo;
        this.salario=salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
