//Parte de JEANNE

/*Faturamento: Fechar a conta, somar serviços e aplicar descontos de planos.
Enquadramento POO: Métodos e Associação.*/

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 

E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/

package administrativo;

public class Faturamento {
    //Atributos
    private float valorTotalDaConta;
    private float valorDesconto;

    //Metodos


    public float calcularValorDaConta(){//nao precisa declarar parametros pois o metodo ja tem acesso as variaveis da classe

        float valorFinal = valorTotalDaConta - valorDesconto;
        return valorFinal;

    }

    public void exibirFatura(){
        System.out.printf("\n----Informacoes Da Conta----");
        System.out.printf("\nValor total da conta: %.2f", valorTotalDaConta);
        System.out.printf("\nValor do desconto: %.2f", valorDesconto);
        System.out.printf("Valor final a ser pago: %.2f", calcularValorDaConta());
    }


    //gets e sets - metodos acessores 

    public float getValorTotalDaConta(){
        return valorTotalDaConta;
    }

    public void setValorTotalDaConta(float valorTotalDaConta){
        this.valorTotalDaConta = valorTotalDaConta;
    }

    public float  getValorDesconto(){
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto){
        this.valorDesconto = valorDesconto;
    }


}
