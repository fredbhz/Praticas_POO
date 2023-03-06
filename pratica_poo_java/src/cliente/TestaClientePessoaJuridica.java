package cliente;

public class TestaClientePessoaJuridica {
    public static void main(String[] args) {
        ClientePessoaJuridica cliente4 = new ClientePessoaJuridica(
                "Benicio","012.013.014-15","benicio@gmail.com",
                "987651234","be_28",2811,"Mine");
        cliente4.visualizar();
    }
}
