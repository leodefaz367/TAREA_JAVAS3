public class Main {
    public static void main() {
        Producto p1 = new Producto("Leche",1,5);
        p1.mostrar();
        Producto  p2 = new Producto(true);
        p2.mostrar();
        Producto p3 = new Producto();
        p3.mostrar();
    }
}