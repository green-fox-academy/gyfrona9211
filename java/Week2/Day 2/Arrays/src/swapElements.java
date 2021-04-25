import java.util.Arrays;

public class swapElements {
    public static void main(String[] args) {

        String [] orders = {"first","second","third"};

        String i = orders [0];
        orders[0] = orders[orders.length - 1];
        orders[orders.length - 1] = i;

        System.out.println(Arrays.toString(orders));


    }
}
