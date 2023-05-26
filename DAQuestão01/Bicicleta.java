public class Bicicleta implements PegadaDeCarbono {

    private String modelo;
    private double consumo;


    public Bicicleta(String modelo, double consumo) {
        this.modelo = modelo;
        this.consumo = consumo;
    }


    public String getModelo() {
        return modelo;
    }
    public double getConsumo() {
        return Consumo;
    }

    @Override
    public double getPegadaDeCarbono(){
        return consumo * 1;
    }
}