import java.util.Scanner;

public class MeetInTheMiddle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++) {
      arr[i] = scanner.nextInt();
    }

    int rightIndex = n-1;
    int leftIndex = 0;
    for(int i = 0; i < n; i++) {
      if(i%2 == 0) {
        System.out.print(arr[leftIndex++]);
      } else {
        System.out.print(arr[rightIndex--]);
      }

      System.out.print(" ");
    }

    scanner.close();
  }
}
