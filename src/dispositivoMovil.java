public class dispositivoMovil extends dispositivoElectronico {
    private String sistemaOperativo;
    private int capacidadBateria;

    public dispositivoMovil(String Marca, String Modelo, String sistemaOperativo, int capacidadBateria) {
        super(Marca, Modelo);
        this.sistemaOperativo = sistemaOperativo;
        this.capacidadBateria = capacidadBateria;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    @Override
    public void encender() {
        System.out.println("El dispositivo móvil está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El dispositivo móvil está apagado.");
    }

    public static void main(String[] args) {
        dispositivoMovil movil = new dispositivoMovil("Apple", "iPhone 12", "iOS", 2815);

        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Sistema Operativo: " + movil.getSistemaOperativo());
        System.out.println("Capacidad de la batería: " + movil.getCapacidadBateria() + " mAh");

        movil.encender();
        movil.apagar();
    }
}
