/**
 * Obligatorisk oppgave 1
 * @author rut005, Thomas Sebastian Rognes
 *
 * Deque Empty Exception klasse
 */

public class DequeEmptyException extends RuntimeException {

    public DequeEmptyException(){
        super();
    }

    public DequeEmptyException(String message){
        super(message);
    }

    public DequeEmptyException(String message, Throwable cause){
        super(message, cause);
    }

    public DequeEmptyException(Throwable cause){
        super(cause);
    }
}
