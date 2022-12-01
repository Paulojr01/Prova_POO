import javax.swing.JOptionPane;

public class Main {
    
        public static void main(String[] args)  {

            // PAgamento
    
            Pagamento pagamento1 = new Pagamento("06/10", 25, 250);

            JOptionPane.showMessageDialog(null, pagamento1.imprimirCupomFiscal(), null, 0);

            // pix
    
            Pix pix1 = new Pix("06/10", 25, 250, false);

            JOptionPane.showMessageDialog(null, pix1.imprimirCupomFiscal(), null, 0);

            // cartao de credito 
    
            CartaoCredito cc1 = new CartaoCredito("06/10", 23, 234324, null, "cvd", "Paulo");
    
            JOptionPane.showMessageDialog(null, cc1.imprimirCupomFiscal(), null, 0);

            // cartao Debito

    
            CartaoDebito cd1 = new CartaoDebito("06/10", 25, 250, "joao", "1234");

            JOptionPane.showMessageDialog(null, cd1.imprimirCupomFiscal(), null, 0);

    }
    
}
