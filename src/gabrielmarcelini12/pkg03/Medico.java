/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielmarcelini12.pkg03;

/**
 *
 * @author Gabriel
 */
public class Medico extends Pessoa{
    
    private String especializacao;

    public Medico(String nome, int idade, String cpf, String especializacao) {
        super(nome, idade, cpf);
        this.especializacao = especializacao;
    }
   
    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
}
