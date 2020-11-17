import java.util.Scanner;

public class Practica5Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pido una frase
        String texto = scanner.nextLine();

        // Pido un carácter
        String caracter = scanner.nextLine();

        int primeraOcurrencia = texto.indexOf(caracter);

        if (primeraOcurrencia == -1) {
            System.out.println("El caracter " + caracter + " no está");
        }else {

            int ultimaOcurrencia = texto.lastIndexOf(caracter);
            System.out.println("El caracter " + caracter + " sí está.\n"
                    + "\nPrimera ocurrencia: " + primeraOcurrencia
                    + "\nÚltima ocurrencia: " + ultimaOcurrencia);
        }
    }
}
