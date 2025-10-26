package avaliativa;

//Classe que calcula o valor do aluguel da bicicleta
public class BicicletaAlugada {
 private int horas;
 private double valorHora;

 public void definirHoras(int h) {
     horas = h;
 }

 public void definirValorHora(double v) {
     valorHora = v;
 }

 public double calcularValor() {
     return horas * valorHora;
 }
}
