package clinico;

import administrativo.Cliente;

public class Gato extends Animal {
    private String raca; // Ex: "Persa", "Maine Coon", "SRD (Gato Comum)"
    private boolean morde;

    public Gato(String nome, int idade, double peso, Cliente tutor, String raca, boolean morde) {
        super(nome, idade, peso, tutor);
        setRaca(raca);
        this.morde = morde;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Gato) está miando: Miau!");
    }

    @Override
    public void exibirDadosAnimal() {
        super.exibirDadosAnimal();
        System.out.println("Raça: " + raca);
        System.out.println("Costuma morder?: " + (morde ? "Sim ⚠️" : "Não ✅"));
        System.out.println("-------------------------");
    }

    // Getters e Setters
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            System.out.println("A raça não pode ser vazia!");
            return;
        }
        this.raca = raca;
    }

    public isMorde() {
        return morde;
    }

    public void setMorde(boolean morde) {
        this.morde = morde;
    }
}
