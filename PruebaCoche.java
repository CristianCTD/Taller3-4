public class PruebaCoche {
    public static void main(String[] args) {
        // Al inicio, no se ha creado ningún coche.
        System.out.println("Coches creados inicialmente: " + Coche.getContadorCoches());

        Coche c1 = new Coche("Ford", "Mustang");
        System.out.println("Se creó el coche: " + c1.getMarca() + " " + c1.getModelo());
        System.out.println("Coches creados ahora: " + Coche.getContadorCoches());

        Coche c2 = new Coche("Tesla", "Model 3");
        System.out.println("Se creó el coche: " + c2.getMarca() + " " + c2.getModelo());

        // Se llama al método estático directamente desde la clase.
        System.out.println("Total de coches creados: " + Coche.getContadorCoches());
    }
}