public Rectangulo(double x, double y, double ancho, double alto) {
    super(x, y);
    this.ancho = ancho;
    this.alto = alto;
}

@Override
public double perimetro() {
    return 2 * (ancho + alto);
}

@Override
public double area() {
    return ancho * alto;
}
