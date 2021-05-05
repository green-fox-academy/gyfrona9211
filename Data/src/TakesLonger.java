public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuilder sb = new StringBuilder(quote);

        sb.insert(sb.indexOf("it") + 3, "always takes longer");

        System.out.println(sb);

    }

}
