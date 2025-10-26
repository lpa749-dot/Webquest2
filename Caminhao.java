public class Caminhao extends Veiculo {
    private double capacidadeCarga; // atributo privado (em toneladas)

    // Construtor
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getter e Setter
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    // Sobrescreve o método calcularIpva()
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5.0) {
            return getValor() * 0.02;
        } else {
            return getValor() * 0.03;
        }
    }

    // Exibe informações completas do caminhão
    @Override
    public void exibirInfo() {
        System.out.println("=== DADOS DO CAMINHÃO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.printf("Capacidade de carga: %.2f toneladas%n", getCapacidadeCarga());
        System.out.printf("IPVA: R$ %.2f%n", calcularIpva());
        System.out.println("---------------------------");
    }

    // Método main opcional para testar individualmente
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("MNO-7890", "Volvo", "FH 540", 2020, 550000.00, 3.0);
        Caminhao c2 = new Caminhao("PQR-1122", "Mercedes-Benz", "Atego 2430", 2021, 420000.00, 7.0);

        c1.exibirInfo();
        System.out.println();
        c2.exibirInfo();
    }
}public class Caminhao extends Veiculo {
    private double capacidadeCarga; // atributo privado (em toneladas)

    // Construtor
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    // Getter e Setter
    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    // Sobrescreve o método calcularIpva()
    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5.0) {
            return getValor() * 0.02;
        } else {
            return getValor() * 0.03;
        }
    }

    // Exibe informações completas do caminhão
    @Override
    public void exibirInfo() {
        System.out.println("=== DADOS DO CAMINHÃO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.printf("Capacidade de carga: %.2f toneladas%n", getCapacidadeCarga());
        System.out.printf("IPVA: R$ %.2f%n", calcularIpva());
        System.out.println("---------------------------");
    }

    // Método main opcional para testar individualmente
    public static void main(String[] args) {
        Caminhao c1 = new Caminhao("MNO-7890", "Volvo", "FH 540", 2020, 550000.00, 3.0);
        Caminhao c2 = new Caminhao("PQR-1122", "Mercedes-Benz", "Atego 2430", 2021, 420000.00, 7.0);

        c1.exibirInfo();
        System.out.println();
        c2.exibirInfo();
    }
}
       
