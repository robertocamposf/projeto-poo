package clinico;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class RepositorioClinico {
    // 1. MAP: Busca rápida por nome do Animal
    private final Map<String, Animal> mapaAnimais = new HashMap<>();

    // 2. LIST: Histórico sequencial de consultas
    private final List<Consulta> listaConsultas = new ArrayList<>();

    // 3. SET: Garantia de unicidade de vacinas registradas
    private final Set<Vacina> conjuntoVacinas = new HashSet<>();

    private final Path caminhoArquivo = Paths.get("animais_cadastrados.csv");

    // Operações com Animais (Map)
    public void cadastrarAnimal(Animal animal) {
        if (animal == null) {
            throw new DadosInvalidosException("Animal não pode ser nulo.");
        }
        mapaAnimais.put(animal.getNome().toLowerCase(), animal);
        salvarAnimaisEmArquivo();
    }

    public Animal buscarAnimalPorNome(String nome) {
        Animal animal = mapaAnimais.get(nome.toLowerCase());
        if (animal == null) {
            throw new ElementoNaoEncontradoException("Animal '" + nome + "' não foi encontrado!");
        }
        return animal;
    }

    // Operações com Consultas (List)
    public void registrarConsulta(Consulta consulta) {
        if (consulta == null) {
            throw new DadosInvalidosException("Consulta não pode ser nula.");
        }
        listaConsultas.add(consulta);
    }

    public List<Consulta> getListaConsultas() {
        return Collections.unmodifiableList(listaConsultas);
    }

    // Operações com Vacinas (Set)
    public void registrarVacina(Vacina vacina) {
        if (vacina == null) {
            throw new DadosInvalidosException("Vacina não pode ser nula.");
        }
        conjuntoVacinas.add(vacina);
    }

    // PERSISTÊNCIA EM ARQUIVO (Java I/O)
    public void salvarAnimaisEmArquivo() {
        try (BufferedWriter writer = Files.newBufferedWriter(caminhoArquivo)) {
            for (Animal a : mapaAnimais.values()) {
                String tipo = a.getClass().getSimpleName();
                String tutor = (a.getTutor() != null) ? a.getTutor().getNomeDoCliente() : "Sem Tutor";
                writer.write(tipo + ";" + a.getNome() + ";" + a.getIdade() + ";" + a.getPeso() + ";" + tutor);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo de animais: " + e.getMessage());
        }
    }

    public void carregarAnimaisDoArquivo() {
        if (!Files.exists(caminhoArquivo)) return;

        try (BufferedReader reader = Files.newBufferedReader(caminhoArquivo)) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length >= 4) {
                    System.out.println("[I/O LOG] Dado lido do arquivo -> Espécie: " + dados[0] + " | Nome: " + dados[1]);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo de animais: " + e.getMessage());
        }
    }
}