/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gabrielmarcelini12.pkg03;

/**
 *
 * @author Gabriel
 */
public class Internacao {
    private static int id = 1;
    private int idInternacao;
    private String motivo;
    private double valorDia;
    private int qtdDias; 
   
    Medico objMedico;
    Paciente objPaciente;
    Enfermeiro objEnfermeiro;
    
    public int getIdInternacao() {
        return idInternacao;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public double getValorDia() {
        return valorDia;
    }

    public void setValorDia(double valorDia) {
        this.valorDia = valorDia;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public Medico getObjMedico() {
        return objMedico;
    }

    public void setObjMedico(Medico objMedico) {
        this.objMedico = objMedico;
    }

    public Paciente getObjPaciente() {
        return objPaciente;
    }

    public void setObjPaciente(Paciente objPaciente) {
        this.objPaciente = objPaciente;
    }

    public Enfermeiro getObjEnfermeiro() {
        return objEnfermeiro;
    }

    public void setObjEnfermeiro(Enfermeiro objEnfermeiro) {
        this.objEnfermeiro = objEnfermeiro;
    }
    
    public double valorTotalInternacao(){
        return valorDia * qtdDias;
    }

    public Internacao(String motivoInternacao, double valorDia, int qtdDias, Medico objMedico, Paciente objPaciente, Enfermeiro objEnfermeiro) {
        this.id = id;
        this.motivo = motivo;
        this.valorDia = valorDia;
        this.qtdDias = qtdDias;
        this.objMedico = objMedico;
        this.objPaciente = objPaciente;
        this.objEnfermeiro = objEnfermeiro;
        id++;
        objPaciente.setValorTotalInternacoes(valorTotalInternacao());
    }
  @Override
    public String toString(){
        return "Nome do Paciente: "+ objPaciente.getNome() 
                + "\nNome do Medico: "+ objMedico.getNome()
                + "\nEnfermeiro responsavel: "+ objEnfermeiro.getNome()
                + "\nID da internacao: "+ this.getIdInternacao()
                + "\nMotivo da internacao : "+ this.getMotivo()
                + "\nValor do dia da internacao: "+ this.getValorDia()
                + "\nQuantidade de dias de internacao: "+ this.getQtdDias()
                + "\nValor total da internacao: "+ this.valorTotalInternacao()
                + "\nValor de todas internacoes: "+ objPaciente.getValorTotalInternacoes();
    }
}
  
    

    

