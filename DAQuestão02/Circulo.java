public class Circulo implements Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI *raio;
    }

    @Override
    public double area() {
        return raio * raio * Math.PI;
    }

    
}
