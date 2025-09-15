public class PruebaCoche2 {
    public static void main(String[] args) {
        // Ahora el constructor Coche2 existe y funciona
        Coche2 c1 = new Coche2("Toyota", "Corolla", 180);

        System.out.println("Marca: " + c1.getMarca());
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Velocidad inicial: " + c1.getVelocidadActual());

        c1.acelerar(20);
        System.out.println("Nueva velocidad tras acelerar: " + c1.getVelocidadActual());
    }
}
