package Strategy;

public class Strategy {
    private Comportamento comportamento;

    public Strategy() {
    }

    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void acao() {
        comportamento.mover();
    }
}
