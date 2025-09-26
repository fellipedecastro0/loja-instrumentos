public class Acessorio extends Produto{
    private String material;

    public Acessorio(int codigo, String nome, Double preco, Categoria categoria, String material) {
        super(codigo, nome, preco, categoria);

        this.material = material;
    }

    public String getMaterial() {
        return this.material;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();

        System.out.println("Material: " + this.material);
    }
}
