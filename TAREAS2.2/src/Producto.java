/*
3. Implementa los tres tipos de constructores: uno con parámetros,
uno con valores fijos, y
uno vacío.
        4. Crea tres objetos usando cada tipo de constructor.
        5. Muestra los datos de cada objeto en consola.
*/

public class Producto {
    String nombre;
    double precio;
    int cantidad;

    static int contador = 0;
    int numeroProducto;
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;

        contador ++;
        numeroProducto = contador;
    }

    public Producto(boolean esAceite) {
        if (esAceite){
            this.nombre = "Aceite";
            this.precio = 1.50;
            this.cantidad = 2;

            contador ++;
            numeroProducto = contador;
        }

    }

    public Producto() {
        this.nombre = "Desconocido";
        this.precio = 0;
        this.cantidad = 0;
        contador ++;
        numeroProducto = contador;
    }

    public void mostrar(){
        System.out.println("Producto: " + numeroProducto);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("----------------------");
    }
 }

