package trabajoGrupo3;

public class Bateria {
    //atributos
    private int capacidad;
    private int nivelActual;
    //constructor
    public Bateria (int capacidad, int nivelActual) {
        this.capacidad=capacidad;
        this.nivelActual=nivelActual;
    }
    //get y set
    public int getCapacidad()
    {
        return capacidad;
    }
    public void setCapacidad(int capacidad)
    {
        this.capacidad=capacidad;
    }
    public int getNivelActual()
    {
        return nivelActual;
    }
    public void setNivelActual(int nivelActual)
    {
        if (nivelActual>capacidad) {
            this.nivelActual=capacidad;
        }
        else {
            this.nivelActual=nivelActual;
        } 
    }
    //cargar bateria
    public void cargar(int cantidad) {
        setNivelActual(this.nivelActual+cantidad);
    }

    //porcentaje de batería
    public int porcentaje() {
        return (nivelActual*100)/capacidad;
    }
    
    @Override
    public String toString() {
        return "Bateria [nivelActual=" + nivelActual + ", capacidad=" + capacidad + ", porcentaje=" + porcentaje() + "%]";
    }
}