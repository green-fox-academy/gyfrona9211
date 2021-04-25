public class Sum {
    public static void main(String[] args) {

        // Create the usual class wrapper and main method on your own
        // Write a function called `sum()` that returns the sum of numbers from zero to the given parameter

        System.out.println(sum(20));

    }
        public static int sum (int summary){

        int sum = 0;
            for (int i = 0; i < summary; i++) {
               sum+=i;
            }
        return sum;


        }
}
