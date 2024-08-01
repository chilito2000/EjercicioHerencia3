public class Smartphone extends dispositivoMovil {
    private static int True;
    private String sistemaOperativo;
    private int capacidadBateria;

    public Smartphone(String Marca, String Modelo, String red,  int Camara, String sistemaOperativo, int capacidadBateria) {
        super(Marca, Modelo, red, Camara);
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
        System.out.println("El smartphone está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El smartphone está apagado.");
    }

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S21", "5G", True, "Android", 4000);
        System.out.println("Marca: " + smartphone.getMarca());
        System.out.println("Modelo: " + smartphone.getModelo());
        System.out.println("Red: " + smartphone.getRed());
        System.out.println("Tiene cámara: " + smartphone.isCamara());
        System.out.println("Sistema operativo: " + smartphone.getSistemaOperativo());
        System.out.println("Capacidad de la batería: " + smartphone.getCapacidadBateria() + " mAh");

        smartphone.encender();
        smartphone.apagar();
    }

    private String isCamara() {
        return "";
    }

    private String getRed() {
        return "";
    }
}
