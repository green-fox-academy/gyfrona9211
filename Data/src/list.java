import java.util.ArrayList;
import java.util.List;

public class list {

    public static void main(String[] args) {

        List<String> contain = new ArrayList<>();
        String s1 = "William";
        contain.add(s1);
        System.out.println(contain);
        contain.add("John");
        contain.add("Amanda");
        System.out.println(contain.size());
        System.out.println(contain.get(2));
        for (String value : contain) {
            System.out.println(value);
        }
        for (int i = 0; i < contain.size(); i++) {
            System.out.println(i+1 + "." + contain.get(i) );
        }
        contain.remove(2);
        for (String s : contain) {
            System.out.println(s);
        }
        contain.clear();

    }
}
