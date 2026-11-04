# Sistema de Clínica Veterinária Petlife 🐾

Projeto desenvolvido para a disciplina de **Programação Orientada a Objetos (POO)**. O sistema consiste numa aplicação Java modularizada para a gestão administrativa e clínica de uma clínica veterinária, incluindo tratamento de exceções, manipulação de coleções, persistência de dados em I/O e testes unitários.

---

## 🎯 Estrutura e Divisão do Projeto

O sistema é dividido em dois módulos principais de responsabilidade:

### 🏢 Módulo Administrativo
Responsável pela gestão de clientes(tutores), planos de saúde, catálogo de serviços e faturamento da clínica.
- **`Cliente.java`**: Registo dos dados dos clientes/tutores e associação ao respectivo plano de saúde.
- **`Planos.java`**: Classe base/abstrata para a definição dos planos de saúde da clínica.
- **`PlanoBasico.java` & `PlanoPremium.java`**: Subclasses que especificam as regras e percentagens de desconto dos planos de saúde.
- **`Servicos.java`**: Catálogo de serviços oferecidos pela clínica e respectivos preços base.
- **`Faturamento.java`**: Gestão dos valores a cobrar, aplicação de descontos e emissão de faturas.
- **`Faturavel.java`**: Interface que estabelece o contrato para cálculo de faturas e valores faturáveis.

### 🩺 Módulo Clínico
Responsável pela gestão de pacientes (animais), consultas, prontuários médicos, controlo de vacinação, exceções e repositório com persistência I/O.
- **`Animal.java`**: Classe abstrata base para os pacientes da clínica.
- **`Cachorro.java` & `Gato.java`**: Subclasses com comportamentos específicos e sobrescrita do método `emitirSom()`.
- **`Consulta.java`**: Agendamento, realização de consultas.
- **`Prontuario.java`**: Registo histórico de diagnósticos e prescrições médicas.
- **`Vacina.java`**: Validação de datas de aplicação, vencimento e estado de vacinação do pet.
- **`RepositorioClinico.java`**: Gestão de dados através de coleções (`Map`, `Set`, `List`) e leitura/escrita em arquivo `.csv`.
- **`DadosInvalidosException.java` & `ElementoNaoEncontradoException.java`**: Exceções personalizadas para tratamento de erros do domínio.

---

## 🧩 Conceitos de POO Aplicados

- **Abstração & Encapsulamento:** Modelagem das entidades com atributos privados e métodos de acesso com validação de dados via exceções.
- **Herança:** 
  - `Planos` $\rightarrow$ `PlanoBasico`, `PlanoPremium`
  - `Animal` $\rightarrow$ `Cachorro`, `Gato`
- **Polimorfismo & Sobrescrita:** Reimplementação de métodos nas subclasses (`emitirSom()`, cálculo dinâmico de descontos).
- **Interfaces:** Utilização da interface `Faturavel` para padronização dos contratos de faturamento do sistema.
- **Associação de Objetos:** Vínculo direto entre `Animal` $\leftrightarrow$ `Cliente` e `Consulta` $\leftrightarrow$ `Servicos` / `Faturamento`.
- **Coleções Java (`java.util`):**
  - `Map<String, Animal>` para busca rápida por nome/identificador.
  - `List<Consulta>` para histórico sequencial de atendimentos.
  - `Set<Vacina>` para garantia de unicidade de registos de vacinas.
- **Persistência de Dados (I/O):** Gravação e leitura de registos em arquivo `animais_cadastrados.csv` (`java.nio.file`).
- **Testes Unitários:** Suíte automatizada de testes com **JUnit 5** no módulo clínico.

---

## 📁 Organização de Arquivos

```text
projeto-poo/
├── src/
│   ├── administrativo/
│   │   ├── Cliente.java
│   │   ├── Faturamento.java
│   │   ├── Faturavel.java
│   │   ├── PlanoBasico.java
│   │   ├── PlanoPremium.java
│   │   ├── Planos.java
│   │   └── Servicos.java
│   ├── clinico/
│   │   ├── Animal.java
│   │   ├── Cachorro.java
│   │   ├── Gato.java
│   │   ├── Consulta.java
│   │   ├── Prontuario.java
│   │   ├── Vacina.java
│   │   ├── RepositorioClinico.java
│   │   ├── DadosInvalidosException.java
│   │   └── ElementoNaoEncontradoException.java
│   └── Main.java
├── test/
│   └── clinico/
│       └── ClinicoTest.java
└── README.md


🚀 Como Executar
Pré-requisitos
Java JDK 17 ou superior instalado.

1. Compilar o Projeto
No terminal, a partir da raiz do repositório:
javac -d bin src/administrativo/*.java src/clinico/*.java src/Main.java

2. Executar a Aplicação
java -cp bin Main

3. Executar os Testes Unitários (JUnit 5)
Se estiver utilizando um ambiente com Maven ou suporte a JUnit na IDE:
mvn test
