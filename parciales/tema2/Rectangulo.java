package parciales.tema2;

public class Rectangulo {
    //atributos
    private double altura;
    private double base;
    //constructor
    public Rectangulo(double altura, double base) {
        this.altura=altura;
        this.base=base;
    }
    //get y set
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura=altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base=base;
    }
    //metodos
   //metodo calcular area
    public double calcularArea() {
        return altura*base;
    }
    //metodo calcular perimetro
    public double calcularPerimetro() {
        return ((2*altura)+(2*base));
    }
    //metodo esMayorElArea(Rectangulo R)
    public boolean esMayorElArea(Rectangulo R) {
        return this.calcularArea()>R.calcularArea();
    }
    @Override
    public String toString() {
        return "Rectangulo [altura=" + altura + ", base=" + base + "]";
    }
}
