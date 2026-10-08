//Parte de ROBERTO

/*Prontuário Médico: Registrar histórico, sintomas e receitas na consulta. Enquadramento
POO: Classes, Atributos e Métodos.*/

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/

package clinico;

import java.time.LocalDateTime;

public class Prontuario {
    private String diagnostico;
    private String prescricao;
    private LocalDateTime dataRegistro;

    public Prontuario(String diagnostico, String prescricao) {
        this.diagnostico = diagnostico;
        this.prescricao = prescricao;
        this.dataRegistro = LocalDateTime.now();
    }

    public void exibirProntuario() {
        System.out.println("\n--- Prontuário Médico ---");
        System.out.println("Data/Hora: " + dataRegistro);
        System.out.println("Diagnóstico: " + diagnostico);
        System.out.println("Prescrição: " + prescricao);
        System.out.println("-------------------------");
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public LocalDateTime getDataRegistro() {
        return dataRegistro;
    }
}
