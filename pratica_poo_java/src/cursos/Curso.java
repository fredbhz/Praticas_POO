package cursos;

public class Curso {
    String nome;
    String formacao;
    //bachalerado, licenciatura, tecnologo
    String duracao;
    String tipo;
    //pós, graduação, mestrado e etc
    int valor;

    public Curso(String nome, String formacao, String duracao, String tipo, int valor){
        this.nome = nome;
        this.formacao = formacao;
        this.duracao = duracao;
        this.tipo = tipo;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void visualizar(){
        System.out.println("Curso: " + getNome() +
                "\nFormação: " + getFormacao() +
                "\nDuração: " + getDuracao() +
                "\nTipo: " + getTipo() +
                "\nValor: " + getValor()
        );
    }
}
