public class dynamicSelector {
    public static boolean isSorted(int data[]) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] > data[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static int linearSearch(int data[], int key) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int data[], int key) {
        int low = 0;
        int high = data.length - 1;
        int mid = low + (high - low) / 2;

        while (low <= high) {
            if (data[mid] == key) {
                return mid;
            } else if (data[mid] < mid) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int dynamicSearch(int data[], int key) {
        if (isSorted(data)) {
            return binarySearch(data, key);
        }
        else {
            return linearSearch(data, key);
        }
    }
    public static void main(String[] args) {
        int[] dataset = { 2, 1, 4, 6, 7, 5 };
        int key = 4;
        int result = dynamicSearch(dataset, key);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the dataset");
        }
    }
}