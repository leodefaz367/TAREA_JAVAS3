
import java.util.Scanner;


public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;
    Scanner sc= new Scanner(System.in);

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular=nombreTitular;
        this.saldo=saldo;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombreTitular);
        System.out.println("Saldo Actual: "+saldo);
    }

    public void depositar(double monto){
        if (monto>0){
            double nuevoSaldo=saldo+monto;
            saldo=nuevoSaldo;
            System.out.println("Deposito Exitoso");
        }
        else {
            System.out.println("Ingrese valores permitidos");
        }

    }
    public void retirar(double monto){

        if (monto>0){
            if (monto<saldo){
                double nuevoSaldo=saldo-monto;
                saldo=nuevoSaldo;
                System.out.println("Retiro con Exito...");
            }
            else{
                System.out.println("Saldo Insuficiente...");
            }
        }
        else {
            System.out.println("Ingrese valores permitidos");
        }

    }
}
