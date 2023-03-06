package game;

public class Game {
    String categoria;
    //se tem restrição de idade
    String genero;
    //fantasia, açao
    String nome;
    //nome do jogo
    String modo;
    //RPG, LORE
    String tipoJogo;
    //se é singleplayer ou multiplayer

    public Game(String nome, String modo, String tipoJogo, String categoria, String genero){
        this.nome = nome;
        this.modo = modo;
        this.tipoJogo = tipoJogo;
        this.categoria = categoria;
        this.genero = genero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public String getTipoJogo() {
        return tipoJogo;
    }

    public void setTipoJogo(String tipoJogo) {
        this.tipoJogo = tipoJogo;
    }

    public void visualizar(){
        System.out.println("Nome: " + getNome() +
                " Categoria: " + getCategoria() +
                " Gênero: " + getGenero() +
                " Modo de Jogo: " + getModo() +
                " Tipo de Jogo: " + getTipoJogo());
    }
}
