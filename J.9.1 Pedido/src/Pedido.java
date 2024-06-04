import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    int idPedido;
    Date data;
    double valorDesconto;
    List<ItemPedido> itens;

    Pedido(int idPedido, Date data, double valorDesconto) {
        this.idPedido = idPedido;
        this.data = data;
        this.valorDesconto = valorDesconto;
        this.itens = new ArrayList<>();
    }

    void adicionarItem(String descricao, int quantidade, double valorUnitario) {
        int idItem = this.itens.size() + 1; // Simples geração de ID para o exemplo
        ItemPedido item = new ItemPedido(idItem, descricao, quantidade, valorUnitario);
        this.itens.add(item);
    }

    double totalizarPedido() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.valorUnitario * item.quantidade;
        }
        return total - this.valorDesconto;
    }
}