
import Facade.Facade;
import Singleton.Singleton;
import Strategy.Strategy;
import Strategy.ComportamentoAgil;


public class Main {
    public static void main(String[] args) {

        //Singleton
        System.out.println(Singleton.retornaIstancia());

        //Strategy
        ComportamentoAgil c = new ComportamentoAgil();
        Strategy s = new Strategy();

        s.setComportamento(c);
        s.acao();

        //Facade
        Facade f = new Facade();
        f.migrar("Pedro");
    }
}