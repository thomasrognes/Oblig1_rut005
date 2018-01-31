import java.util.ArrayDeque;
import java.util.Deque;

public class main {
    public static void main(String[] args) {
        System.out.println("test");

        IDeque<String> myDeque = new ArrayDeque<String>(10);
        myDeque.addFirst("Thomas");
        myDeque.addFirst("Magnus");
        myDeque.addFirst("Tord");
        int theSize = myDeque.size();
        System.out.println(theSize);

        //Metode for å regne ut kjøretiden til en metode. 
       // long startTime = System.nanoTime();
        //methodToTime();
        //long endTime = System.nanoTime();

        //long duration = endTime - startTime;
    }
}
