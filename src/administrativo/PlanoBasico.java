package administrativo;

public class PlanoBasico extends Planos{
    private int quantidadeDeConsultasGratis;



    public PlanoBasico(){
        super(); //chama o construtor vazio de planos
        this.quantidadeDeConsultasGratis = 1;
    }

    public PlanoBasico(String nomeDoPlano, float porcentagemDeDesconto, float mensalidadeDoCliente, int quantidadeDeConsultasGratis){
        super(nomeDoPlano, porcentagemDeDesconto, mensalidadeDoCliente);
        setQuantidadeDeConsultasGratis(quantidadeDeConsultasGratis);
    }




    public int getQuantidadeDeConsultasGratis(){
        return quantidadeDeConsultasGratis;
    }
    
    public void setQuantidadeDeConsultasGratis(int quantidadeDeConsultasGratis){
        if(quantidadeDeConsultasGratis >= 0){
            this.quantidadeDeConsultasGratis = quantidadeDeConsultasGratis;
        }
        else{
            System.out.println("A quantidade de consultas nao pode ser menor que 0!");
        }


    }

}
