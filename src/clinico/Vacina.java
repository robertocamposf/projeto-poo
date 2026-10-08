//Parte de ROBERTO

/*  Controle de Vacinas: Registrar vacinas tomadas e próximas doses. Enquadramento POO:
Classes, Atributos e Métodos. */

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/

package clinico;

import java.time.LocalDate;

public class Vacina {
    private String nomeVacina;
    private LocalDate dataAplicacao;
    private LocalDate dataVencimento;
    private Animal animal;

    public Vacina(String nomeVacina, LocalDate dataAplicacao, LocalDate dataVencimento, Animal animal) {
        this.nomeVacina = nomeVacina;
        this.dataAplicacao = dataAplicacao;
        this.dataVencimento = dataVencimento;
        this.animal = animal;
    }

    public boolean estaVencida() {
        return LocalDate.now().isAfter(dataVencimento);
    }

    public void exibirDadosVacina() {
        System.out.println("\n---- Dados da Vacina ----");
        System.out.println("Vacina: " + nomeVacina);
        System.out.println("Animal: " + (animal != null ? animal.getNome() : "Desconhecido"));
        System.out.println("Aplicação: " + dataAplicacao);
        System.out.println("Vencimento: " + dataVencimento);
        System.out.println("Status: " + (estaVencida() ? "Vencida ❌" : "Em dia ✅"));
        System.out.println("-------------------------");
    }

    // Getters e Setters
    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDate dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
