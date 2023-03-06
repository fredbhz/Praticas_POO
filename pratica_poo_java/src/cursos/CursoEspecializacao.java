package cursos;

public class CursoEspecializacao extends Curso{
    boolean gradeCurricular;
    public CursoEspecializacao(String nome, String formacao, String duracao, String tipo, int valor, boolean gradeCurricular) {
        super(nome, formacao, duracao, tipo, valor);
        this.gradeCurricular = gradeCurricular;
    }

    public boolean isGradeCurricular() {
        return gradeCurricular;
    }

    public void setGradeCurricular(boolean gradeCurricular) {
        this.gradeCurricular = gradeCurricular;
    }

    @Override
    public void visualizar(){
        System.out.println("Curso: " + getNome() +
                "\nFormação: " + getFormacao() +
                "\nDuração: " + getDuracao() +
                "\nTipo: " + getTipo() +
                "\nValor: " + getValor() +
                "\nGrade Curricular: " + isGradeCurricular()
        );
    }
}
