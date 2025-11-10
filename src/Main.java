public class Main {
    
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro();
        
        meuCarro.marca = "Volkswagen";
        meuCarro.modelo = "Gol";
        meuCarro.setAno(2023);
        meuCarro.numeroPortas = 4;
        
        Moto minhaMoto = new Moto();
        
        minhaMoto.marca = "Kawasaki";
        minhaMoto.modelo = "Ninja";
        minhaMoto.setAno(2014);
        minhaMoto.setCilindrada(1000);
        
        System.out.println("--- Informações do Carro ---");
        System.out.println(meuCarro.informacoesVeiculo());
        
        System.out.println("\n--- Informações da Moto ---");
        System.out.println(minhaMoto.informacoesVeiculo());
    }
}