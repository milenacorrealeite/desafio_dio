package poo.model;

public class Endereco {

    public enum TipoEndereco {RESIDENCIAL, ENTREGA, TRABALHO}
    public String endereco;
    public String complemento;
    public String numero;
    public String bairro;
    public String estado;
    public String cep;
    public TipoEndereco tipo;
}
