import java.util.HashMap;
import java.util.Map;

public class map2 {
    public static void main(String[] args) {
        Map<String,String> Mymap = new HashMap<>();
        Mymap.put("978-1-60309-452-8","A letter to Jo");
        Mymap.put("978-1-60309-459-7","Lupus");
        Mymap.put("978-1-60309-444-3","Red Panda and Moon Bear");
        Mymap.put("978-1-60309-461-0","The Lab");

        for (Map.Entry<String, String> entry:Mymap.entrySet()) {
            System.out.println(entry.getValue() + " (ISBN: " + entry.getKey() + ")");
        }
        Mymap.remove("978-60309-444-3");
        Mymap.remove("978-60309-461-0");
        Mymap.put("978-1-60309-450-4" , "They Called Us Enemy");
        Mymap.put("978-1-60309-453-5" , "Why Did We Trust Him?");
        System.out.println(" is it tre or false in this map:" + Mymap.containsKey("478-0-61159-424-8 "));
        System.out.println("The key value is : " + Mymap.get("978-1-60309-453-5" ));
    }

}
