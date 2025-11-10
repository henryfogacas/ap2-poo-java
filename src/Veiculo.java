public abstract class Veiculo {
    
    public String marca;
    public String modelo;
    private int ano;
    
    public abstract String informacoesVeiculo();
    
    public int getAno() {
        return this.ano;
    }
    
    public void setAno(int ano) {
      
        if (ano > 1880) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido. Definido como 0.");
            this.ano = 0;
        }
    }
}