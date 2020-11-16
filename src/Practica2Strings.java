import java.util.Scanner;

public class Practica2Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();

        for (int i = 0; i < texto.length(); i++) {

            char letra = texto.charAt(i);

            if (letra >= 'a' && letra <= 'z') {
                System.out.print((char)(letra-32));
            } else {
                System.out.print(letra);
            }
        }
    }
}
