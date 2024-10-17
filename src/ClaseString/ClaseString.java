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
        System.out.println("Ingrese un caracter: ");
        String caracter = sc.nextLine();
        //length - calcula la cantidad de caracteres en una cadena de texto
        texto.length();
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

        if(texto.startsWith("A") || texto.startsWith("a")){
            System.out.println("La cadena empieza con A o a");
        }else{
            System.out.println("Empieza con otra cosa");
        }

        if (cantidadTexto > 10){
            String mini = texto.substring(3,11);
            System.out.println(mini);
        }
        else{
            System.out.println("La palabra tiene menos de 10 caracteres");

        }

/*5.- solicite al usuario que ingrese una cadena de texto y luego un caracter
y que imprima la posicion de la primera aparicion de ese caracter indexOf(‘caracter’)
6. solicite al usuario que ingrese una cadena de texto y luego un caracter
y que imprima la posicion del ultimo aparicion de ese caracter lastIndexOf(‘caracter’)
7. charAt(n) Verifica si la cadena empieza con la letra "A".
8. charAt(n) solicitar que elimine los espacios de la cadena de texto. (replace)
9. toLowerCase() Convierte la cadena a minusculas
10. equals(“cad”) solicitar 2 cadenas de texto y luego comparar si son iguales.
11. equalsIgnoreCase(“cad”) solicitar 2 cadenas de texto y luego imprimir ambas cadenas
ignorando los espacios.
12. valueOf(n) solicitar un numero entero y luego imprimir ese numero convertido en una
cadena de texto.
      */
        // 5.
        //System.out.println("Ingrese una cadena de texto: ");
        //String texto = sc.nextLine();

        int indicePrimeraLetra = texto.indexOf(caracter);
        System.out.println("El indice de esa letra es: " + indicePrimeraLetra);


        //6. solicite al usuario que ingrese una cadena de texto y luego un caracter
        //y que imprima la posicion del ultimo aparicion de ese caracter lastIndexOf(‘caracter’)
        //System.out.println("Ingrese un una cadena de texto: ");
        //String texto = sc.nextLine();
        //System.out.println("Ingrese un caracter: ");
        //String caracter = sc.nextLine();
        int indiceUltimaLetra = texto.lastIndexOf(caracter);
        System.out.println("La posicion de caracter es: " + indiceUltimaLetra);

        // 7. charAt(n) Verifica si la cadena empieza con la letra "A" o "a"
        System.out.println("Ingrese un texto: ");
        String texto2 = sc.nextLine();
        if(texto2.charAt(0) == 'A' || texto2.charAt(0) =='a') {
            System.out.println("La cadena comienza con la letra A o a");
        }
        else{
            System.out.println("La cadena no comienza con la letra A o a");
        }
    }
}
