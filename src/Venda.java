import java.util.Date;
import java.util.List;
import java.util.ArrayList;
public class Venda {
    private int id;
    private Date data;
    private List<ItemVenda> itens;
    private double valorTotal;

    public Venda(int id, Date data){
        this.id = id;
        this.data = data;
        this.valorTotal = 0.0;
        this.itens = new ArrayList<>();
    }

    public void adicionarProduto(Produto p, int qtd) {
        ItemVenda novoItem = new ItemVenda(p, qtd);
        this.itens.add(novoItem);
        this.valorTotal = calcularTotal();
    }
    public double calcularTotal() {
        double somaTotal = 0.0;

        for (ItemVenda item : this.itens) {
            somaTotal += item.getSubtotal();
        }

        return somaTotal;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public int getId() {
        return this.id;
    }


    public void exibirItens() {
        System.out.println("--------------------------");
        for (ItemVenda item : this.itens) {
            item.getProduto().exibirDetalhes();
            System.out.println("Quantidade: " + item.getQuantidade() + " | Subtotal: R$ " + String.format("%.2f", item.getSubtotal()));
            System.out.println("--------------------------");
        }
    }
}
