import java.util.Arrays;

/**
 * Obligatorisk oppgave 1
 * @author rut005, Thomas Sebastian Rognes
 *
 * ArrayDeque klasse
 */

public class ArrayDeque<E> implements IDeque<E> {

    private E[] mainArray;
    private int capacity;
    private int size;
    private int frontIndex;
    private int backIndex;


    public ArrayDeque(int capacity) {
        this.mainArray = (E[]) new Object[capacity];
        frontIndex = 0;
        backIndex = 0;
        this.capacity = capacity;
        size = 0;
    }


    /**
     * Retunerer hvor mange elementer samlingen inneholder.
     *
     * @return Størrelsen på samlingen.
     */
    @Override
    public int size() {
        return size;
    }


    /**
     * Legger til et element på begynnelsen av samlingen.
     *
     * @param elem Elementet som skal legges til.
     * @throws DequeFullException når det ikke er plass til
     *                            elementet.
     */
    @Override
    public void addFirst(E elem) throws DequeFullException {
        if (size == capacity) {
            throw new DequeFullException("The collection is full");
        }
        if (size == 0) {
            mainArray[frontIndex] = elem;
        } else {
            frontIndex = (frontIndex - 1 + capacity) % capacity;
            mainArray[frontIndex] = elem;
        }

        size++;
    }


    /**
     * Fjerner det første elementet fra samlingen og
     * returnerer det.
     *
     * @return Det første elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E pullFirst() throws DequeEmptyException {
        E item = null;
        if (size == 0) {
            throw new DequeEmptyException("The collection is empty");
        } else {
            item = mainArray[frontIndex];
            mainArray[frontIndex] = null;
            frontIndex = (frontIndex + 1) % capacity;
            size--;
        }
        return item;
    }

    /**
     * Retunerer det første elementet fra samlingen, men
     * fjerner det ikke.
     *
     * @return Det første elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E peekFirst() throws DequeEmptyException {
        if (size == 0) {
            throw new DequeEmptyException("The collection is empty");
        } else {
            return mainArray[frontIndex];
        }
    }


    /**
     * Legger til et element på slutten av samlingen.
     *
     * @param elem Elementet som skal legges til.
     * @throws DequeFullException når det ikke er plass til
     *                            elementet.
     */
    @Override
    public void addLast(E elem) throws DequeFullException {
        if (size == capacity) {
            throw new DequeFullException("The collection is full");
        } else {
            backIndex = (backIndex + 1) % capacity;
            mainArray[backIndex] = elem;
            size++;
        }
    }

    /**
     * Fjerner det siste elementet i samlingen og returnerer
     * det.
     *
     * @return Det siste elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E pullLast() throws DequeEmptyException {
        E item = null;
        if (size == 0) {
            throw new DequeEmptyException("The collection is empty");
        } else {
            item = mainArray[backIndex];
            mainArray[backIndex] = null;
            backIndex = (backIndex - 1 + capacity) % capacity;
            size--;
            return item;
        }
    }

    /**
     * Retunerer det siste elementet i samlingen, men
     * fjerner det ikke.
     *
     * @return Det siste elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E peekLast() throws DequeEmptyException {
        if (size == 0) {
            throw new DequeEmptyException("The collection is empty");
        } else {
            return mainArray[backIndex];
        }
    }

    /**
     * Sjekker om et element er i samlingen.
     *
     * @param elem Elementet som kanskje er i samlingen.
     * @return retunerer true hvis elementet er i samlingen.
     */
    @Override
    public boolean contains(Object elem) {
        boolean result = false;
        for (int i = 0; i < mainArray.length; i++) {
            if (mainArray[i] == elem) {
                result = true;
            } else if (elem.equals(mainArray[i])){
                result = true;
            }
        }
        return result;
    }

    /**
     * printer ut samlingen
     */

    public void printDeque() {
        for (int i = 0; i < mainArray.length; i++)
            System.out.println(i + ". " + mainArray[i]);

    }

        /**
         * Retunerer en tabell med alle elementene i samlingen.
         * @param a tabell med samme type som T[].
         * @return En tabell med alle elementene i samlingen.
         */

        @Override
        public E[] toArray() {
            E[] newArray = (E[]) new Object[size];
            int start = frontIndex;
            int index = 0;


            for (int i = 0; i < mainArray.length; i++) {
                if (mainArray[(i + start) % mainArray.length] != null) {
                    newArray[index] = mainArray[(i + start) % mainArray.length];
                    index++;
                }
            }

            System.out.println("toArray: ");
            for (int i = 0; i < newArray.length; i++) {
                System.out.println(newArray[i]);
            }

            return newArray;
        }


        /**
         *
         * Fjerner alle elementene fra samlingen.
         *
         */
        @Override
        public void clear (){
        for (int i = 0; i < mainArray.length; i++) {
            mainArray[i] = null;
        }
        size = 0;
        frontIndex = 0;
        backIndex = 0;
        }
}

