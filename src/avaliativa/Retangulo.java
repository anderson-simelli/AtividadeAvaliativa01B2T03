package avaliativa;

//Classe que calcula área e perímetro de um retângulo
public class Retangulo {
 private double largura;
 private double altura;

 public void definirLargura(double l) {
     if (l > 0) {
         largura = l;
     } else {
         System.out.println("Largura inválida");
     }
 }

 public void definirAltura(double a) {
     if (a > 0) {
         altura = a;
     } else {
         System.out.println("Altura inválida");
     }
 }

 // Calcula a área (base x altura)
 public double calcularArea() {
     return largura * altura;
 }

 // Calcula o perímetro (2 * (base + altura))
 public double calcularPerimetro() {
     return 2 * (largura + altura);
 }
}