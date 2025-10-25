public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    // Construtor esperado pelas subclasses
    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    // Getters e setters
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public double calcularIpva() {
        return valor * 0.04;
    }

    public void exibirInfo() {
        System.out.println("=== DADOS DO VEÍCULO ===");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.printf("Valor: R$ %.2f%n", getValor());
        System.out.printf("IPVA: R$ %.2f%n", calcularIpva());
        System.out.println("-------------------------");
    }
}
