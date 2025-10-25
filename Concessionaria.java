import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {

        ArrayList<Veiculo> estoque = new ArrayList<>();
        
        estoque.add(new Carro("FGJ-7834", "Toyota", "Corolla", 2022, 120000.00, 4));
        estoque.add(new Carro("FVS-5678", "Honda", "Civic", 2023, 135000.00, 4));
        
        estoque.add(new Moto("GHI-9012", "Yamaha", "MT-03", 2023, 32000.00, 300));
        estoque.add(new Moto("JKL-3456", "Honda", "CB 300F Twister", 2024, 28500.00, 300));

        estoque.add(new Caminhao("MNO-7890", "Volvo", "FH 540", 2020, 550000.00, 3));
        estoque.add(new Caminhao("PQR-1122", "Mercedes-Benz", "Atego 2430", 2021, 420000.00, 7));

        // Exibindo todos os veículos
        System.out.println("=== ESTOQUE DA CONCESSIONÁRIA ===\n");
        for (Veiculo v : estoque) {
            v.exibirInfo();
            System.out.println();
        }
    }
}
