package administrativo;

public class PlanoPremium extends Planos{
    private boolean banhoETosaIncluso;
    private float descontoMedicamentos;

    public PlanoPremium(){
        super();
        this.banhoETosaIncluso = true;
        this.descontoMedicamentos = 15.0f;
    }

    public PlanoPremium(String nomeDoPlano, float porcentagemDeDesconto, float mensalidadeDoCliente, boolean banhoETosaIncluso, float descontoMedicamentos) {
        super(nomeDoPlano, porcentagemDeDesconto, mensalidadeDoCliente);
        setBanhoETosaIncluso(banhoETosaIncluso);
        setDescontoMedicamentos(descontoMedicamentos);
    }


    public boolean isBanhoETosaIncluso(){
        return banhoETosaIncluso;
    }

    public void setBanhoETosaIncluso(boolean banhoETosaIncluso) {
        this.banhoETosaIncluso = banhoETosaIncluso;
    }

    public float getdescontoMedicamentos(){
        return descontoMedicamentos;
    }

    public void setDescontoMedicamentos(float descontoMedicamentos){
        if (descontoMedicamentos >= 0 && descontoMedicamentos <= 100) {
            this.descontoMedicamentos = descontoMedicamentos;
        } else {
            System.out.println("Desconto em medicamentos inválido!");
        }
    }
    



    
}
