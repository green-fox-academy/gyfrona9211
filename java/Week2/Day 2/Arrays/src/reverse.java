import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {

        int [] numbers = {3,4,5,6,7};

        int [] reverseNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            reverseNumbers[i] = numbers[numbers.length-1-i];
        }
        numbers = reverseNumbers;

        System.out.println(Arrays.toString(numbers));



    }
}

