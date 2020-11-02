import java.util.Scanner;

public class Ordenar3NumerosMenorAMayor {

    /* Variables globales */
    private int numero1;
    private int numero2;
    private int numero3;

    /**
     * Lee tres números entrados por teclado y los guarda en las variables globales
     */
    public void leer3Numeros() {
        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        numero3 = scanner.nextInt();
    }

    /**
     * Ordena de menor a mayor los tres números almacenados en las variables globales
     */
    public void ordenarNumeros() {

        if (numero3 < numero2) {
            int aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }

        if (numero2 < numero1) {
            int aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        if (numero3 < numero2) {
            int aux = numero2;
            numero2 = numero3;
            numero3 = aux;
        }
    }

    /**
     * Muestra por pantalla los tres números almacenados en las 3 variables globales
     */
    public void mostrarNumeros() {
        System.out.print("Números ordenados: ");
        System.out.print(numero1 + " ");
        System.out.print(numero2 + " ");
        System.out.print(numero3 + " ");
    }

    /**
     * Método inicio
     */
    public void inicio() {
        // Aquí introduciremos las
        // instrucciones del método principal
        leer3Numeros();
        ordenarNumeros();
        mostrarNumeros();
    }

    public static void main(String[] args) {
        // Aquí es necesario escribir el nombre
        // de la clase que estamos desarrollando
        // y seguir esta estructura para llamar al método inicio
        Ordenar3NumerosMenorAMayor programa = new Ordenar3NumerosMenorAMayor();
        programa.inicio();
    }

}
