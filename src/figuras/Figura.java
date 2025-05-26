package figuras;

public abstract class Figura {
    protected double x, y;

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String mostrarOrigen() {
        return "Origen: (" + x + ", " + y + ")";
    }

    public abstract double perimetro();
    public abstract double area();
}