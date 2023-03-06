package cursos;

public class CursoLivre extends Curso{
    String patrocinador;
    public CursoLivre(String nome, String formacao, String duracao, String tipo, int valor, String patrocinador) {
        super(nome, formacao, duracao, tipo, valor);
        this.patrocinador = patrocinador;
    }
    public String getPatrocinador() {
        return patrocinador;
    }

    public void setPatrocinador(String patrocinador) {
        this.patrocinador = patrocinador;
    }

    @Override
    public void visualizar(){
        System.out.println("Curso: " + getNome() +
                "\nFormação: " + getFormacao() +
                "\nDuração: " + getDuracao() +
                "\nTipo: " + getTipo() +
                "\nValor: " + getValor() +
                "\nPatrocinador: " + getPatrocinador()
        );
    }
}
