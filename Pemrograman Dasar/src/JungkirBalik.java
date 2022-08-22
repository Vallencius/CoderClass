import java.util.Scanner;

public class JungkirBalik {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];

    int arrayIndex = 0;
    for(int i = 0; i < n; i++) {
      array[arrayIndex++] = scanner.nextInt();
    }

    for(int i = n-1; i >= 0; i--) {
      System.out.println(array[i]);
    }
    scanner.close();
  }
}
