package exception;

public class NaoExisteContatoException extends Exception {
    public NaoExisteContatoException() {
        super("Não a contatos existentes");
    }
}
