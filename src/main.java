/**
 * Obligatorisk oppgave 1
 * @author rut005, Thomas Sebastian Rognes
 *
 * main-klasse.
 */

public class main {
    public static void main(String[] args) {

        //Oppretter en ny samling.
        IDeque<Integer> myDeque = new ArrayDeque<Integer>(10);

        // Legger til elementer i samlingen ved bruk av både addFirst og addLast metoder.
        myDeque.addFirst(1);
        myDeque.addFirst(2);
        myDeque.addLast(3);
        myDeque.addLast(4);
        myDeque.addFirst(5);
        myDeque.addFirst(6);
        myDeque.addLast(7);
        myDeque.addFirst(8);
        myDeque.addFirst(9);
        myDeque.addFirst(10);

        //Printer ut samlingen
        myDeque.printDeque();

        System.out.println("-------------------------");


        System.out.println("Sjekker om alle metodene fungerer: ");
        System.out.println("Det er totalt " + myDeque.size() + " elementer i samlingen"); //Size metoden
        System.out.println("Det første elementet i samlingen er " + myDeque.peekFirst()); //peekFirst metoden
        System.out.println("Det bakerste elementet i samlingen er " + myDeque.peekLast());//peekLast metoden
        System.out.println("Finnes tallet 12 i samlingen: " + myDeque.contains(12)); //contains metoden
        System.out.println("Finnes tallet 10 i samlingen " + myDeque.contains(10)); //contains metoden
        System.out.println("Fjerner det bakerste elementet som er: " + myDeque.pullLast()); //pullLast metoden
        System.out.println("Fjerner det første elementet som er: " + myDeque.pullFirst()); //pullFirst metoden
        System.out.println("Det er nå totalt " + myDeque.size() + " elementer i samlingen"); // Size metoden

        System.out.println("-------------------------");

        myDeque.toArray(); //toArray metoden. Printer ut elementene i

        //Fjerner hele samlingen
        myDeque.clear();
        System.out.println("Det er nå totalt " + myDeque.size() + " elementer i samlingen"); //Size metoden

        System.out.println("-------------------------");

        myDeque.printDeque();

    }
}