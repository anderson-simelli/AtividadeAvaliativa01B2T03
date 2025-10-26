package avaliativa;

//Classe que representa uma música simples
public class Musica {
 private String titulo;
 private int duracaoSegundos;

 public void definirTitulo(String t) {
     if (t != null && t != "") {
         titulo = t;
     } else {
         System.out.println("Título inválido");
     }
 }

 public void definirDuracao(int d) {
     if (d > 0) {
         duracaoSegundos = d;
     } else {
         System.out.println("Duração inválida");
     }
 }

 // Mostra a duração no formato minutos e segundos
 public void mostrarDuracao() {
     int minutos = duracaoSegundos / 60;
     int segundos = duracaoSegundos % 60;
     System.out.println(titulo + " - " + minutos + "m " + segundos + "s");
 }
}

