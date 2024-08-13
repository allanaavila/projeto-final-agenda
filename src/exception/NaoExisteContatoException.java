package exception;

public class NaoExisteContatoException extends Exception {
    public NaoExisteContatoException() {
        super("Nao a contatos existentes");
    }
}
