public class Sobremesa extends ItemCardapio {
    private String tamanhoPorcao;
    private int contagemCalorias;

    public Sobremesa(String nome, double preco, String tamanhoPorcao, int contagemCalorias) {
        super(nome, preco);
        this.tamanhoPorcao = tamanhoPorcao;
        this.contagemCalorias = contagemCalorias;
    }

    @Override
    public double calcularPreco() {
        switch (tamanhoPorcao.toLowerCase()) {
            case "médio":
                return this.getPreco() + 3;
            case "grande":
                return this.getPreco() + 5;
            default:
                return this.getPreco();
        }
    }

    @Override
    public String descrever() {
        return this.getNome() + " (" + tamanhoPorcao + ", " + contagemCalorias + " calorias)";
    }

    public String getTamanhoPorcao() {
        return tamanhoPorcao;
    }

    public void setTamanhoPorcao(String tamanhoPorcao) {
        this.tamanhoPorcao = tamanhoPorcao;
    }

    public int getContagemCalorias() {
        return contagemCalorias;
    }

    public void setContagemCalorias(int contagemCalorias) {
        this.contagemCalorias = contagemCalorias;
    }
}
