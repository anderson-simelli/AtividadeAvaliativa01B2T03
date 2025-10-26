package avaliativa;

//Classe simples para controlar estoque
public class ProdutoEstoque {
 private String nome;
 private int quantidade;

 public void definirProduto(String n, int q) {
     nome = n;
     quantidade = q;
 }

 public void adicionar(int qtd) {
     quantidade = quantidade + qtd;
 }

 public void remover(int qtd) {
     if (quantidade >= qtd) {
         quantidade = quantidade - qtd;
     } else {
         System.out.println("Estoque insuficiente");
     }
 }

 public void mostrarQuantidade() {
     System.out.println("Produto: " + nome + " | Quantidade: " + quantidade);
 }
}
