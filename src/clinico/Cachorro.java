package clinico;

import administrativo.Cliente;

public class Cachorro extends Animal {
    private String raca; // Ex: "Golden Retriever", "Poodle", "SRD (Vira-lata)"
    private boolean racaPura;

    public Cachorro(String nome, int idade, double peso, Cliente tutor, String raca, boolean racaPura) {
        super(nome, idade, peso, tutor);
        setRaca(raca);
        this.racaPura = racaPura;
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " (Cachorro) está latindo: Au Au!");
    }

    @Override
    public void exibirDadosAnimal() {
        super.exibirDadosAnimal();
        System.out.println("Raça: " + raca);
        System.out.println("Raça Pura: " + (racaPura ? "Sim ✅" : "Não (SRD/Misturado) 🐾"));
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

    public boolean isRacaPura() {
        return racaPura;
    }

    public void setRacaPura(boolean racaPura) {
        this.racaPura = racaPura;
    }
}
