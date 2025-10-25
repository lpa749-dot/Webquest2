public class Carro extends Veiculo {
    private int numeroPortas;

    // Construtor
    public Carro(String placa, String marca, String modelo, int ano, double valor, int numeroPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numeroPortas = numeroPortas;
    }

    // Getter e Setter
    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    // Sobrescreve o cálculo do IPVA (3.5%)
    @Override
    public double calcularIpva() {
        return getValor() * 0.035;
    }

    // Exibe informações específicas do carro
    public void exibirInfo() {
        System.out.println("=== DADOS DO CARRO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.println("Número de portas: " + numeroPortas);
        System.out.printf("IPVA: R$ %.2f%n", calcularIpva());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Carro c1 = new Carro("ABC-1234", "Toyota", "Corolla", 2022, 120000.00, 4);
        Carro c2 = new Carro("XYZ-5678", "Honda", "Civic", 2021, 110000.00, 4);

        c1.exibirInfo();
        c2.exibirInfo();
    }
}
