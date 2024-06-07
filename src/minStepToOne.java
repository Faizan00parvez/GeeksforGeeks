public class minStepToOne {
        public static void main(String[] args) {
            int N = 16;
            System.out.println(minSteps(N));
        }

        public static int minSteps(int N) {
            int[] dp = new int[N+1];
            dp[1] = 0; // base case

            for(int i = 2; i <= N; i++) {
                dp[i] = 1 + dp[i-1]; // reduce by 1

                if(i % 2 == 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i / 2]); // divide by 2
                }
                if(i % 3 == 0) {
                    dp[i] = Math.min(dp[i], 1 + dp[i / 3]); // divide by 3
                }
            }

            return dp[N];
        }
}
