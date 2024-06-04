public class ItemPedido {
    int idItem;
    String descricao;
    int quantidade;
    double valorUnitario;

    ItemPedido(int idItem, String descricao, int quantidade, double valorUnitario) {
        this.idItem = idItem;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
}
