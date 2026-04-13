import java.util.HashSet;
import java.util.LinkedList;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        LinkedList<String> consist = new LinkedList<>();


        consist.add("Engine");
        consist.add("Sleeper");
        consist.add("AC");
        consist.add("Cargo");
        consist.add("Guard");

        System.out.println("Initial Train Formation: " + consist);

        // 3. Insert a Pantry Car at position 2 (index 2)
        // LinkedList allows efficient insertion in the middle
        consist.add(2, "Pantry Car");
        System.out.println("After Adding Pantry Car at pos 2: " + consist);


        String removedFirst = consist.removeFirst();
        String removedLast = consist.removeLast();

        System.out.println("Detached: " + removedFirst + " and " + removedLast);


        System.out.println("Final Ordered Train Consist: " + consist);


        System.out.println("\n--- Current Sequence ---");
        for (int i = 0; i < consist.size(); i++) {
            System.out.println("Position " + (i + 1) + ": " + consist.get(i));
        }
    }
}