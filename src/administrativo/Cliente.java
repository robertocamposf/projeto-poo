//Parte de JEANNE

/*Cadastro de Clientes: Funcionalidade para registrar os donos dos animais. Enquadramento
POO: Classes, Atributos e Métodos. */

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

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
        this.nomeDoCliente = nomeDoCliente;
    }

    public String getCpfDoCliente(){
        return cpfDoCliente;
    }

    public void setCpfDoCliente(String cpfDoCliente){
        this.cpfDoCliente = cpfDoCliente;
    }

    public String getEnderecoDoCliente(){
        return enderecoDoCliente;
    }
    
    public void setEnderecoDoCliente(String enderecoDoCliente){
        this.enderecoDoCliente = enderecoDoCliente;
    }

    public String getTelefoneDoCliente(){  
        return telefoneDoCliente;
    }

    public void setTelefoneDoCliente(String telefoneDoCliente){
        this.telefoneDoCliente = telefoneDoCliente;
    }

    public Planos getPlanoDoCliente(){
        return planoDoCliente;
    }

    public void setPlanoDoCliente(Planos planoDoCliente){
        this.planoDoCliente = planoDoCliente;
    }

    


}
