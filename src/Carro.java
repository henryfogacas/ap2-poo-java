public class Carro extends Veiculo {
    
    public int numeroPortas;
    
    @Override
    public String informacoesVeiculo() {
        return "Carro: " + marca + " " + modelo + 
               "\n  - Ano: " + getAno() + 
               "\n  - Portas: " + numeroPortas;
    }
}