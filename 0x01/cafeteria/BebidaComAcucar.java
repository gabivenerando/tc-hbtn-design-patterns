import java.util.ArrayList;
import java.util.List;

public class BebidaComAcucar extends BebidaDecorator{
    public BebidaComAcucar(Bebida bebidaDecorada) {
        super(bebidaDecorada);
    }

    @Override
    public List<String> obterIngredientes() {
        List<String> ingredientes = super.obterIngredientes();
        ingredientes.add("acucar");
        return ingredientes;
    }

    @Override
    public double obterPreco() {
        return 1.9 + super.obterPreco();
    }
}
