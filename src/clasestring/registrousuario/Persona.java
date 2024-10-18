/*Crea una clase Persona con los siguientes atributos:

nombreUsuario: que es el nombre de usuario (tipo String).
contraseña: que es la clave del usuario (tipo String).
nombreCompleto: nombre completo del usuario (tipo String).
fechaNacimiento: año de nacimiento del usuario (tipo String).*/

package clasestring.registrousuario;

public class Persona {
    private String nombreUsuario;
    private String contrasena;
    private String nombreCompleto;
    private String fechaNacimiento;

    //Constructor
    public Persona(String nombreUsuario, String contrasena, String nombreCompleto, String fechaNacimiento) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
    }
    //Constructor Vacio
    public Persona(){
    }
    //Getters
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    public String getPassword(){
        return contrasena;
    }
    public String getNombreCompleto(){
        return nombreCompleto;
    }
    public String getFechaNacimiento(){
        return fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", contrasena='" + contrasena + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
