public class CartaoDebito extends Pagamento{
    private String numCartao;
    private String titularCartao;

    public CartaoDebito(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
        this.numCartao = numCartao;
        this.titularCartao = titularCartao;
        //TODO Auto-generated constructor stub
    }
    
 

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public String getTitularCartao() {
        return titularCartao;
    }

    public void setTitularCartao(String titularCartao) {
        this.titularCartao = titularCartao;
    }

    @Override
    public String imprimirCupomFiscal () {

        " [dataHoraPagamento =" super.getDataHoraPagamento() + ", numeroPagamento=" + super.getNumeroPagamento()+ numeroPagamento + ", valorPago=" + super.getValorPago()+ "]";
        return "CartaoDebito [numCartao=" + numCartao + ", titularCartao=" + titularCartao + "]";
    }
        
}
