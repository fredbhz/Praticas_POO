package cliente;

import POO.Pessoa;

public class TestaCliente {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana","Maria","Silva");
        System.out.println(pessoa1.getNomeCompleto());

        Cliente cliente1 = new Cliente("Ana Maria",
                "666.666.666-99",
                "teste@gmail.com",
                "34328961",
                "teste_13",
                12345);

        cliente1.acessarConta("anamaria2@gmail.com",12345);
        cliente1.visualizar();
    }
}
