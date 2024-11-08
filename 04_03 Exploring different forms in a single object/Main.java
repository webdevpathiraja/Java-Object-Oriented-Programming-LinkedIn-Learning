import java.util.ArrayList;
import java.util.Random;

public class Main {

    // adds a random number to the list if the list size increases by 1
    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size(); // store the list's original size
        Random random = new Random(); // create a random number generator

        // loop until the list size increases by 1
        while (originalSize + 1 != list.size()) {
            int n = random.nextInt(1000); // generate a random number from 0 to 999
            list.add(n); // add the random number to the list
        }
    }

    public static void main(String[] args) {
        // create an OddArrayList with the number 7
        OddArrayList oddListy = new OddArrayList(7);

        // add numbers to the oddListy
        oddListy.add(1); // 1 is odd, so it will be added
        oddListy.add(2); // 2 is even, so it will not be added
        addRandomNumber(oddListy); // add a random number to oddListy
        System.out.println(oddListy); // print the list

        // create a regular ArrayList
        ArrayList<Integer> listy = new ArrayList<>();

        // add numbers to listy
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy); // add a random number to listy
        System.out.println(listy); // print the list
    }
}
