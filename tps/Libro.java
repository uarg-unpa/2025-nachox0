
public class Libro {
    //atributos
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private int cantidadPaginas;
    //constructor
    public Libro (String titulo, String autor, int anioPublicacion, int cantidadPaginas) {
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
        this.cantidadPaginas=cantidadPaginas;
    }
    //set y get
    public void set Titulo (String titulo) {
    this.titulo=titulo;
} 
    public String get Titulo (){
        return this.titulo;
}
    //...
    //metodos
    public boolean esReciente (){
        if (this.anioPublicacion>2010)
        else return true;
}