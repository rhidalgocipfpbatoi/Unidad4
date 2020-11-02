import java.util.Scanner;

public class LeerEnteroTeclado {

    public static void main(String[] args) {
        LeerEnteroTeclado programa = new LeerEnteroTeclado();
        programa.inicio();
    }

    public void inicio() {
        int enteroLeido = leerEntero();
        enteroLeido += 5;
        System.out.println(enteroLeido);
    }

    public int leerEntero() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
