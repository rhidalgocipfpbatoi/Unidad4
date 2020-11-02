public class MostraMaximo {

    public static void main(String[] args) {
        MostraMaximo programa = new MostraMaximo();
        programa.inicio();
    }

    public void inicio() {
        mostrarMaximo(4, 10);
        int numero = 3;
        mostrarMaximo(numero, numero+3*4/5);
    }

    public void mostrarMaximo(int a, int b) {
        System.out.println("El máximo entre " + a + " y "+ b + " es ");
        if (a > b) {
            System.out.println(a);
        } else if (a < b) {
            System.out.println(b);
        } else {
            System.out.println("Son iguales!");
        }
    }

}
