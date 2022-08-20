public class Impressao {
    private int paginasTotais;
    private int paginasColoridas;
    private boolean ehFrenteVerso;
    private double valorColoridasFrenteVerso;
    private double valorPretoBrancoFrenteVerso;
    private double valorColoridasFrenteApenas;
    private double valorPretoBrancoFrenteApenas;
    private TamanhoImpressao tamanhoImpressao;

    public Impressao(TamanhoImpressao tamanhoImpressao, int paginasTotais, int paginasColoridas, boolean ehFrenteVerso) {
        this.tamanhoImpressao = tamanhoImpressao;
        this.paginasTotais = paginasTotais;
        this.paginasColoridas = paginasColoridas;
        this.ehFrenteVerso = ehFrenteVerso;
    }

    public double calcularTotal(){
        if(getTamanhoImpressao() == TamanhoImpressao.A2 && !ehFrenteVerso ) {
            double valorColoridas = getPaginasColoridas() * 0.32;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.22;
            return valorPreta + valorColoridas;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A2 && ehFrenteVerso) {
            double valorColoridas = getPaginasColoridas() * 0.28;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.18;
            return valorPreta + valorColoridas;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A3 && !ehFrenteVerso) {
            double valorColoridas = getPaginasColoridas() * 0.30;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.20;
            return valorPreta + valorColoridas;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A3 && ehFrenteVerso) {
            double valorColoridas = getPaginasColoridas() * 0.25;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.15;
            return valorPreta + valorColoridas;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A4 && !ehFrenteVerso) {
            double valorColoridas = getPaginasColoridas() * 0.25;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.15;
            return valorPreta + valorColoridas;
        } else if (getTamanhoImpressao() == TamanhoImpressao.A4 && ehFrenteVerso) {
            double valorColoridas = getPaginasColoridas() * 0.20;
            double valorPreta = (getPaginasTotais() - getPaginasColoridas()) * 0.10;
            return valorPreta + valorColoridas;
        }
        return 0;
    }


    @Override
    public String toString() {
        String verificador;
        if (ehFrenteVerso){
            verificador = "frente e verso";
        }else {
            verificador = "frente apenas";
        }
        return String.format("total de paginas: %d, total coloridas: %d, total preto e branco: %d, %s. total: R$ %.2f", getPaginasTotais(), getPaginasColoridas(), getPaginasTotais() - getPaginasColoridas(),verificador,calcularTotal());
    }


    public int getPaginasTotais() {
        return paginasTotais;
    }

    public int getPaginasColoridas() {
        return paginasColoridas;
    }

    public TamanhoImpressao getTamanhoImpressao() {
        return tamanhoImpressao;
    }
}
