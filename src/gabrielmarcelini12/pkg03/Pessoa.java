/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielmarcelini12.pkg03;

/**
 *
 * @author Gabriel
 */
public class Pessoa {
    private static int id;
    private int idPessoa;
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.idPessoa = id;
        id++;
        
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
    

    


