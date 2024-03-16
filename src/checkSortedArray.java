public class checkSortedArray {
   public static boolean check(int a[]) {
        for(int i=0; i<a.length;i++) {
            for(int j=i+1; j<a.length;j++) {
                if(a[i] > a[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //int []a = {3,1,2,5,4};
        int []a = {4,5,4,4,4};

        System.out.println(check(a));
    }
}
