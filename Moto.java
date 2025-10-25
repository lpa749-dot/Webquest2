public class Moto extends Veiculo {
    private int cilindradas;

    // Construtor
    public Moto(String placa, String marca, String modelo, int ano, double valor, int cilindradas) {
        super(placa, marca, modelo, ano, valor);
        this.cilindradas = cilindradas;
    }

    // Getter e Setter
    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    // Sobrescreve o cálculo do IPVA (2.5%)
    @Override
    public double calcularIpva() {
        return getValor() * 0.025;
    }

    // Exibe informações específicas da moto
    public void exibirInfo() {
        System.out.println("=== DADOS DA MOTO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.println("Cilindradas: " + cilindradas + " cc");
        System.out.printf("IPVA: R$ %.2f%n", calcularIpva());
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Moto m1 = new Moto("JKL-4321", "Yamaha", "MT-03", 2023, 28000.00, 300);
        Moto m2 = new Moto("QWE-8765", "Honda", "CB 500", 2022, 35000.00, 500);

        m1.exibirInfo();
        m2.exibirInfo();
    }
}
