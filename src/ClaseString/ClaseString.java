/*
Escribe un programa en Java que realice las siguientes tareas:

Solicita al usuario que introduzca una cadena de texto y realiza las siguientes operaciones:
1. Cuenta cuántos caracteres tiene la cadena.++
2. Convierte la cadena a mayúsculas. ++
3. Verifica si la cadena empieza con la letra "A".
4. Si la cadena tiene más de 10 caracteres, devuelve una subcadena que incluya desde el carácter 3 hasta el 10 (ambos incluidos).


 */
package ClaseString;
import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto;
        System.out.println("Escribe el texto: ");
        texto = sc.nextLine();
        //texto.length()
        int cantidadTexto = texto.length();
        System.out.println("Longitud de texto: "+ cantidadTexto );

        String textoMayusculas = texto.toUpperCase();
        System.out.println("Texto en mayúsculas: " + textoMayusculas);
        //texto.startsWith

        if(texto.startsWith("A")){
            System.out.println("La cadena empieza con A");
        }else if(texto.startsWith("a")) {
            System.out.println("La cadena empieza con a");
        }else{
            System.out.println("Empieza con otra cosa");
        }

        /*if(texto.startsWith("A") || texto.startsWith("a")){
            System.out.println("La cadena empieza con A o a");
        }else{
            System.out.println("Empieza con otra cosa");
        }*/

        if (cantidadTexto > 10){
            String mini = texto.substring(3,11);
            System.out.println(mini);
        }
        else{
            System.out.println("La palabra tiene menos de 10 caracteres");

        }

    }
}
