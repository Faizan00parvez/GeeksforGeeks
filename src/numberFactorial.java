public class numberFactorial {
    public static void main(String[] args) {
        int i=1,n=5;
        while(n>0) {
            i=i*n;
            n--;
        }
        System.out.println(i);
    }
}
