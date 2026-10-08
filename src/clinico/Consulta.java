//Parte de ROBERTO

/*Agendamento de Consultas: Marcar o dia, hora, e veterinário para o pet. Enquadramento
POO: Associação e Métodos.*/

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/


package clinico;

import administrativo.Servicos;
import administrativo.Faturamento;
import administrativo.Planos;
import administrativo.PlanoBasico;
import administrativo.PlanoPremium;

import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime dataHora;
    private Animal animal;
    private Servicos servico;
    private Prontuario prontuario;
    private Faturamento faturamento;

    public Consulta(LocalDateTime dataHora, Animal animal, Servicos servico) {
        this.dataHora = dataHora;
        this.animal = animal;
        this.servico = servico;
        gerarFaturamentoAutomatico();
    }

    // Método inteligente que calcula desconto com base no plano do Cliente/Tutor
    private void gerarFaturamentoAutomatico() {
        float precoBase = servico.getPrecoBase();
        float desconto = 0.0f;

        // Verifica se o animal tem tutor e se o tutor possui um plano associado
        if (animal != null && animal.getTutor() != null) {
            Planos plano = animal.getTutor().getPlanoDoCliente();
            if (plano != null) {
                // Polimorfismo / Verificação de instâncias de planos
                desconto = (precoBase * plano.getPorcentagemDoDesconto()) / 100.0f;
            }
        }

        this.faturamento = new Faturamento(precoBase, desconto);
    }

    public void finalizarConsulta(String diagnostico, String prescricao) {
        this.prontuario = new Prontuario(diagnostico, prescricao);
        System.out.println("Consulta finalizada com sucesso para o paciente: " + animal.getNome());
    }

    public void exibirDetalhesConsulta() {
        System.out.println("\n=================================");
        System.out.println("        DETALHES DA CONSULTA     ");
        System.out.println("=================================");
        System.out.println("Data/Hora: " + dataHora);
        System.out.println("Paciente: " + animal.getNome() + " (" + animal.getClass().getSimpleName() + ")");
        System.out.println("Tutor: " + (animal.getTutor() != null ? animal.getTutor().getNomeDoCliente() : "Sem tutor"));
        System.out.println("Serviço Realizado: " + servico.getNomeDoServico());
        
        if (prontuario != null) {
            prontuario.exibirProntuario();
        } else {
            System.out.println("Prontuário: [Ainda não finalizado]");
        }

        if (faturamento != null) {
            faturamento.exibirFatura();
        }
        System.out.println("\n=================================");
    }

    // Getters e Setters
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Servicos getServico() {
        return servico;
    }

    public void setServico(Servicos servico) {
        this.servico = servico;
    }

    public Prontuario getProntuario() {
        return prontuario;
    }

    public Faturamento getFaturamento() {
        return faturamento;
    }
}
