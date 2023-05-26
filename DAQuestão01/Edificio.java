public class Edificio implements PegadaDeCarbono {

    private String tipo;
    private double consumo;

    public Edificio(String tipo,double consumo) {
        this.tipo = tipo;
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
        return this.consumo * 5;
    }
}