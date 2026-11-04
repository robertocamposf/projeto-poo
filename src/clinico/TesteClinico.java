package clinico;

import administrativo.Cliente;
import administrativo.PlanoPremium;
import administrativo.Servicos;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteClinico {

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("   EXECUTANDO TESTES UNITÁRIOS (JAVA PURO)     ");
        System.out.println("=================================================\n");

        testarExcecaoNomeVazio();
        testarCadastrarEBuscarNoMap();
        testarExcecaoAnimalNaoEncontrado();
        testarStatusVacinaVencida();

        System.out.println("\n=================================================");
        System.out.println("            FIM DA SUÍTE DE TESTES               ");
        System.out.println("=================================================");
    }

    private static void testarExcecaoNomeVazio() {
        try {
            Cliente tutor = new Cliente("Ana Souza", "123", "Rua A", "99999", null);
            new Cachorro("", 2, 10.0, tutor, "Poodle", true);
            System.err.println("❌ TESTE FALHOU: Deveria ter lançado DadosInvalidosException!");
        } catch (DadosInvalidosException e) {
            System.out.println("✅ TESTE PASSOU: Exceção capturada ao tentar criar animal com nome vazio.");
        }
    }

    private static void testarCadastrarEBuscarNoMap() {
        RepositorioClinico repo = new RepositorioClinico();
        Cliente tutor = new Cliente("Ana Souza", "123", "Rua A", "99999", null);
        Cachorro dog = new Cachorro("Thor", 3, 14.5, tutor, "Golden Retriever", true);

        repo.cadastrarAnimal(dog);
        Animal encontrado = repo.buscarAnimalPorNome("Thor");

        if (encontrado != null && encontrado.getNome().equals("Thor")) {
            System.out.println("✅ TESTE PASSOU: Animal cadastrado e retornado do Map com sucesso.");
        } else {
            System.err.println("❌ TESTE FALHOU: Animal não foi encontrado no Map.");
        }
    }

    private static void testarExcecaoAnimalNaoEncontrado() {
        RepositorioClinico repo = new RepositorioClinico();
        try {
            repo.buscarAnimalPorNome("Rex");
            System.err.println("❌ TESTE FALHOU: Deveria ter lançado ElementoNaoEncontradoException!");
        } catch (ElementoNaoEncontradoException e) {
            System.out.println("✅ TESTE PASSOU: Exceção capturada ao buscar animal inexistente.");
        }
    }

    private static void testarStatusVacinaVencida() {
        Cliente tutor = new Cliente("Ana Souza", "123", "Rua A", "99999", null);
        Cachorro dog = new Cachorro("Thor", 3, 14.5, tutor, "Golden Retriever", true);
        Vacina vacinaVencida = new Vacina("Antirrábica", LocalDate.of(2023, 1, 1), LocalDate.of(2024, 1, 1), dog);

        if (vacinaVencida.estaVencida()) {
            System.out.println("✅ TESTE PASSOU: Vacina com data passada foi identificada como vencida.");
        } else {
            System.err.println("❌ TESTE FALHOU: A vacina deveria ser marcada como vencida.");
        }
    }
}