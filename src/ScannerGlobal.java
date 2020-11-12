import java.util.Scanner;

public class ScannerGlobal {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static int leerNumeroEntero() {
        return scanner.nextInt();
    }

    public static double leerNumeroReal(){
        return scanner.nextInt();
    }
}
