import java.util.ArrayList;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        int []a = {1,2,3,4,5,6};
        int []b = {2,3,5};
        ArrayList<Integer> res = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            res.add(a[i]);
        }
        for(int j=0; j<b.length; j++) {
            for(Integer k : res) {
                if(b[j]!=res.get(k)) {
                    res.add(b[j]);
                }
            }
        }
        //Collections.sort(res);

        System.out.print(res);
    }
}
