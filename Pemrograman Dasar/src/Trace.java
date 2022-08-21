import java.util.Scanner;

public class Trace {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int sum = 0;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        int inputUser = scanner.nextInt();
        if(i == j) {
          sum += inputUser;
        }
      }
    }

    System.out.println(sum);
    scanner.close();
  }
}
