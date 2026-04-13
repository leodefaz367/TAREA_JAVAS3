public class Usuario {
    protected String nombre;
    private String contra;

    public Usuario(String nombre){
        this.nombre=nombre;
    }

    public void setContra(String contra) {
        if (contra.length()>=8){
            this.contra=contra;
        }
        else {
            System.out.println("Contraseña inválida... mìnimo 8 caracteres");
        }
    }
    public String getNombre(){
        return nombre;
    }
    public void mostrarInfo(){
        System.out.println("Usuraio: "+ nombre);

    }
}
