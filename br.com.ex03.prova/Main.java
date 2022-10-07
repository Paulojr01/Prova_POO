public class Main {

    public static void main(String[] args) {

        // numero de irmãos igual a 1
        
            Mensalidade mens1 = new Mensalidade(100, 1);

            System.out.println("O valor da sua mensalidade é " + mens1.calculaMensalidade());

        // numero de irmãos igual a 2
        
        Mensalidade mens2 = new Mensalidade(100, 2);

        System.out.println("O valor da sua mensalidade é " + mens2.calculaMensalidade());
        
        // numero de irmãos igual a 3
        
        Mensalidade mens3 = new Mensalidade(100, 3);

        System.out.println("O valor da sua mensalidade é " + mens3.calculaMensalidade());

        // numero de irmãos igual a 0
    
        Mensalidade mens0 = new Mensalidade(100, 0);

        System.out.println("O valor da sua mensalidade é " + mens0.calculaMensalidade());
    }
    
}
