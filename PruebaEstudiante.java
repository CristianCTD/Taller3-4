public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante e1 = new Estudiante("Ana", 20, 4.5);

        System.out.println("Nombre: " + e1.getNombre());
        System.out.println("Edad: " + e1.getEdad());
        System.out.println("Nota promedio: " + e1.getNotaPromedio());

        e1.setEdad(-3); 
        System.out.println("Edad corregida: " + e1.getEdad());
    }
}
