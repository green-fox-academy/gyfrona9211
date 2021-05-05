import java.util.ArrayList;
import java.util.List;

public class list2 {
    public static void main(String[] args) {
        List<String> ListA = new ArrayList<>();
            ListA.add("Apple");
            ListA.add("Avocado");
            ListA.add("Blueberries");
            ListA.add("Durian");
            ListA.add("Lychee");

        List<String> ListB = new ArrayList<>();
        ListB.addAll(ListA);
        System.out.println("Contains the Durian listA:" + ListA.contains("Durian"));
        ListA.remove("Durian");
        System.out.println(ListA);
        ListA.add(4,"Kiwifruit");
        System.out.println(ListA.indexOf("Avocado"));
        System.out.println(ListB.indexOf("Durian"));
        ListB.add("Pomelo and Pasion Fruit");
        System.out.println(ListA.get(3));





        }

        }


