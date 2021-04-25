public class Factorial {
    public static void main(String[] args) {

        //  Create the usual class wrapper and main method on your own
        // - Create a function called `calculateFactorial()`
        //   that returns the factorial of its input
        System.out.println(calculateFactorial(7));

    }
    public static int calculateFactorial(int number){
        int numb = 1;
        for (int i = 1; i <= number; i++) {
            numb *= i;
        }
        return numb;

    }
}
