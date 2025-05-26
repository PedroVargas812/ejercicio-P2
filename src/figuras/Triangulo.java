package figuras;

public class Triangulo extends Figura {
    private double a, b, c;

    public Triangulo(double x, double y, double a, double b, double c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double perimetro() {
        return a + b + c;
    }

    @Override
    public double area() {
        double s = perimetro() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}