package cliente;

public class Cliente {
    private String nome;
    private String CPF;
    private String email;
    private String numeroTel;
    private String usuario;
    private int senha;

    public Cliente(String nome, String CPF, String email, String numeroTel, String usuario, int senha){
        this.nome = nome;
        this.CPF = CPF;
        this.email = email;
        this.numeroTel = numeroTel;
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumeroTel() {
        return numeroTel;
    }

    public void setNumeroTel(String numeroTel) {
        this.numeroTel = numeroTel;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean acessarConta(String email, int senha){
        if(getEmail() == email && getSenha() == senha){
            System.out.println("Seja bem vindo de volta :D, " + getNome() + "!");
            return true;
        }
        System.out.println("por favor, verifique se seu email ou senha estão corretos");
        return false;
    }

    public void visualizar(){
        System.out.println("Esses são os seus dados do cadastro:" +
                "\n Nome: "+ getNome() +
                "\n CPF: " + getCPF() +
                "\n email: " + getEmail() +
                "\n usuario: " + getUsuario() +
                "\n telefone: " + getNumeroTel());
    }

}
