import java.lang.Math;
import java.util.Scanner;

public class TabrakanString {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int lengthString1 = scanner.nextInt();
    int lengthString2 = scanner.nextInt();
    String string1 = scanner.next();
    String string2 = scanner.next();

    String result = "";
    if(f(string1) % 3 == 0 && f(string2) % 3 == 0) {
      result = "YA";
    } else {
      result = "TIDAK";
    }
    
    System.out.println(result);
    scanner.close();
  }

  public static int f(String s) {
    int sum = 0;
    
    int counter = 0;
    for(char character : s.toCharArray()) {
      int currentSum = pos(character) * (int) Math.pow(26.0, counter);
      sum += currentSum;
      counter++;
    }

    return sum;
  }

  public static int pos(char character) {
    return Integer.valueOf(Character.toLowerCase(character)) - 97;
  }
}
