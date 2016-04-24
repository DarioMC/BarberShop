package barberia;

public class Barberia {
    //Atributos
    private String nombre;
    private String contrasenia;
    
    //Métodos
    
    //Constructor
    Barberia(String nombre, String contrasenia){
        this.nombre = nombre;
        this.contrasenia = contrasenia;
    }
    
    public boolean ValidarIngreso(String contrasenia){
        boolean bandera = false;
        if(contrasenia == this.contrasenia){ // Si la contraseña ingresada es igual a la de la barberia el valor de bandera cambia a true
            bandera = true;
        }
        return bandera;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
