import java.util.HashMap;
import java.util.Map;
public class freqByHasing {

    public static int countNonRepeated(int []arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int number : arr) {
            freqMap.put(number, freqMap.getOrDefault(number,0)+1);
        }

        int count=0;
        for(int freq : freqMap.values()) {
            if(freq==1) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int []arr = {1,1,2,2,3,3,3,4,4,4,4,5,6,7,8};

        System.out.println(" Number of non Repeated Elements = " + countNonRepeated(arr));
    }
}
