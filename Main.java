public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario(1, "João");
        Produto guitarra = new Instrumento(101, "Guitarra", 1500.0, Categoria.CORDAS, "Cordas", "Fender");
        Produto baqueta = new Acessorio(201, "Baqueta", 50.0, Categoria.ACESSORIOS, "Madeira");


        f1.cadastrarProduto(guitarra);
        f1.cadastrarProduto(baqueta);
        Venda venda1 = f1.gerarVenda(1);

        venda1.adicionarProduto(guitarra, 1); // 1 guitarra
        venda1.adicionarProduto(baqueta, 2);  // 2 baquetas


        System.out.println("\n--- Itens da Venda #" + venda1.getId() + " ---");
        venda1.exibirItens(); // Chama o método para mostrar os produtos da venda.


        System.out.println("--------------------------");
        System.out.println("Valor total da venda: R$ " + String.format("%.2f", venda1.getValorTotal()));
    }
}
