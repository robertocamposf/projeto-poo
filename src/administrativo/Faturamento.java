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
    private Cliente cliente;
    private Servicos servico;

    //Construtores

    public Faturamento(){
        
    }

    public Faturamento(Cliente cliente, Servicos servico){
        setCliente(cliente);
        setServico(servico);
        processarFatura();
    }

    //Lógica para puxar o preço do serviço e o desconto do plano do cliente
    public void processarFatura() {
        if (servico != null) {
            this.valorTotalDaConta = servico.getPrecoBase();
        } else {
            this.valorTotalDaConta = 0.0f;
        }

        //Verifica se o cliente possui plano para aplicar o desconto
        if (cliente != null && cliente.getPlanoDoCliente() != null) {
            float porcentagem = cliente.getPlanoDoCliente().getPorcentagemDoDesconto();
            this.valorDesconto = (this.valorTotalDaConta * porcentagem) / 100.0f;
        } else {
            this.valorDesconto = 0.0f;
        }
    }



    //Metodos


    public float calcularValorDaConta(){//nao precisa declarar parametros pois o metodo ja tem acesso as variaveis da classe

        float valorFinal = valorTotalDaConta - valorDesconto;
        return valorFinal;

    }

    public void exibirFatura() {
        System.out.printf("%n---- Informacoes Da Fatura ----");
        if (cliente != null) {
            System.out.printf("%nCliente: %s", cliente.getNomeDoCliente());
            if (cliente.getPlanoDoCliente() != null) {
                System.out.printf("%nPlano Ativo: %s", cliente.getPlanoDoCliente().getNomeDoPlano());
            } else {
                System.out.printf("%nPlano Ativo: Sem plano cadastrado");
            }
        }
        if (servico != null) {
            System.out.printf("%nServico Prestado: %s", servico.getNomeDoServico());
        }
        System.out.printf("%nValor base da conta: R$ %.2f", valorTotalDaConta);
        System.out.printf("%nValor do desconto: R$ %.2f", valorDesconto);
        System.out.printf("%nValor final a ser pago: R$ %.2f", calcularValorDaConta());
        System.out.printf("%n-------------------------------%n");
    }

    //gets e sets - metodos acessores 

    public Cliente getcliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Servicos getServico(){
        return servico;
    }

    public void setServico(Servicos servico){
        this.servico = servico;
    }



    public float getValorTotalDaConta(){
        return valorTotalDaConta;
    }

    public void setValorTotalDaConta(float valorTotalDaConta){
        if(valorTotalDaConta <= 0){
            System.out.println("esse valor do total da conta nao e possivel!");
        }
        else{
            this.valorTotalDaConta = valorTotalDaConta;}
    }

    public float  getValorDesconto(){
        return valorDesconto;
    }

    public void setValorDesconto(float valorDesconto){
        if(valorDesconto < 0){
            System.out.println("esse valor de desconto nao e possivel!");
        }
        else{
            this.valorDesconto = valorDesconto;}
    }


}
