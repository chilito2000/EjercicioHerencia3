public class Desktop extends Computadora {
    private String tipoGabinete;
    private int puertosUSB;

    public Desktop(String Marca, String Modelo, boolean tactil, String tipoGabinete, int puertosUSB) {
        super(Marca, Modelo, tactil);
        this.tipoGabinete = tipoGabinete;
        this.puertosUSB = puertosUSB;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    @Override
    public void encender() {
        System.out.println("El desktop está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El desktop está apagado.");
    }

    public static void main(String[] args) {
        Desktop desktop = new Desktop("Dell", "Optiplex 7070", false, "Torre", 8);

        System.out.println("Marca: " + desktop.getMarca());
        System.out.println("Modelo: " + desktop.getModelo());
        System.out.println("Es táctil: " + desktop.isTactil());
        System.out.println("Tipo de gabinete: " + desktop.getTipoGabinete());
        System.out.println("Número de puertos USB: " + desktop.getPuertosUSB());

        desktop.encender();
        desktop.apagar();
    }
}

