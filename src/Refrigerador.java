public class Refrigerador extends Electrodomestico {
    private int capacidad;
    private String tipo;

    public Refrigerador(String Marca, String Modelo, int voltaje, int capacidad, String tipo) {
        super(Marca, Modelo, "Refrigerador", voltaje);
        this.capacidad = capacidad;
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public void encender() {
        System.out.println("El refrigerador está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El refrigerador está apagado.");
    }

    public static void main(String[] args) {
        Refrigerador refrigerador = new Refrigerador("LG", "Xtreme Cool", 220, 500, "No Frost");

        System.out.println("Marca: " + refrigerador.getMarca());
        System.out.println("Modelo: " + refrigerador.getModelo());
        System.out.println("Voltaje: " + refrigerador.getVoltaje() + "V");
        System.out.println("Capacidad: " + refrigerador.getCapacidad() + " litros");
        System.out.println("Tipo de refrigerador: " + refrigerador.getTipo());

        refrigerador.encender();
        refrigerador.apagar();
    }

    private String getVoltaje() {
        return "";
    }

    public String getModelo() {
        return "";
    }

    public String getMarca() {
        return "";
    }
}
