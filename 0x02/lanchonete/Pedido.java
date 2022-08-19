import java.util.HashSet;

public class Pedido {

    private HashSet<ItemPedido> itensDentroCaixa = new HashSet<>();
    private HashSet<ItemPedido> itensForaCaixa = new HashSet<>();


    public HashSet<ItemPedido> getItensDentroCaixa() {
        return itensDentroCaixa;
    }

    public HashSet<ItemPedido> getItensForaCaixa() {
        return itensForaCaixa;
    }

    public void adicionarItemDentroCaixa(ItemPedido item) {
        itensDentroCaixa.add(item);
    }

    public void adicionarItemForaCaixa(ItemPedido item) {
        itensForaCaixa.add(item);
    }

    @Override
    public String toString() {
        String estaFora = "\tFora da Caixa:\n";

        for (ItemPedido item : itensForaCaixa) {
            estaFora += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        String estaDentro = "\tDentro da Caixa:\n";

        for (ItemPedido item : itensDentroCaixa) {
            estaDentro += String.format("\t\t- %s %s\n", item.getTipo(), item.getNome());
        }

        return estaFora + estaDentro;
    }


}