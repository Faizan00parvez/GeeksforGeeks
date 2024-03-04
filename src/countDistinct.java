public class countDistinct {
    public static int distNum(int arr[]) {
        int count=0;
        boolean isDistinct = true;
        for (int i = 0; i < arr.length;i++) {
            for(int j=(i-1); j>0;j++) {
                if(arr[i] ==arr[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if(isDistinct == true) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int []arr = { 2,2,3,2};
        System.out.println(distNum(arr));
    }
}
