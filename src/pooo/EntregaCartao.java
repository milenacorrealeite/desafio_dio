package pooo;
import poo.model.Cliente;
import poo.model.Endereco;
import java.util.ArrayList;

public class EntregaCartao  extends Cliente {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.numero = "123";
        endereco.bairro = "Bairro";
        endereco.complemento = "Complemento";
        endereco.estado = "SP";
        endereco.cep = "0000";
        //dados do endereço

        Cliente cliente = new Cliente();
        //dados do cliente

        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereço cadastrado com sucesso");

        } catch (Exception e) {
            System.out.println("Houve um erro:" + e.getMessage());

        }
    }
}
