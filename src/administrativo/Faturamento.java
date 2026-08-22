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
