package game;

public class GameConsole extends Game{
    String TipoConsole;
    public GameConsole(String nome,
                       String modo,
                       String tipoJogo,
                       String categoria,
                       String genero,
                       String TipoConsole ) {
        super(nome, modo, tipoJogo, categoria, genero);
        this.TipoConsole = TipoConsole;
    }

    public String getTipoConsole() {
        return TipoConsole;
    }

    public void setTipoConsole(String tipoConsole) {
        TipoConsole = tipoConsole;
    }

    @Override
    public void visualizar(){
        System.out.println("Nome: " + getNome() +
                " Categoria: " + getCategoria() +
                " Gênero: " + getGenero() +
                " Modo de Jogo: " + getModo() +
                " Tipo de Jogo: " + getTipoJogo() +
                " Tipo de Console: " + getTipoConsole()
        );
    }
}
