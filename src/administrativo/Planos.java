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


    //Metodos

    public void exibirDadosDoPlano(){
        System.out.printf("\n----Informacoes Dos Planos----");
        System.out.printf("\nNome do plano: %s", nomeDoPlano);
        System.out.printf("\nPorcentagem de desconto: %.2f%%", porcentagemDoDesconto);
        System.out.printf("\nMensalidade do cliente: %.2f", mensalidadeDoCliente);
        System.out.printf("\n-------------------------------");
    }








    //gets e sets - metodos de acesso
    public String getNomeDoPlano(){
        return nomeDoPlano;
    }

    public void setNomeDoPlano(String nomeDoPlano){
        this.nomeDoPlano = nomeDoPlano;
    }

    public float getPorcentagemDoDesconto(){
        return porcentagemDoDesconto;
    }

    public void setPorcentagemDoDesconto(float porcentagemDoDesconto){
        this.porcentagemDoDesconto = porcentagemDoDesconto;
    }

    public float getMensalidadeDoCliente(){
        return mensalidadeDoCliente;
    }
    
    public void setMensalidadeDoCliente(float mensalidadeDoCliente){
        this.mensalidadeDoCliente = mensalidadeDoCliente;
    }

    
}
