package avaliativa;

//Classe que representa um funcionário
public class Funcionario {
 private String nome;
 private double salario;

 public void definirNome(String n) {
     if (n != null && n != "") {
         nome = n;
     } else {
         System.out.println("Nome inválido");
     }
 }

 public void definirSalario(double s) {
     if (s >= 0) {
         salario = s;
     } else {
         System.out.println("Salário inválido");
     }
 }

 // Aumenta o salário com base em um percentual
 public void aumentarSalario(double percentual) {
     if (percentual > 0) {
         salario = salario + (salario * percentual / 100);
     } else {
         System.out.println("Percentual inválido");
     }
 }

 public void mostrarSalario() {
     System.out.println("Salário atual de " + nome + ": R$ " + salario);
 }
}