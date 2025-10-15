package parciales.tema4;
public class Vehiculo {
    //atributos
    private String tipo;
    private int velocidadMaxima;
    private double precio;
    //constructor
    public Vehiculo(String tipo, int velocidadMaxima, double precio) {
        this.tipo = tipo;
        this.velocidadMaxima = velocidadMaxima;
        this.precio = precio;
    }
    //get y set
    public String getTipo() {
        return tipo;
    }
    public void setTipo (String tipo) {
        this.tipo=tipo;
    }
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima=velocidadMaxima;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio=precio;
    }
    //metodos
    public void aplicarDescuento (double porcentaje) {
        if (porcentaje>0 && porcentaje<=100) {
            this.precio=this.precio-(this.precio*porcentaje/100);
        }
    }
    public void aumentarVelocidadMaxima (int incremento) {
        if (incremento>0) {
            this.velocidadMaxima=this.velocidadMaxima+incremento;
        }
    }
    public boolean mayorVelocidad (Vehiculo v) {
        return this.velocidadMaxima>v.getVelocidadMaxima();
    }
}
