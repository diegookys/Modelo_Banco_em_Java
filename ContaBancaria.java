public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor; // saldo = valor + saldo
            System.out.println(""+valor+" depositado com sucesso!");
        } else{
            System.out.println("Falha! O valor precisa ser maior que 0.");
        }
    }

    public boolean sacar(double valor){
        if(valor <= 0){
            saldo -= valor;
            System.out.println("Valor inválido!");
            return false;
        } else if(valor > 0 && valor <= saldo){
            saldo -= valor;    // saldo = saldo - valor
            System.out.println("O Valor de "+valor+" foi sacado com sucesso.");
            return true;
        } else{
            System.out.println("Operação inválida! Saldo insuficiente");
            return false;
        }
    }
}
