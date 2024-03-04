public class maxArray {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 21;
        arr[1] = 14;
        arr[2] = 22;
        arr[3] = 2;
        arr[4] = 7;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length;i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
