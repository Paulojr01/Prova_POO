public class Pix extends Pagamento {
    private boolean transacaoPix;

    public Pix(String dataHoraPagamento, int numeroPagamento, double valorPago, boolean transacaoPix) {
        super(dataHoraPagamento, numeroPagamento, valorPago);
       this.transacaoPix = transacaoPix;
    }


    public boolean isTransacaoPix() {
        return transacaoPix;
    }

    public void setTransacaoPix(boolean transacaoPix) {
        this.transacaoPix = transacaoPix;
    }

    @Override
    public String imprimirCupomFiscal () {
        return "  Pagamento [dataHoraPagamento=" + super.getDataHoraPagamento() + ", numeroPagamento=" + super.getDataHoraPagamento()
        + ", valorPago=" + super.getValorPago()+ "]"  + "[transacaoPix=" + transacaoPix + "]";
    }

    
    
}
