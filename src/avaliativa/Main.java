package avaliativa;

//Classe principal que testa todos os exercícios
public class Main {
 public static void main(String[] args) {

     System.out.println("=== Conta Bancária ===");
     ContaBancaria c = new ContaBancaria();
     c.definirTitular("João");
     c.depositar(100);
     c.sacar(30);
     c.mostrarSaldo();
     
     System.out.println("\n=== Filme ===");
     Filme f1 = new Filme();
     f1.definirTitulo("Matrix");
     f1.definirAvaliacao(4.5);
     f1.exibir();
     Filme f2 = new Filme();
     f2.definirTitulo("Toy Story");
     f2.definirAvaliacao(5.0);
     f2.exibir();
     
     System.out.println("\n=== Funcionário ===");
	 Funcionario func = new Funcionario();
	 func.definirNome("Maria");
	 func.definirSalario(2000);
	 System.out.println("Salário antes do aumento: R$ " + 2000);
	 func.aumentarSalario(10);
	 func.mostrarSalario();
     
	 System.out.println("\n=== Retângulo ===");
     Retangulo r = new Retangulo();
     r.definirLargura(4);
     r.definirAltura(3);
     System.out.println("Área: " + r.calcularArea());
     System.out.println("Perímetro: " + r.calcularPerimetro());
     
     System.out.println("\n=== Música ===");
	  Musica musica1 = new Musica();
	  musica1.definirTitulo("Céu Azul");
	  musica1.definirDuracao(200);
	  Musica musica2 = new Musica();
	  musica2.definirTitulo("Baqueado");
	  musica2.definirDuracao(155);
	  musica1.mostrarDuracao();
	  musica2.mostrarDuracao();

     System.out.println("\n=== Pessoa ===");
     Pessoa p = new Pessoa();
     p.definirDados("Carlos", 70, 1.75);
     System.out.println("IMC: " + p.calcularIMC());
     System.out.println("Classificação: " + p.classificacaoIMC());

     System.out.println("\n=== Conta de Luz ===");
	  ContaLuz conta = new ContaLuz();
	  conta.definirConsumo(250); 
	  conta.definirValor(0.80);
	  double total = conta.calcularTotal();
	  System.out.println("Valor a pagar: R$ " + total);

     System.out.println("\n=== Bicicleta Alugada ===");
     BicicletaAlugada b = new BicicletaAlugada();
     b.definirHoras(3);
     b.definirValorHora(10);
     System.out.println("Total: R$ " + b.calcularValor());

     System.out.println("\n=== Produto Estoque ===");
     ProdutoEstoque prod = new ProdutoEstoque();
     prod.definirProduto("Parafuso", 100);
     prod.adicionar(20);
     prod.remover(50);
     prod.mostrarQuantidade();

     System.out.println("\n=== Temperatura ===");
     Temperatura t = new Temperatura();
     t.definirCelsius(25);
     t.mostrarConversao();
 }
}
