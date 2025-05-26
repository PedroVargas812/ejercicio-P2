package figuras;

public abstract class
figuras {
    protected double x, y;

    public figuras(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String mostrarOrigen() {
        return "Origen: (" + x + ", " + y + ")";
    }

    public abstract double perimetro();
    public abstract double area();
}
