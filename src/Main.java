import administrativo.*;
import clinico.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("   SISTEMA DE CLÍNICA VETERINÁRIA PETLIFE    ");
        System.out.println("===============================================\n");

        RepositorioClinico repositorio = new RepositorioClinico();

        // 1. Carregar dados gravados anteriormente do arquivo (I/O)
        System.out.println(">>> 1. LENDO DADOS PERSISTIDOS EM ARQUIVO (I/O)");
        repositorio.carregarAnimaisDoArquivo();

        // 2. Cadastrando Plano e Tutor
        System.out.println("\n>>> 2. CADASTRANDO PLANO E TUTOR");
        Planos planoGold = new PlanoPremium("Plano Gold", 20.0f, 150.0f, true, 15.0f);
        Cliente tutor1 = new Cliente("Ana Souza", "123.456.789-00", "Rua das Flores, 123", "(81) 98888-7777", planoGold);

        // 3. Cadastrando Animais e salvando no Repositório (Map e Arquivo)
        System.out.println("\n>>> 3. CADASTRANDO PACIENTES E SALVANDO EM ARQUIVO");
        Cachorro meuCachorro = new Cachorro("Thor", 3, 14.5, tutor1, "Golden Retriever", true);
        Gato meuGato = new Gato("Luna", 2, 4.0, tutor1, "Persa", false);

        repositorio.cadastrarAnimal(meuCachorro);
        repositorio.cadastrarAnimal(meuGato);

        // 4. Testando o Tratamento de Exceções com try-catch
        System.out.println("\n>>> 4. TESTANDO TRATAMENTO DE EXCEÇÕES");
        try {
            System.out.println("Tentando buscar animal inexistente...");
            repositorio.buscarAnimalPorNome("Rex");
        } catch (ElementoNaoEncontradoException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        try {
            System.out.println("Tentando cadastrar animal com idade inválida...");
            meuCachorro.setIdade(-5);
        } catch (DadosInvalidosException e) {
            System.out.println("Exceção capturada com sucesso: " + e.getMessage());
        }

        // 5. Consulta e Vacinação (List e Set)
        System.out.println("\n>>> 5. REALIZANDO CONSULTA E REGISTRANDO VACINA");
        Servicos consultaClinica = new Servicos("Consulta Clínica Geral", 200.0f);
        Consulta atendimentoThor = new Consulta(LocalDateTime.now(), meuCachorro, consultaClinica);
        atendimentoThor.finalizarConsulta("Otite leve", "Aplicar Otimax 12/12h por 7 dias.");
        repositorio.registrarConsulta(atendimentoThor);

        Vacina vacinaRaiva = new Vacina("Antirrábica", LocalDate.of(2025, 5, 10), LocalDate.of(2026, 5, 10), meuCachorro);
        repositorio.registrarVacina(vacinaRaiva);
        vacinaRaiva.exibirDadosVacina();

        System.out.println("\n===============================================");
        System.out.println("           FIM DA EXECUÇÃO DO SISTEMA          ");
        System.out.println("===============================================");
    }
}