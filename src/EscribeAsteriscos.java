/**
 * Práctica 9 de diapositivas (UT4.3)
 */

public class EscribeAsteriscos {

    public static void main(String[] args) {
        EscribeAsteriscos programa = new EscribeAsteriscos();
        programa.inicio();
    }

    /**
     * Método inicial
     */
    public void inicio() {
        escribeAsteriscos(8);
        escribeAsteriscos(20);
    }

    /**
     * Escribe el número de astericos dados
     * @param num Número de asteriscos a escribir
     */
    public void escribeAsteriscos(int num) {
        for (int i = 0; i < num; i++) {
            System.out.print("*");
        }
    }
}
