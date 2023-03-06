package POO;

public class Pessoa {
    private String primeiroNome;
    private String segundoNome;
    private String ultimoNome;

    public Pessoa(String nome, String segundo, String ultimo){
        this.primeiroNome = nome;
        this.segundoNome = segundo;
        this.ultimoNome = ultimo;
    }

    public String getNomeCompleto(){
        return primeiroNome+ " " +segundoNome + " " +ultimoNome;
    }
}
