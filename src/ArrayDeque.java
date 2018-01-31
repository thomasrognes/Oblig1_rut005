import java.util.Arrays;

public class ArrayDeque<E> implements IDeque<E> {

    private E[] mainArray;
    private static int DEFAULT_CAPACITY = 10;
    private int size;
    private boolean initialized = false;
    private int frontIndex = -1;
    private int backIndex = 0;


    public ArrayDeque(int capacity){
        if(capacity> DEFAULT_CAPACITY){
            capacity = DEFAULT_CAPACITY;
        }
        this.mainArray = (E[]) new Object[capacity];
        initialized = true;
    }

    /**
     * Retunerer hvor mange elementer samlingen inneholder.
     *
     * @return Størrelsen på samlingen.
     */
    @Override
    public int size(){
        return size;
    }


    /**
     * Legger til et element på begynnelsen av samlingen.
     *
     * @param elem Elementet som skal legges til.
     * @throws DequeFullException når det ikke er plass til
     * elementet.
     */
    @Override
    public void addFirst(E elem) {
        if(initialized){
            if (size >= DEFAULT_CAPACITY){
                throw new DequeFullException("The collection is full");
            } else {
                mainArray[backIndex+1] = mainArray[frontIndex];
                backIndex++;
                mainArray[frontIndex] = elem;
                size++;
            }

        }
    }

    /**
     * Fjerner det første elementet fra samlingen og
     * returnerer det.
     *
     * @return Det første elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E pullFirst() {
        if (size == 0){
            throw new DequeEmptyException("The collection is empty");
        } else {
           E item = mainArray[frontIndex];
            mainArray[frontIndex] = null;
            size--;
            return item;

        }

    }

    /**
     * Retunerer det første elementet fra samlingen, men
     * fjerner det ikke.
     *
     * @return Det første elementet i samlingen.
     * @throws DequeEmptyException hvis samlingen er tom.
     */
    @Override
    public E peekFirst(){
        if (size == 0){
            throw new DequeEmptyException("The collection is empty");
        } else {
            return (mainArray[frontIndex]);
        }
    }



    public void addLast(E elem){
        if (size>= DEFAULT_CAPACITY){
            throw new DequeFullException("The collection is full");
        } else {

        }

    }

    public E pullLast(){
        if (size == 0){
            throw new DequeEmptyException("The collection is empty");
        } else{

        }

    }

    public E peekLast() {
         if (size == 0) {
            throw new DequeEmptyException("The collection is empty");
        } else {
           return mainArray[backIndex];
        }
    }

    public boolean contains(Object elem){

    }

   public E[] toArray(E[] a){
        return size;
   }

    public void clear(){
        for (E elem : mainArray ) {
            elem = null;
        }
        size = 0;
        frontIndex = 0;
        backIndex = 0;
    }


}
