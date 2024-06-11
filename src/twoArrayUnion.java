import java.util.HashSet;
import java.util.Set;
public class twoArrayUnion {
    public static void main(String args[]) {
        int []a = {1,2,3,4,5,5,6,6};
        int []b = {1,2,3};

        Set<Integer> union = new HashSet<>();

        for(int value : a) {
            union.add(value);
        }

        for(int value : b) {
            union.add(value);
        }

        System.out.println(" Union of both the arrays = " + union.size());
    }
}
