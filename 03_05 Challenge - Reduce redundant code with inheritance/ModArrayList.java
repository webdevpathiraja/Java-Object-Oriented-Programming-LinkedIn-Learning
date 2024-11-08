import java.sql.Array;
import java.util.ArrayList;

// custom ArrayList class that overrides the get method with modulo logic
public class ModArrayList<D> extends ArrayList<D> {

    // method to get element using a valid index
    public D getUsingMod(int index) {

        // use the absolute value of the index and apply modulo to get a valid index
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex); // Return the element at the valid index
    }
}