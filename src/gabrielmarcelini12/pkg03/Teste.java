/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielmarcelini12.pkg03;

import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do Medico: ");
        String nomeMed1 = sc.next();
        System.out.println("Digite o idade do Medico: ");
        int idadeMed1 = sc.nextInt();
        System.out.println("Digite o CPF do Medico: ");
        String cpfMed1 = sc.next();
        System.out.println("Digite a especializacao do Medico: ");
        String especializacaoMed1 = sc.next();
        Medico medico1 = new Medico(nomeMed1, idadeMed1, cpfMed1, especializacaoMed1);
       
        System.out.println("Digite o nome do Enfermeiro: ");
        String nomeEnf1 = sc.next();
        System.out.println("Digite o idade do Enfermeiro: ");
        int idadeEnf1 = sc.nextInt();
        System.out.println("Digite o CPF do Enfermeiro: ");
        String cpfEnf1 = sc.next();
        Enfermeiro enfermeiro1 = new Enfermeiro(nomeEnf1, idadeEnf1, cpfEnf1);
        
        System.out.println("Digite o nome do Paciente: ");
        String nomePac1 = sc.next();
        System.out.println("Digite o idade do Paciente: ");
        int idadePac1 = sc.nextInt();
        System.out.println("Digite o CPF do Paciente: ");
        String cpfPac1 = sc.next();
        Paciente paciente1 = new Paciente(nomePac1, idadePac1, cpfPac1);
        
        System.out.println("Digite o motivo da internacao: ");
        String motivoInt = sc.next();
        System.out.println("Digite a quantidade de dias de internacao: ");
        int qtdDias = sc.nextInt();
        System.out.println("Digite o valor do dia de internacao: ");
        double valorDia = sc.nextDouble();
        Internacao internacao1 = new Internacao(motivoInt, valorDia, qtdDias, medico1, paciente1, enfermeiro1);
        
        System.out.println("Digite o motivo da internacao: ");
        String motivoInt2 = sc.next();
        System.out.println("Digite a quantidade de dias de internacao: ");
        int qtdDias2 = sc.nextInt();
        System.out.println("Digite o valor do dia de internacao: ");
        double valorDia2 = sc.nextDouble();
        Internacao internacao2 = new Internacao(motivoInt2, valorDia2, qtdDias2, medico1, paciente1, enfermeiro1);
        
        System.out.println(internacao2.toString());
        
        sc.close();
    }
}
