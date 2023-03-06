package cliente;

public class ClientePessoaFisica extends Cliente{
    boolean pendencia;
    public ClientePessoaFisica(
            String nome,
            String CPF,
            String email,
            String numeroTel,
            String usuario,
            int senha,
            boolean pendencia) {
        super(nome, CPF, email, numeroTel, usuario, senha);
        this.pendencia = pendencia;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    @Override
    public void visualizar(){
        System.out.println("Esses são os seus dados do cadastro:" +
                "\n Nome: "+ getNome() +
                "\n CPF: " + getCPF() +
                "\n email: " + getEmail() +
                "\n usuario: " + getUsuario() +
                "\n tefone: " + getNumeroTel());
    }

    public void solicitarCartao(){
        if(isPendencia()){
            System.out.println("pague suas contas antes de pedir um cartão novo!");
        }else{
            System.out.println("Parabéns, o seu crédito foi aprovado :D");
        }
    }
}
