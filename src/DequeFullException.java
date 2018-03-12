/**
 * Obligatorisk oppgave 1
 * @author rut005, Thomas Sebastian Rognes
 *
 * Deque Full Exception klasse
 */

public class DequeFullException extends RuntimeException {

    public DequeFullException(){
        super();
    }

    public DequeFullException(String message){
        super(message);
    }

    public DequeFullException(String message, Throwable cause){
        super(message, cause);
    }

    public DequeFullException(Throwable cause){
        super(cause);
    }
}
