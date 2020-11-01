import java.util.Scanner;

public class Ejemplo1Metodos {

    private String nombre = "Roberto"; //Si la definimo aquí es una variable global,
                            // y puede ser accesible desde cualquier parte del programa

    public void escribeHola() {
        //String nombre = "Roberto"; // Es una variable local y sólo podrá ser accedida
        // desde el bloque donde se ha definido, en este caso es local al método escribeHola

        System.out.println("Hola " + nombre);
    }

    public void escribeAdios() {
        System.out.println("Adiós" + nombre);
    }

    public void inicio() {
        Scanner scanner = new Scanner(System.in);
        int numero3 = scanner.nextInt();

        if (numero3 > 0) {
            int numero1 = scanner.nextInt();
            int numero2 = scanner.nextInt();
            System.out.println(numero1 + numero2);
        }

        escribeAdios();
    }

    /*
    Vamos a usar esta estructura para comenzar cualquier programa que vamos a realizar en esta Unidad
    Es obligatorio que hagamos un método inicio y que lo invoquemos desde el método main
     */
    public static void main(String[] args) {
        Ejemplo1Metodos programa = new Ejemplo1Metodos();
        programa.inicio();
    }
}
