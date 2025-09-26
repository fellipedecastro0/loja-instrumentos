import java.util.ArrayList;
import java.util.List;
public class Funcionario {
    private int id;
    private String nome;
    private List<Produto> listaDeProdutos;
    private List<Venda> listaDeVendas;

    public Funcionario(int id, String nome) {
        this.id = id;
        this.nome = nome;

        this.listaDeProdutos = new ArrayList<>();
        this.listaDeVendas = new ArrayList<>();
    }

    public void cadastrarProduto(Produto p) {
        this.listaDeProdutos.add(p);
    }

    public Produto consultarProduto(int codigo) {

        for (Produto produto : this.listaDeProdutos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }


    public Venda gerarVenda(int idVenda) {
        Venda novaVenda = new Venda(idVenda, new java.util.Date());
        this.listaDeVendas.add(novaVenda);
        return novaVenda;
    }

    public Venda consultarVenda(int id) {
        for (Venda venda : this.listaDeVendas) {
            if (venda.getId() == id) {
                return venda;
            }
        }
        return null;
    }

}
