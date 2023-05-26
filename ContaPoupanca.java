public class ContaPoupanca extends Conta implements Investimento{
    public ContaPoupanca(int numero, String nome_titular, double saldo) {
        super(numero, nome_titular, saldo);
    }

    public void reajustar(double d){
        System.out.println("Sua conta será reajustada em " + d);
    }
}
