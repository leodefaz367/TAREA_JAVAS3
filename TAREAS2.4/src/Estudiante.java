public class Estudiante extends Usuario {
    private double nota;
    public Estudiante(String nombre, double nota){
        super(nombre);
        this.nota=nota;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Nombre del Estudiante: "+ nombre + " Nota: "+ nota);

    }
}
