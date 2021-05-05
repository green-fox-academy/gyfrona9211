public class DivideByZero {
  public static void main(String[] args) {
    int number = 10;
    int divisor = 5;

    doDivison(number, divisor);
  }

  public static void doDivison(int number, int divisor) {
    int result;
    try {
      result = number / divisor;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("Fail");
    }
  }
}
