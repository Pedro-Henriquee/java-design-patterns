package Facade;

public class ClienteAPI {

    private String nome;

    public ClienteAPI(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
