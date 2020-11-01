public class InvocarMetodos {

    private String nombre = "Roberto"; //Si la definimos aquí es una variable global,
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
        escribeHola(); // Se invoca al método escribeHola
        escribeAdios(); // Se invoca al método escribeAdios
    }

    /*
    Vamos a usar esta estructura para comenzar cualquier programa que vamos a realizar en esta Unidad
    Es obligatorio que hagamos un método inicio y que lo invoquemos desde el método main
     */
    public static void main(String[] args) {
        InvocarMetodos programa = new InvocarMetodos();
        programa.inicio();
    }
}
