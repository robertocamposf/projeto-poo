package clinico;

import administrativo.Cliente; // Importando a classe Cliente do pacote administrativo

public abstract class Animal {
    private String nome;
    private int idade;
    private double peso;
    private Cliente tutor; // Associação com a classe Cliente (Tutor)

    public Animal(String nome, int idade, double peso, Cliente tutor) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setTutor(tutor);
    }

    // Método abstrato para demonstrar polimorfismo
    public abstract void emitirSom();

    public void exibirDadosAnimal() {
        System.out.println("\n---- Dados do Animal ----");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Peso: " + peso + " kg");
        if (tutor != null) {
            System.out.println("Tutor: " + tutor.getNomeDoCliente());
        }
        System.out.println("-------------------------");
    }

    // Getters e Setters com tratamento de exceções
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new DadosInvalidosException("O nome do animal não pode ser vazio!");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new DadosInvalidosException("A idade não pode ser negativa!");
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            throw new DadosInvalidosException("O peso deve ser maior que zero!");
        }
        this.peso = peso;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        if (tutor == null) {
            throw new DadosInvalidosException("O animal precisa estar vinculado a um cliente/tutor!");
        }
        this.tutor = tutor;
    }
}