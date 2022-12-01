public class Distribuicao extends Projeto {    private String descAlimento;
    private  float qtde;


    public Distribuicao(String nomeProjeto, String descricao, String dataInicio, String dataFim,
            String descAlimento, float qtde) {
        super(nomeProjeto, descricao, dataInicio, dataFim, descAlimento);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }

    @Override
    public boolean ValidaProjeto() {
        if (super.getDatafim().isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String ImprimeProjeto() {
        return null;
    }

    public String getDescAlimento() {
        return descAlimento;
    }

    public void setDescAlimento(String descAlimento) {
        this.descAlimento = descAlimento;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }

    @Override
    public String toString() {
        return " nomeProjeto=" + super.getNomeProjeto() + ", descricao=" + super.getDescricao() + ", dataInicio=" + super.getDatafim()
        + ", dataFim=" + super.getDatafim() + "descAlimento=" + getDescAlimento() + ", qtde=" + getQtde();
    }
    
}
