package trabajoGrupo3;

public class Telefono {
    private String marca;
    private String numero;
    private Bateria bateria;

    public Telefono (String marca, String numero, Bateria bateria) {

    }
    //metodos
    private boolean bateriaBaja()
    {
        if (nivelActual<=15)
            return true;
        else
            return false;
    }

    public void cargarBateria() 
    {
        setNivelActual(this.nivelActual+cantidad) 
        
    }

    private int estimarDuracion()

}
