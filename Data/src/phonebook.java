import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {
        Map<String,String>PhoenBook = new HashMap<>();
        PhoenBook.put("William A. Lathan","405-709-1865");
        PhoenBook.put("John K. Miller","402-247-8568");
        PhoenBook.put("Hortensia E. Foster","606-481-6467");
        PhoenBook.put("Amanda D. Newland","319-243-5613");
        PhoenBook.put("Brooke P. Askew","307-687-2982");

        System.out.println("What is John K. Miller phonenumebr ? -->" + PhoenBook.get("John K. Miller"));
        System.out.println("Whose phone number is 307-687-2982?" + PhoenBook.keySet());

    }
}
