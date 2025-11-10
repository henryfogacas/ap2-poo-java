public class Moto extends Veiculo {
    
    private int cilindrada;
  
    @Override
    public String informacoesVeiculo() {
        return "Moto: " + marca + " " + modelo + 
               "\n  - Ano: " + getAno() + 
               "\n  - Cilindrada: " + getCilindrada() + "cc";
    }
    
    public int getCilindrada() {
        return this.cilindrada;
    }
    
    public void setCilindrada(int cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            this.cilindrada = 50;
        }
    }
}