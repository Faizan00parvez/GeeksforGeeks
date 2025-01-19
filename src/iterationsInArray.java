public class iterationsInArray {
    public static void main(String[] args) {
        int marks[] = {10,30,50,49,45,10,21,50};

        // traditional for-loop

//        for (int i = 0; i < marks.length; i++) {
//            System.out.println(marks[i]);
//        }

        // Enhanced for-loop

        // actual array elements not the index

//        for(int i : marks) {
//            System.out.println(i);
//        }

        // sum of array

//        int sum=0;
//
//        for(int i:marks) {
//            sum+=i;
//        }
//        System.out.print("sum of array = " + sum);

        // maximum element of array

//        int max=0;
//        for(int i:marks) {
//            if(i>max) {
//                max=i;
//            }
//        }
//        System.out.print("maximum element of array = " + max);

        // average of array elements

//        int avg=0,sum=0;
//        for(int i:marks) {
//            sum = (sum + i);
//        }
//        avg = sum/marks.length;
//
//        System.out.print(" average = " + avg);

        // Count Distinct elements

        int count=0;
        for(int i=0; i<marks.length; i++) {
            boolean isDistinct = true;
            for (int j = i-1; j >=0; j--) {
                if(marks[i]==marks[j]) {
                    isDistinct=false;
                    break;
                }
            }
            if(isDistinct==true) {
                count++;
            }
        }
        System.out.print("Distinct elements count = " + count);


    }
}
