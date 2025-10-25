public class Caminhao extends Veiculo {
    private double capacidadeCarga; // em toneladas

    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga) {
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() { return capacidadeCarga; }
    public void setCapacidadeCarga(double capacidadeCarga) { this.capacidadeCarga = capacidadeCarga; }

    @Override
    public double calcularIpva() {
        if (capacidadeCarga <= 5) {
            return getValor() * 0.02;
        } else {
            return getValor() * 0.03;
        }
    }

    @Override
    public void exibirInfo() {
        // chama a exibição da superclasse (placa, marca, modelo, ano, valor, ipva)
        super.exibirInfo();
        // complementa com dados específicos do caminhão
        System.out.printf("Capacidade de Carga: %.1f toneladas%n", capacidadeCarga);
        System.out.println("-------------------------");
    }

    // main para testar apenas Caminhão
    public static void main(String[] args) {
        Caminhao cam1 = new Caminhao("CAM-6666", "Volvo", "FH 540", 2021, 450000.00, 6.0);
        Caminhao cam2 = new Caminhao("CAM-7777", "Mercedes", "Atego 2426", 2020, 380000.00, 4.5);

        cam1.exibirInfo();
        cam2.exibirInfo();
    }
}
