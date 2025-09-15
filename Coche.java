public class Coche {
    private String marca;
    private String modelo;
    // Es mejor práctica hacer las variables estáticas privadas
    private static int contadorCoches = 0;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

    // Un "getter" estático para el contador es más flexible que un método que imprime.
    public static int getContadorCoches() {
        return contadorCoches;
    }

    // Getters para las propiedades de la instancia
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}
