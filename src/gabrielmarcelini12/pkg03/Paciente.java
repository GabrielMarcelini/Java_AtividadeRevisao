/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielmarcelini12.pkg03;

/**
 *
 * @author Gabriel
 */
public class Paciente extends Pessoa {
    private double valorTotalInternacoes;
    
    public Paciente(String nome, int idade, String cpf) {
        super(nome, idade, cpf);
        this.valorTotalInternacoes = 0.0;
    }

    public double getValorTotalInternacoes() {
        return valorTotalInternacoes;
    }

    public void setValorTotalInternacoes(double valorTotalInternacoes) {
        this.valorTotalInternacoes += valorTotalInternacoes;
    }
   
}
