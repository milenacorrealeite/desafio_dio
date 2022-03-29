package poo.model;
import java.util.ArrayList;
import java.util.List;
public class Cliente extends Endereco {

    public Integer codigo;
    private String nome;
    private String cpf;

    private List<Endereco> enderecos;
    private List<Conta> contas;


    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }
        if(endereco.numero == null){
            throw new NullPointerException("Numero não pode ser nulo");
        }
        if(endereco.bairro == null){
            throw new NullPointerException("Bairro não pode ser nulo");
        }
        if(endereco.complemento == null){
            throw new NullPointerException("Complemento não pode ser nulo");
        }
        if(endereco.estado == null){
            throw new NullPointerException("Estado não pode ser nulo");
        }
        if(endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo");
        }

        getEnderecos().add(endereco);
    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
    public void adicionaConta (ContaCorrente conta){
        if(conta == null){
            throw new NullPointerException("Conta não pode ser nulo");
        }
        getContas().add(conta);
    }
    private List<Conta> getContas() {
        if(contas == null){
            contas = new ArrayList<Conta>();
        }
        return contas;
    }
}
