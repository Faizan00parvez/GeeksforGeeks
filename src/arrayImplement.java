public class arrayImplement {
    public static void main(String[] args) {
        int []arr = new int[5];
        arr[0] = 20;
        arr[1] = 10;
        arr[2] = 30;

        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.print(arr[2]);
    }
}
