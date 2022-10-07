public class Distribuicao extends Projeto {
    private String descAlimento;
    private float qtde;
    public Distribuicao(String nomeProjeto, String descricao, String endereco, String datainicio, String datafim,
            String descAlimento, float qtde) {
        super(nomeProjeto, descricao, endereco, datainicio, datafim);
        this.descAlimento = descAlimento;
        this.qtde = qtde;
    }
    
    public boolean validadeProjeto(){

        return false;}

    public  String imprimeProjeto(){
        
        return descAlimento;

    }

    

    
}
