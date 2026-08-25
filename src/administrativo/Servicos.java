//Parte de JEANNE

/*Catálogo de Serviços e Preços: Cadastrar o que a clínica oferece (banho, vacina) e os
preços. Enquadramento POO: Classes e Atributos.*/

/*LEMBRAR DE DAR PULL E PUSH E FAZER APENAS AS PARTES CONFORME AS AULAS DE IVNA, SEM PRESSA 


E DE UTILIZAR DURANTE O PROJETO OS 4 PILARES DE POO: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIFORMISMO
*/

package administrativo;

public class Servicos {
    private String nomeDoServico;
    private float precoBase; 
    
    //Metodos

    public void catalogoDeServicos(){
        System.out.printf("\n----Catalogo De Servicos----");
        System.out.printf("\nNome do servico: %s", nomeDoServico);
        System.out.printf("\nPreco base do servico: %.2f", precoBase);
        System.out.printf("\n----------------------------");


    }








    //Gets e sets - metodos de acesso

    public String getNomeDoServico(){
        return nomeDoServico;
    }

    public void setNomeDoServico(String nomeDoServico){
        this.nomeDoServico = nomeDoServico;
    }

    public float getPrecoBase(){
        return precoBase;
    }

    public void setPrecoBase(float precoBase){
        this.precoBase = precoBase;
    }

}
