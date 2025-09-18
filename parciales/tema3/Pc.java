package parciales.tema3;

public class Pc {
    //atributos
    private String marca;
    private String procesador;
    private double precio;
    private int ram;
    //constructor
    public Pc (String marca, String procesador, double precio, int ram) {
        this.marca=marca;
        this.procesador=procesador;
        this.precio=precio;
        this.ram=ram;
    }
    //get y set
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca=marca;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador=procesador;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio=precio;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram=ram;
    }
    //metodos
    //metodo actualizarRam
    public void actualizarRam(int nuevaRam) {
        if (nuevaRam>ram)
            ram=nuevaRam;
    }
    //metodo aplicarDescuento
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje>0 && porcentaje<=100) {
            precio=precio-(precio*porcentaje/100);
        }
    }
    //metodo mostrarInformacion
    public String mostrarInformacion() {
        return "Marca: "+ marca +", Procesador: "+ procesador +", Precio: " + precio+", RAM: "+ ram +"GB";
    }
    //metodo mayorRam
    public boolean mayorRam(Pc p) {
        return this.ram>p.ram;
    }
}
