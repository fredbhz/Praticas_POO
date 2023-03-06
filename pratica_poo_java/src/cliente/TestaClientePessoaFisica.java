package cliente;

public class TestaClientePessoaFisica {
    public static void main(String[] args) {
        ClientePessoaFisica cliente2 = new ClientePessoaFisica(
                "Luana",
                "111.333.111-11",
                "luana@gmail.com",
                "995123252",
                "lulu24",
                11111,
                true
        );

        ClientePessoaFisica cliente3 = new ClientePessoaFisica(
                "Joaquim ",
                "121.989.353-33",
                "joca@gmail.com",
                "968584785",
                "joca",
                22222,
                false
        );

        cliente2.visualizar();
        cliente2.solicitarCartao();
        cliente2.acessarConta("luiza@gmail.com",12345);

        cliente3.visualizar();
        cliente3.solicitarCartao();
    }

}
