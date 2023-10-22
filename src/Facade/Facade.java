package Facade;
public class Facade {

    public void migrar(String nome) {
        ClienteAPI c = new ClienteAPI(nome);
        CrmService s = new CrmService();

        //Gravando
        s.gravarCliente(c.getNome());
    }
}
