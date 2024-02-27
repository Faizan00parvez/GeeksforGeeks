public class isPrime {
    static boolean forPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        int n=5;
        forPrime(n);

    }
}
