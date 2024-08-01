abstract class dispositivoElectronico {
    private String Marca;
    private String Modelo;

    public dispositivoElectronico(String Marca, String Modelo) {
        this.Marca = Marca;
        this.Modelo = Modelo;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }


    public abstract void encender();


    public abstract void apagar();
}




