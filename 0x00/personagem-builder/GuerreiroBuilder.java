public class GuerreiroBuilder implements Builder {
    private String nome;
    private TipoPersonagem tipoPersonagem;
    private int inteligencia;
    private int forca;
    private int vigor;
    private int resistencia;
    private int destreza;

    public Guerreiro build(){
        return new Guerreiro( this.nome, this.inteligencia, this.forca, this.vigor, this.resistencia, this.destreza);
    }


    @Override
    public void setDestreza(int destreza) {
        this.destreza = destreza;
    }

    @Override
    public void setForca(int forca) {
        this.forca = forca;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setTipo(TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    @Override
    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    @Override
    public void setVigor(int vigor) {
        this.vigor = vigor;
    }

    @Override
    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }
}
