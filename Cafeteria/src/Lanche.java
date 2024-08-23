import java.util.ArrayList;
import java.util.List;

public class Lanche extends ItemCardapio {
    private List<String> ingredientes;

    public Lanche(String nome, double preco) {
        super(nome, preco);
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(String ingrediente) {
        ingredientes.add(ingrediente);
    }

    @Override
    public double calcularPreco() {
        return this.getPreco() + (ingredientes.size() * 2);
    }

    @Override
    public String descrever() {
        return this.getNome() + " com " + String.join(", ", ingredientes);
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
