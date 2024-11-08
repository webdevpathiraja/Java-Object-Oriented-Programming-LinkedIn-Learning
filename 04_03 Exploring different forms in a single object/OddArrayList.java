import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    // constructor that only adds odd numbers from the input
    public OddArrayList(Integer... nums) {
        super(Arrays.stream(nums)
                .filter(OddArrayList::isOdd) // filter to keep only odd numbers
                .collect(Collectors.toList())); // collect them into a list
    }

    // add method that only adds an element if it's odd
    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) { // check if the number is odd
            super.add(index, element); // add if it's odd
        }
    }

    // add method that returns true if an odd element was added
    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) { // check if the number is odd
            return super.add(element); // add if it's odd
        } else {
            return false; // return false if not added
        }
    }

    // addAll method that only adds odd numbers from the collection
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(OddArrayList::isOdd) // filter to keep only odd numbers
                .collect(Collectors.toList())); // collect and add them
    }

    // addAll method that adds only odd numbers at a specific index
    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(OddArrayList::isOdd) // filter to keep only odd numbers
                .collect(Collectors.toList())); // collect and add them
    }

    // set method that only sets an odd number at the specified index
    @Override
    public Integer set(int index, Integer element) {
        if (isOdd(element)) { // check if the number is odd
            return super.set(index, element); // set if it's odd
        } else {
            System.out.println(element + " is not odd."); // print message if not odd
            return Integer.MIN_VALUE; // return a default value if not set
        }
    }

    // replaceAll method that applies an operation to each element
    // removes any resulting even numbers
    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator); // apply the operation to each element
        super.removeIf(n -> !isOdd(n)); // remove elements that are not odd
    }

    // helper method to check if a number is odd
    public static boolean isOdd(Integer element) {
        return Math.abs(element) % 2 == 1; // return true if the number is odd
    }
}
