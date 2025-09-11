package trabajoGrupo3;

public class Telefono {
    //atributos
    private String marca;
    private String numero;
    private Bateria bateria;
    //constructor
    public Telefono (String marca, String numero, Bateria bateria) {
        this.marca=marca;
        this.numero=numero;
        this.bateria=bateria;
    }
    //get y set
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca=marca;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero=numero;
    }
    public Bateria getBateria() {
        return bateria;
    }
    public void setBateria (Bateria bateria) {
        this.bateria=bateria;
    }
    //metodos 
    //metodo bateria baja
    public boolean bateriaBaja() {
        return bateria.porcentaje()<=15;
    }
    //metodo cargar bateria
    public void cargarBateria(int cantidad) {
        bateria.cargar(cantidad);
    }
    //metodo estimar duración en horas
    public int estimarDuracion() {
        return bateria.getNivelActual()/100;
    }
    @Override
    public String toString() {
        return "Telefono [marca=" + marca + ", numero=" + numero + ", bateria=" + bateria + "]";
    }
}
