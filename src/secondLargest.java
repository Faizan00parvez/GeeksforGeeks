import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class secondLargest {
    public static void secLar(int []a) {
        Arrays.sort(a);

        int small = a[0];
        int large = a[a.length-1];
        System.out.println(small + " " + large);
    }
    public static void main(String[] args) {
        int []a = {2,3,1,5,4};
        secLar(a);



    }
}
