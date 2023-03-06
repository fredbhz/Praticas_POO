package game;

public class GamePC extends Game{
    String SistemaOperacional;
    int processamento;
    //se o jogo é 64x ou 32x

    public GamePC(
            String nome,
            String modo,
            String tipoJogo,
            String categoria,
            String genero,
            String SistemaOperacional,
            int processamento) {

        super(nome, modo, tipoJogo, categoria, genero);
        this.SistemaOperacional = SistemaOperacional;
        this.processamento = processamento;
    }

    public String getSistemaOperacional() {
        return SistemaOperacional;
    }

    public void setSistemaOperacional(String sistemaOperacional) {
        SistemaOperacional = sistemaOperacional;
    }

    public int getProcessamento() {
        return processamento;
    }

    public void setProcessamento(int processamento) {
        this.processamento = processamento;
    }

    @Override
    public void visualizar(){
        System.out.println("Nome: " + getNome() +
                " Categoria: " + getCategoria() +
                " Gênero: " + getGenero() +
                " Modo de Jogo: " + getModo() +
                " Tipo de Jogo: " + getTipoJogo() +
                " Sistema Operacional: " + getSistemaOperacional() +
                " Tipo de processamento: " + getProcessamento());
    }
}
