//Parte de ROBERTO

/*Cadastro dos Pets: Registrar os animais (especificando cachorro, gato, etc) e vincular ao
dono. Enquadramento POO: Herança e Associação. */

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO

*/



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

    // Getters e Setters com validações básicas
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("O nome do animal não pode ser vazio!");
            return;
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("A idade não pode ser negativa!");
            return;
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("O peso deve ser maior que zero!");
            return;
        }
        this.peso = peso;
    }

    public Cliente getTutor() {
        return tutor;
    }

    public void setTutor(Cliente tutor) {
        if (tutor == null) {
            System.out.println("O animal precisa estar vinculado a um cliente/tutor!");
            return;
        }
        this.tutor = tutor;
    }
}
