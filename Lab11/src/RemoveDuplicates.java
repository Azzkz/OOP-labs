import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicates {
    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
}
