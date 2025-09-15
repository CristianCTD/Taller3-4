public class Coche2 {
    private String marca;
    private String modelo;
    // Es más claro llamarla 'velocidadActual' ya que es la que cambia.
    private double velocidadActual;

    // El constructor debe llamarse igual que la clase: Coche2
    public Coche2(String marca, String modelo, double velocidadInicial) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadInicial;
    }

    public String getMarca() {
        return marca;
    }
 
    public String getModelo() {
        return modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    // Método que acelera con validación
    public void acelerar(double incremento) {
        if (incremento > 0) {
            velocidadActual += incremento;
        }
    }
}
