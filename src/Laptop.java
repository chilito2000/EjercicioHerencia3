public class Laptop extends Computadora {
    private double peso;
    private int bateriaDuracion;
    private String procesador;
    private int memoriaRam;

    public Laptop(String Marca, String Modelo, boolean tactil, double peso, int bateriaDuracion, String procesador, int memoriaRam) {
        super(Marca, Modelo, tactil);
        this.peso = peso;
        this.bateriaDuracion = bateriaDuracion;
        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
    }

    public double getPeso() {
        return peso;
    }

    public int getBateriaDuracion() {
        return bateriaDuracion;
    }

    public String getProcesador() {
        return procesador;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    @Override
    public void encender() {
        System.out.println("La laptop está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La laptop está apagada.");
    }

    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "XPS 13", true, 1.2, 10, "Intel Core i7", 16);

        System.out.println("Marca: " + laptop.getMarca());
        System.out.println("Modelo: " + laptop.getModelo());
        System.out.println("Es táctil: " + laptop.isTactil());
        System.out.println("Peso: " + laptop.getPeso() + " kg");
        System.out.println("Duración de la batería: " + laptop.getBateriaDuracion() + " horas");
        System.out.println("Procesador: " + laptop.getProcesador());
        System.out.println("Memoria RAM: " + laptop.getMemoriaRam() + " GB");

        laptop.encender();
        laptop.apagar();
    }
}
