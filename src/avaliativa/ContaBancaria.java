package avaliativa;

public class ContaBancaria {
    // Atributos (características)
    private String titular;
    private double saldo;

    // Método para definir o titular
    public void definirTitular(String nome) {
        if (nome != null && nome != "") {
            titular = nome;
        } else {
            System.out.println("Nome do titular inválido");
        }
    }

    // Método para depositar dinheiro
    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            System.out.println("Valor do depósito inválido");
        }
    }

    // Método para sacar dinheiro
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo = saldo - valor;
        } else {
            System.out.println("Saque inválido ou saldo insuficiente");
        }
    }

    // Método para mostrar o saldo atual
    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}