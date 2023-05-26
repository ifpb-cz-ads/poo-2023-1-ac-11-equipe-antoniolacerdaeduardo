public class Carro implements PegadaDeCarbono {

    private String modelo;
    private double consumo; 

    public Carro(String modelo, double consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
    }

    public double getConsumo() {
        return consumo;
    }
    public String getModelo() {
        return modelo;
    }
    @Override
    public double getPegadaDeCarbono(){
        return this.consumo * 2;
    }
}