//Parte de JEANNE

/*Gestão dos Planos de Saúde: Cadastrar opções de planos e vincular ao cliente.
Enquadramento POO: Classes, Atributos, Herança e Polimorfismo. */

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 


E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/

package administrativo;

public class Planos{
    //Atributos
    private String nomeDoPlano;
    private float porcentagemDoDesconto;
    private float mensalidadeDoCliente;


    //CONSTRUTORES

    //construtor vazio
    public Planos(){

    }

    public Planos(String nomeDoPlano, float porcentagemDoDesconto, float mensalidadeDoCliente){
        setNomeDoPlano(nomeDoPlano);
        setPorcentagemDoDesconto(porcentagemDoDesconto);
        setMensalidadeDoCliente(mensalidadeDoCliente);
    }



























    //Metodos

    public void exibirDadosDoPlano(){
        System.out.printf("\n----Informacoes Dos Planos----");
        System.out.printf("\nNome do plano: %s", nomeDoPlano);
        System.out.printf("\nPorcentagem de desconto: %.2f%%", porcentagemDoDesconto);
        System.out.printf("\nMensalidade do cliente: %.2f", mensalidadeDoCliente);
        System.out.printf("\n-------------------------------");
    }








    //gets e sets - metodos de acesso e validação de dados

    public String getNomeDoPlano(){
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano){
        if(nomeDoPlano == null || nomeDoPlano.trim().isEmpty()){ 
            System.out.println("O nome do plano nao pode ser vazio ou conter apenas espacos");
            return;
        }


        for(int i = 0; i < nomeDoPlano.length(); i++){
            if(Character.isDigit(nomeDoPlano.charAt(i))){
                System.out.println("O nome do plano nao pode conter numeros!");
                return;
            }}


            this.nomeDoPlano = nomeDoPlano;
    }

    public float getPorcentagemDoDesconto(){
        return porcentagemDoDesconto;
    }

    public void setPorcentagemDoDesconto(float porcentagemDoDesconto){
        if(porcentagemDoDesconto <= 0 || porcentagemDoDesconto > 100){
            System.out.println("A porcentagem de desconto deve ser entre 0 e 100!");
    }   else{
            this.porcentagemDoDesconto = porcentagemDoDesconto;}
    }



    public float getMensalidadeDoCliente(){
        return mensalidadeDoCliente;
    }
    
    public void setMensalidadeDoCliente(float mensalidadeDoCliente){
        if(mensalidadeDoCliente <= 0){
            System.out.println("A mensalidade do cliente deve ser maior que 0!");
        }
        else{
            this.mensalidadeDoCliente = mensalidadeDoCliente;}
    }

    
}
