//Parte de JEANNE

/*Cadastro de Clientes: Funcionalidade para registrar os donos dos animais. Enquadramento
POO: Classes, Atributos e Métodos. */

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/



package administrativo;

public class Cliente {


    //ATRIBUTOS - Private serve pra que a mudança dessa variavel nao seja aberta para outros usuários. 

    private String nomeDoCliente;
    private String cpfDoCliente;
    private String enderecoDoCliente;
    private String telefoneDoCliente;
    private Planos planoDoCliente; //Associação de classes 


    //Construtores - vai saber o construtor que vai ser utilizado por meio dos parametros


    //⚠️OBS: NESSE CASO NOS TEMOS 3 CONSTRUTORES POR CONTA DA VARIAVEL PLANO DO CLIENTE, POIS ELA SE RELACIONA COM A CLASSE PLANOS E EXISTE USUARIOS TANTO COM PLANO
    //TANTO SEM PLANO⚠️

    //Construtor vazio
    public Cliente(){
        this.nomeDoCliente = "Sem nome do cliente";
        this.cpfDoCliente = "Sem cpf do cliente";
        this.enderecoDoCliente = "Sem endereco do cliente";
        this.telefoneDoCliente = "Sem telefone do cliente";
        this.planoDoCliente = null;
    }


    //Construtor sem o plano do cliente - Sem isso teria q sempre passar o plano do cliente como null.
    public Cliente(String nomeDoCliente, String cpfDoCliente, String enderecoDoCliente, String telefoneDoCliente){
        setNomeDoCliente(nomeDoCliente); //usa os sets para validar os dados passados nos parametros.
        setCpfDoCliente(cpfDoCliente);
        setEnderecoDoCliente(enderecoDoCliente);
        setTelefoneDoCliente(telefoneDoCliente);
        this.planoDoCliente = null;
    }

    //Construtor Completo

    public Cliente(String nomeDoCliente, String cpfDoCliente, String enderecoDoCliente, String telefoneDoCliente, Planos planoDoCliente){
        setNomeDoCliente(nomeDoCliente);
        setCpfDoCliente(cpfDoCliente);
        setEnderecoDoCliente(enderecoDoCliente);
        setTelefoneDoCliente(telefoneDoCliente);
        setPlanoDoCliente(planoDoCliente);
    }

















    //METODOS
    
    public void MostrarDadosDoCliente(){
        System.out.printf("\n----DADOS DO CLIENTE----");
        System.out.printf("\nNome do cliente: %s", nomeDoCliente);
        System.out.printf("\nCpf do cliente: %s", cpfDoCliente);
        System.out.printf("\nEndereco do cliente: %s", enderecoDoCliente);
        System.out.printf("\nTelefone do cliente: %s", telefoneDoCliente);
        System.out.printf("\n------------------------");


    }






    //Gets e sets - Encapsulamento: protege os dados da classe - O get serve para o sistema ler o nome do cliente. 
    //- o set serve para cadastrar o nome ou alterar o nome

    public String getNomeDoCliente(){
        return nomeDoCliente;
    }

    public void setNomeDoCliente(String nomeDoCliente){
        if(nomeDoCliente == null || nomeDoCliente.trim().isEmpty()){
            System.out.println("O nome do cliente nao deve ser vazio ou conter apenas espacos!");
            return;
        }
        for(int i = 0; i < nomeDoCliente.length(); i++){
            if(Character.isDigit(nomeDoCliente.charAt(i))){
                System.out.println("O nome do cliente nao pode conter numeros!");
                return;
            }}
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpfDoCliente(){
        return cpfDoCliente;
    }

    public void setCpfDoCliente(String cpfDoCliente){
        if(cpfDoCliente == null || cpfDoCliente.trim().isEmpty()){
            System.out.println("O cpf do cliente nao deve ser vazio ou conter apenas espacos!");
            return;
        }

            this.cpfDoCliente = cpfDoCliente;
    }


    public String getEnderecoDoCliente(){
        return enderecoDoCliente;
    }
    
    public void setEnderecoDoCliente(String enderecoDoCliente){
        if(enderecoDoCliente == null || enderecoDoCliente.trim().isEmpty()){
            System.out.println("O endereco do cliente nao deve ser vazio ou conter apenas espacos!");
            return;
        }
            this.enderecoDoCliente = enderecoDoCliente;}
    

    public String getTelefoneDoCliente(){  
        return telefoneDoCliente;
    }

    public void setTelefoneDoCliente(String telefoneDoCliente){
        if(telefoneDoCliente == null || telefoneDoCliente.trim().isEmpty()){
            System.out.println("O telefone do cliente nao deve ser vazio ou conter apenas espacos!");
            return;
        }
        this.telefoneDoCliente = telefoneDoCliente;
    }

    public Planos getPlanoDoCliente(){
        return planoDoCliente;
    }

    public void setPlanoDoCliente(Planos planoDoCliente){
        if(planoDoCliente == null){
            System.out.println("O plano do cliente nao pode estar vazio!");
            return;
        }

        this.planoDoCliente = planoDoCliente;
    }

    


}
