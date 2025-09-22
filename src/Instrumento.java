public class Instrumento extends Produto {
    private String tipo;
    private String marca;

    public Instrumento(int codigo, String nome, double preco, Categoria categoria, String tipo, String marca) {

        super(codigo, nome, preco, categoria);

        this.tipo = tipo;
        this.marca = marca;
    }

    public String getTipo() {
        return this.tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();

        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
    }


}
