/*
Crea una clase con el metodo main() donde:

Solicites al usuario que ingrese sus datos (nombre de usuario, contraseña, nombre completo y año de nacimiento).

Valides la seguridad de la contraseña, que debe cumplir con:

Tener más de 10 caracteres.
Incluir al menos 2 letras mayúsculas.
Tener al menos 3 caracteres numéricos o símbolos especiales.
Verifiques si el usuario es mayor o menor de edad según el año de nacimiento.

Añadir al usuario a una lista de usuarios, hasta un máximo de 10 usuarios.
Muestres una lista actualizada de los usuarios registrados cada vez que se complete un registro.
 */
package clasestring.registrousuario;
import java.util.ArrayList;
import java.util.Scanner;

public class RegistroUsuario {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        ArrayList<Persona> listaUsuarios = new ArrayList<>();

        while (listaUsuarios.size() < 10) {
            System.out.println("Ingrese un nombre de usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese una contraseña: ");
            String contrasena = sc.nextLine();
            System.out.println("Ingrese su nombre completo: ");
            String nombreCompletoUsuario = sc.nextLine();
            System.out.println("Ingrese su año de nacimiento ejemplo 1992: ");
            String fechaNacimientoUsuario = sc.nextLine();

            //Validar la seguridad de la contraseña.
            if(!validarContrasena(contrasena)){
                System.out.println("La contraseña no cumple con los requisitos de seguridad.");
                continue;
            }

            //evaluar si el usurio es mayor de edad (mayor de 18 años)
            int añoActual = 2024;
            int añoNaciemiento = Integer.parseInt(fechaNacimientoUsuario);
            if(añoActual - añoNaciemiento >= 18){
                System.out.println("El usuario es mayor edad.");
            }else{
                System.out.println("El usuario es menor edad.");
            }

            //crear el nuevo usuario y añadirlo a la lista
            Persona nuevoUsuario = new Persona(usuario, contrasena, nombreCompletoUsuario, fechaNacimientoUsuario);
            listaUsuarios.add(nuevoUsuario);

            //Mostrar lista de usuarios registrados actualizada
            System.out.println("\nUsuarios registrados: ");
            for (Persona persona : listaUsuarios) {
                System.out.println(persona);
            }
            System.out.println("--------------------------------------");

        }
        System.out.println("La lista se encuentra llena. No se puede ingresar mas usuarios.");

    }





    //Metodo para validar la seguridad de la contraseña: 10 caracteres o mas
    public static boolean validarContrasena(String contrasena){
        if(contrasena.length()<=10){
            System.out.println("Contraseña debe tener más de 10 caracteres.");
            return false;
        }
        int contadorMayusculas = 0;//2
        int contadorNumerosSimbolos = 0;//3
        //hola
        for(int i=0; i<contrasena.length(); i++){
            char caracter = contrasena.charAt(i);
            if(Character.isUpperCase(caracter)){
                contadorMayusculas++;
            }else if(Character.isDigit(caracter) || !Character.isLetterOrDigit(caracter)){
                contadorNumerosSimbolos++;
            }
        }
    return contadorMayusculas >= 2 && contadorNumerosSimbolos >= 3;

    }

}
