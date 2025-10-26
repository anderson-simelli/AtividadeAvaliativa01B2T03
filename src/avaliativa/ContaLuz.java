package avaliativa;

//Classe que calcula o valor da conta de luz
public class ContaLuz {
 private double consumoKwh;
 private double valorKwh;

 public void definirConsumo(double c) {
     consumoKwh = c;
 }

 public void definirValor(double v) {
     valorKwh = v;
 }

 public double calcularTotal() {
     return consumoKwh * valorKwh;
 }
}