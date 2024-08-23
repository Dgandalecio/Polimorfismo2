public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        Bebida bebida1 = new Bebida("Cafe", 5, "Medio", "Quente");
        Bebida bebida2 = new Bebida("Suco", 6, "Grande", "Frio");

        Lanche lanche1 = new Lanche("Hamburguer", 10);
        lanche1.adicionarIngrediente("Queijo");
        lanche1.adicionarIngrediente("Bacon");

        Sobremesa sobremesa1 = new Sobremesa("Sorvete", 7, "Grande", 300);

        pedido.adicionarItem(bebida1);
        pedido.adicionarItem(bebida2);
        pedido.adicionarItem(lanche1);
        pedido.adicionarItem(sobremesa1);

        System.out.println("Descrição do Pedido:");
        pedido.descreverPedido();

        double total = pedido.calcularTotal();
        System.out.println("Total do Pedido: R$ " + total);
    }
}
