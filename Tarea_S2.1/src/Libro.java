import java.util.Scanner;

/*

• Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
• Crear un constructor.
• Crear un método mostrarInformacion() que imprima los datos del libro.
• Crear 2 objetos de tipo Libro y mostrar su información.

 */

public class Libro {
    String titulo;
    String autor;
    int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.anioPublicacion=anioPublicacion;
    }

    public void mostrarInformacion(){
        System.out.println("Libro:");
        System.out.println("Titulo: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("Año de Publicación: "+anioPublicacion);
    }
}

