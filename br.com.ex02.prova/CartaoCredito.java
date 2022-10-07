public class CartaoCredito extends Pagamento {

    private String numcartao;
    private String bandeiraCartao;
    private String titutalarCartao;

    public CartaoCredito(String dataHoraPagamento, int numeroPagamento, double valorPago) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
            this.numcartao = numcartao;
            this.bandeiraCartao = bandeiraCartao;
            this.titutalarCartao = titutalarCartao;
        }

    public String getNumcartao() {
        return numcartao;
    }

    public void setNumcartao(String numcartao) {
        this.numcartao = numcartao;
    }

    public String getBandeiraCartao() {
        return bandeiraCartao;
    }

    public void setBandeiraCartao(String bandeiraCartao) {
        this.bandeiraCartao = bandeiraCartao;
    }

    public String getTitutalarCartao() {
        return titutalarCartao;
    }

    public void setTitutalarCartao(String titutalarCartao) {
        this.titutalarCartao = titutalarCartao;
    }

   
    // "Pagamento [dataHoraPagamento=" + dataHoraPagamento + ", numeroPagamento=" + numeroPagamento
    //+ ", valorPago=" + valorPago + "]"


    @Override
    public String imprimirCupomFiscal () {
        return "Pagamento [dataHoraPagamento= " + super.getDataHoraPagamento()+ ", numeroPagamento=" + super.getNumeroPagamento()+ "numeroPagamento" + super.getNumeroPagamento() + "[numcartao=" + super.getNumeroPagamento()  + ", bandeiraCartao=" + bandeiraCartao + ", titutalarCartao=" + titutalarCartao + "]";
    }
    
}


