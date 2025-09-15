public class Persona {
    private String nombre;

    public static void mostrarNombre() {
     
        System.out.println(nombre);
    }
}
public class Persona {
    private static String nombre = "Ana";

    public static void mostrarNombre() {
        System.out.println(nombre);
    }
}
public class Persona {
    private String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarNombre() {
        System.out.println(this.nombre);
    }
}
