import java.util.ArrayList;
import java.util.Scanner;

public class Funception {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();

        while(x < y) {
          result.add(x);
          x = a*x+b;
        }

        for (int answer : result) {
          System.out.println(answer);
        }

        scanner.close();

        return;
    }
}