package avaliativa;

//Classe que calcula o IMC de uma pessoa
public class Pessoa {
 private String nome;
 private double peso;
 private double altura;

 public void definirDados(String n, double p, double a) {
     nome = n;
     peso = p;
     altura = a;
 }

 // Calcula o IMC (peso / altura²)
 public double calcularIMC() {
     return peso / (altura * altura);
 }

 // Classifica o IMC
 public String classificacaoIMC() {
     double imc = calcularIMC();
     if (imc < 18.5) {
         return "Abaixo do peso";
     } else if (imc < 25) {
         return "Normal";
     } else if (imc < 30) {
         return "Sobrepeso";
     } else {
         return "Obesidade";
     }
 }
}