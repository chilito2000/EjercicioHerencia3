public class Electrodomestico extends dispositivoElectronico {
    private String tipo;
    private double consumoEnergetico;

    public Electrodomestico(String Marca, String Modelo, String tipo, double consumoEnergetico) {
        super(Marca, Modelo);
        this.tipo = tipo;
        this.consumoEnergetico = consumoEnergetico;
    }

    public String getTipo() {
        return tipo;
    }

    public double getConsumoEnergetico() {
        return consumoEnergetico;
    }

    @Override
    public void encender() {
        System.out.println("El electrodoméstico está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El electrodoméstico está apagado.");
    }

    public static void main(String[] args) {
        Electrodomestico refri = new Electrodomestico("LG", "InstaView", "Refrigerador", 1.2);

        System.out.println("Marca: " + refri.getMarca());
        System.out.println("Modelo: " + refri.getModelo());
        System.out.println("Tipo: " + refri.getTipo());
        System.out.println("Consumo Energético: " + refri.getConsumoEnergetico() + " kWh");

        refri.encender();
        refri.apagar();
    }
}

