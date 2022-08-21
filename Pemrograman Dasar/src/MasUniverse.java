import java.util.Scanner;

public class MasUniverse {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int max = Integer.MIN_VALUE;

    if(n == 0) return;
    
    for(int i = 0; i < n; i++) {
      int inputUser = scanner.nextInt();
      if(inputUser > max) max = inputUser;
    }

    System.out.println(max);
    scanner.close();
  }
}
