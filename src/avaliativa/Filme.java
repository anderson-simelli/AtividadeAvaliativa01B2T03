package avaliativa;

//Classe que representa um filme com título e avaliação
public class Filme {
 private String titulo;
 private double avaliacao;

 // Define o título do filme
 public void definirTitulo(String t) {
     if (t != null && t != "") {
         titulo = t;
     } else {
         System.out.println("Título inválido");
     }
 }

 // Define a nota de avaliação (de 0 a 5)
 public void definirAvaliacao(double nota) {
     if (nota >= 0 && nota <= 5) {
         avaliacao = nota;
     } else {
         System.out.println("Avaliação deve ser entre 0 e 5");
     }
 }

 // Mostra o filme e sua avaliação
 public void exibir() {
     System.out.println("Filme: " + titulo + " | Avaliação: " + avaliacao);
 }
}
