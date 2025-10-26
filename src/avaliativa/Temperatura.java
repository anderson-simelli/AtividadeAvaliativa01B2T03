package avaliativa;

//Classe que converte temperatura de Celsius para outras escalas
public class Temperatura {
 private double celsius;

 public void definirCelsius(double c) {
     celsius = c;
 }

 public double paraFahrenheit() {
     return (celsius * 9 / 5) + 32;
 }

 public double paraKelvin() {
     return celsius + 273.15;
 }

 public void mostrarConversao() {
     System.out.println("Celsius: " + celsius);
     System.out.println("Fahrenheit: " + paraFahrenheit());
     System.out.println("Kelvin: " + paraKelvin());
 }
}