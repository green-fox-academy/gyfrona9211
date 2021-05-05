import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class finance {
    public static void main(String[] args) {
        List<Integer> PersonalFinance = new ArrayList<>(Arrays.asList(500,1000,1250,175,800,120));
        int total = 0;
        for (Integer spend : PersonalFinance) {
            total += spend;
        }
        System.out.println("How much did we spend: " + total);
        int max = PersonalFinance.get(0);
        for (Integer greatest:PersonalFinance) {
            if (greatest>max){
                max=greatest;
            }
        }
        System.out.println("Your greatest was: " + max);
    }
}
