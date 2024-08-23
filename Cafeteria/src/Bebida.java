public class Bebida extends ItemCardapio {
    private String tamanho;
    private String temperatura;

    public Bebida(String nome, double preco, String tamanho, String temperatura) {
        super(nome, preco);
        this.tamanho = tamanho;
        this.temperatura = temperatura;
    }

    @Override
    public double calcularPreco() {
        switch (tamanho.toLowerCase()) {
            case "médio":
                return this.getPreco() + 2;
            case "grande":
                return this.getPreco() + 4;
            default:
                return this.getPreco();
        }
    }

    @Override
    public String descrever() {
        return this.getNome() + " (" + tamanho + ", " + temperatura + ")";
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }
}
