import java.util.Scanner;

public class MembuatLogo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();
    int l = scanner.nextInt();

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(i < l || i >= m - l || j < l) {
          System.out.print("*");
        } else {
          System.out.print(".");
        }
      }
      System.out.println();
      scanner.close();
    }
  }
}
