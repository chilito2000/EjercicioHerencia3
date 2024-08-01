public class Tablet extends dispositivoMovil {
    private String tipoPantalla;
    private boolean soportePen;

    public Tablet(String Marca, String Modelo, String red, String tipoPantalla, boolean soportePen) {
        super(Marca, Modelo, red);
        this.tipoPantalla = tipoPantalla;
        this.soportePen = soportePen;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public boolean isSoportePen() {
        return soportePen;
    }

    @Override
    public void encender() {
        System.out.println("La tablet está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La tablet está apagada.");
    }

    public static void main(String[] args) {
        Tablet tablet = new Tablet("Samsung", "Galaxy Tab S8", "5G", "AMOLED", true);

        System.out.println("Marca: " + tablet.getMarca());
        System.out.println("Modelo: " + tablet.getModelo());
        System.out.println("Red: " + tablet.getRed());
        System.out.println("Tipo de pantalla: " + tablet.getTipoPantalla());
        System.out.println("Soporte para lápiz óptico: " + tablet.isSoportePen());

        tablet.encender();
        tablet.apagar();
    }

    private String getRed() {
        return "";
    }
}

}
