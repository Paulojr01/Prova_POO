public class Mensalidade {
    private double valorMenssalidade;
    private int numeroIrmaos;

    public Mensalidade(double valorMenssalidade, int numeroIrmaos) {
        this.valorMenssalidade = valorMenssalidade;
        this.numeroIrmaos = numeroIrmaos;
    }
    
            public double calculaMensalidade(){
            if (this.numeroIrmaos == 1 ){
            this.valorMenssalidade = valorMenssalidade  * 0.95;
            return  valorMenssalidade;
            }

             else if (this.numeroIrmaos == 2){
            this.valorMenssalidade = valorMenssalidade  * 0.1;
            return  this.valorMenssalidade;
             }

        
                else if (this.numeroIrmaos <= 2) { 
                this.valorMenssalidade = valorMenssalidade  * 0.15;
                return this.valorMenssalidade;
                }

                return this.valorMenssalidade;
         }
    }
    

