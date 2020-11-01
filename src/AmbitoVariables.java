import java.util.Scanner;

public class AmbitoVariables {

    public void inicio() {
        Scanner scanner = new Scanner(System.in);
        int numero3 = scanner.nextInt();

        if (numero3 > 0) {
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.println(numero1 + numero2);
        }
    }

    /*
    Vamos a usar esta estructura para comenzar cualquier programa que vamos a realizar en esta Unidad
    Es obligatorio que hagamos un método inicio y que lo invoquemos desde el método main
     */
    public static void main(String[] args) {
        AmbitoVariables programa = new AmbitoVariables();
        programa.inicio();
    }
}
