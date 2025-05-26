// Sebastian Hinojosa Andy Silva y Pedro Vargas
package figuras;
public class Geometria {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
                new Circulo(0, 0, 5),
                new Rectangulo(2, 3, 4, 6),
                new Triangulo(-1, -1, 3, 4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.getClass().getSimpleName());
            System.out.println(f.mostrarOrigen());
            System.out.printf("Perímetro: %.2f\n", f.perimetro());
            System.out.printf("Área: %.2f\n\n", f.area());
        }
    }
}