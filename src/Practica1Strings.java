import java.util.Scanner;

/** Dado un texto introducido por teclado
 * escribir el mismo por pantalla pero al revés
 */

public class Practica1Strings {

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            String texto = scanner.nextLine();

            for (int i = texto.length() - 1; i >= 0; i--) {
                char letra = texto.charAt(i);
                System.out.print(letra);
            }
    }

}
