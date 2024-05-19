import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class stackList {
    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        listReverse(ll);
        System.out.println(ll);
    }
    public static void listReverse(List<Integer> ll) {
        Stack<Integer> s = new Stack<>();
        for(Integer x : ll) {
            s.push(x);
        }
        for (int i = 0; i < ll.size(); i++) {
            ll.set(i,s.pop());
        }

    }
}
