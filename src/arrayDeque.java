import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;

// Time Complexity - O(1)
public class arrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> s = new ArrayDeque<>();
        s.push(10);
        s.push(45);
        s.push(65);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}
