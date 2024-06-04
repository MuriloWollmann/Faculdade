import java.util.Date;

public class App {
    public static void main(String[] args) throws Exception {
        Pedido pedido = new Pedido(1, new Date(), 10.0); // Exemplo com desconto de 10%

        pedido.adicionarItem("Pão", 2, 5.0);
        pedido.adicionarItem("Sabonete", 1, 12.0);
        pedido.adicionarItem("Chocolate", 3, 7.0);

        double total = pedido.totalizarPedido();
        System.out.println("Total do Pedido: " + total);
    }
}