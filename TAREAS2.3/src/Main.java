
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre del titular de la cuenta: ");
        String nombre;
        nombre=sc.nextLine();
        CuentaBancaria cta1=new CuentaBancaria(nombre, 0);
        cta1.mostrarInformacion();
        System.out.printf("Ingrese el monto a depositar: ");
        double monto;
        monto=sc.nextDouble();
        cta1.depositar(monto);
        cta1.mostrarInformacion();
        System.out.println("Ingrees el monto que desea retirar: ");
        double montoR;
        montoR= sc.nextDouble();
        cta1.retirar(montoR);
        cta1.mostrarInformacion();
    }

}