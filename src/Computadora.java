import java.util.ArrayList;
import java.util.List;

public class Computadora extends dispositivoElectronico {
    private boolean tactil;
    private List<Integer> anioFabricacionList;

    public Computadora(String Marca, String Modelo, boolean tactil) {
        super(Marca, Modelo);
        this.tactil = tactil;
        this.anioFabricacionList = new ArrayList<>();
    }

    public boolean isTactil() {
        return tactil;
    }

    public void addAnioFabricacion(int anio) {
        anioFabricacionList.add(anio);
    }

    public List<Integer> getAnioFabricacionList() {
        return anioFabricacionList;
    }

    @Override
    public void encender() {
        System.out.println("La computadora está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La computadora está apagada.");
    }

    public static void main(String[] args) {
        Computadora comp = new Computadora("HP", "Spectre x360", true);
        comp.addAnioFabricacion(2021);
        comp.addAnioFabricacion(2022);

        System.out.println("Marca: " + comp.getMarca());
        System.out.println("Modelo: " + comp.getModelo());
        System.out.println("Es táctil: " + comp.isTactil());
        System.out.println("Años de fabricación: " + comp.getAnioFabricacionList());

        comp.encender();
        comp.apagar();
    }
}

