// É apenas um exemplo de main, depois serão feitas alterações


import administrativo.*;
import clinico.*;
import java.time.LocalDateTime;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("===============================================");
        System.out.println("   SISTEMA DE CLÍNICA VETERINÁRIA PETLIFE    ");
        System.out.println("===============================================\n");

        // 1. Cadastrando um Plano (Herança de Planos -> PlanoPremium)
        System.out.println(">>> 1. CADASTRANDO PLANO DE SAÚDE");
        Planos planoGold = new PlanoPremium("Plano Gold", 20.0f, 150.0f, true, 15.0f);
        planoGold.exibirDadosDoPlano();

        // 2. Cadastrando um Cliente/Tutor (Encapsulamento e Validação)
        System.out.println("\n>>> 2. CADASTRANDO TUTOR");
        Cliente tutor1 = new Cliente("Ana Souza", "123.456.789-00", "Rua das Flores, 123", "(81) 98888-7777", planoGold);
        tutor1.MostrarDadosDoCliente();

        // 3. Cadastrando Animais (Herança: Cachorro e Gato herdando de Animal)
        System.out.println("\n>>> 3. CADASTRANDO PACIENTES");
        Cachorro meuCachorro = new Cachorro("Thor", 3, 14.5, tutor1, "Golden Retriever", true);
        Gato meuGato = new Gato("Luna", 2, 4.0, tutor1, "Persa", false);

        meuCachorro.exibirDadosAnimal();
        meuGato.exibirDadosAnimal();

        // 4. Testando o Polimorfismo (Método emitirSom sobrescrito)
        System.out.println("\n>>> 4. TESTANDO POLIMORFISMO (SOM DOS ANIMAIS)");
        meuCachorro.emitirSom();
        meuGato.emitirSom();

        // 5. Cadastrando um Serviço
        System.out.println("\n>>> 5. CATÁLOGO DE SERVIÇOS");
        Servicos consultaClinica = new Servicos("Consulta Clínica Geral", 200.0f);
        consultaClinica.catalogoDeServicos();

        // 6. Realizando uma Consulta (Unindo Clínico e Administrativo com Faturamento inteligente)
        System.out.println("\n>>> 6. REALIZANDO CONSULTA E FATURAMENTO");
        // O sistema pega o valor base de R$ 200,00 e aplica automaticamente os 20% de desconto do Plano Gold da tutora Ana!
        Consulta atendimentoThor = new Consulta(LocalDateTime.now(), meuCachorro, consultaClinica);
        
        // Finalizando a consulta gerando o Prontuário
        atendimentoThor.finalizarConsulta(
            "Otite leve (infecção de ouvido)", 
            "Aplicar 3 gotas de Otimax a cada 12 horas por 7 dias."
        );

        // Exibindo todos os detalhes, prontuário e fatura calculada
        atendimentoThor.exibirDetalhesConsulta();

        // 7. Testando Controle de Vacinas
        System.out.println("\n>>> 7. CONTROLE DE VACINAÇÃO");
        Vacina vacinaRaiva = new Vacina("Antirrábica", LocalDate.of(2025, 5, 10), LocalDate.of(2026, 5, 10), meuCachorro);
        vacinaRaiva.exibirDadosVacina();

        System.out.println("\n===============================================");
        System.out.println("           FIM DA EXECUÇÃO DO SISTEMA          ");
        System.out.println("===============================================");
    }
}
