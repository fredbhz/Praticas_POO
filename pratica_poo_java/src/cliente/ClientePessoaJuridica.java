package cliente;

public class ClientePessoaJuridica extends Cliente{
    String nomeEmpresa;

    public ClientePessoaJuridica(
            String nome,
            String CPF,
            String email,
            String numeroTel,
            String usuario,
            int senha,
            String nomeEmpresa) {
        super(nome, CPF, email, numeroTel, usuario, senha);
        this.nomeEmpresa = nomeEmpresa;
    }
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public void visualizar(){
        System.out.println("Esses são os seus dados do cadastro:" +
                "\n Nome: "+ getNome() +
                "\n CPF: " + getCPF() +
                "\n email: " + getEmail() +
                "\n usuario: " + getUsuario() +
                "\n telefone: " + getNumeroTel() +
                "\n Empresa: " + getNomeEmpresa());
    }
}
