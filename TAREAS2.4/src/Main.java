import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Estudiante");
        String nombreE;
        nombreE= sc.nextLine();
        Usuario user1=new Usuario(nombreE);
        System.out.println("Ingrese su nota final:");
        double notaF;
        notaF= sc.nextDouble();
        sc.nextLine();
        Estudiante e1 = new Estudiante(nombreE, notaF);
        System.out.println("Ingrese la contrasena");
        String password= sc.nextLine();
        e1.setContra(password);
        e1.mostrarInfo();
    }
}