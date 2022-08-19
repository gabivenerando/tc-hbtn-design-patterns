public class SalarioService {
    private CalculadorSalarioService calculador = CalculadorSalarioService.getCalculadorSalarioService();

    public double calcular(double salarioBruto, double valorDescontos, double valorVendas, double percentualComissao){
        double resultado = calculador.calcularSalarioLiquido(salarioBruto, valorDescontos, valorVendas, percentualComissao);
        return resultado;
    }

    public java.util.UUID getUuid(){
        return calculador.getUuid();
    }

}