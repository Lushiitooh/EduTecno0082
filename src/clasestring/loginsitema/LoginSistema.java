/*
Ejercicio a resolver:
Crea una lista de objetos Persona, en donde instancias al menos 3 personas con usuario y contraseña.
Solicita al usuario que ingrese su nombre de usuario y contraseña mediante la consola, y verifica si los datos coinciden con los de la lista de personas.

Si la verificación es correcta, permite que el usuario acceda a un menú con cuatro opciones:


Calcular la raíz cuadrada de un número.
Mostrar el valor de Pi.
Calcular la potencia de un número (base y exponente).
Salir


Si el usuario yla contraseña no coinciden, mostrar un mensaje de error.
 */

/*Crea una clase Persona con los atributos:

usuario: que es el nombre de usuario.(listo)
contraseña: que es la clave de acceso.(listo)

*/
package clasestring.loginsitema;


import java.util.ArrayList;
import java.util.Scanner;

public class LoginSistema {
    public static void main(String[] args) {
        // Crear lista de personas
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(new Persona("Luis","Luis321"));
        listaPersonas.add(new Persona("Alberto","Luis123"));
        listaPersonas.add(new Persona("Luis2","Luis145"));

        //Solicitar usuario y contraseña al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu usuario: ");
        String usuarioIngresado = sc.nextLine();
        System.out.println("Introduce tu contraseña: ");
        String contrasenaIngresada = sc.nextLine();

        //verificar usuario y contraseña
        boolean accesoPermitido = false;
        for(Persona persona : listaPersonas) {
            if (persona.getUsuario().equals(usuarioIngresado) && persona.getContrasena().equals(contrasenaIngresada)) {
                accesoPermitido = true;
                break;
            }
        }

        // si los son correctos, se muestra menu

        if(accesoPermitido) {
            inicioSesionMensaje();
            
            System.out.println("Usuario ingresado correctamente");
            
            int opcion;
            do{
                System.out.println("\n ---- MENú -----");
                System.out.println("1. Calcular la raíz cuadrada de un número.");
                System.out.println("2. Mostrar el valor de Pi.");
                System.out.println("3. Calcular la potencia de un número (base y exponente).");
                System.out.println("4. Salir");
                System.out.println("Selecciona una opción: ");
                opcion = sc.nextInt();

                switch(opcion){
                    case 1:
                        //calcular raiz cuadrada
                        System.out.println("Ingrese un numero para calcular su raiz cuadrada: ");
                        double num = sc.nextDouble();
                        System.out.println("La raiz cuadrada de " + num + " es " + Math.sqrt(num));
                        break;
                    case 2:
                        double  pi = 3.14 ; //Math.PI
                        //pi  = sc.nextDouble();
                        System.out.println("EL valor de pi es : " + pi);
                        break;
                    case 3:{ //calcular la potencia
                        double base, potencia;
                        System.out.println("Ingrese el número base de la potencia");
                        base = sc.nextDouble();
                        System.out.println("Ingrese el número del exponente de la potencia");
                        potencia = sc.nextDouble();
                        System.out.println("El resultado es " + Math.pow(base, potencia)); //Math.pow(a,b)
                        break;
                    }
                    case 4: {
                        finSesionMensaje();
                        sc.close();
                        break;
                    }
                    default:
                        System.out.println("Opción no válida");

                }
            } while (opcion != 4);
        }else{
            System.out.println("Usuario o contraseña son incorrectos. Acceso denegado.");
        }



        /*for (int i = 0; i < listaPersonas.size(); i++){

        }*/

    }

    public static void menuSleepResponse() {
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void inicioSesionMensaje() {
        System.out.print("Iniciando sesión");
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            menuSleepResponse();
        }
    }

    public static void finSesionMensaje() {
        System.out.print("Saliendo del programa");
        for (int i = 0; i < 3; i++) {
            System.out.print(". ");
            menuSleepResponse();
        }
    }
}
