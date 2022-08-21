import java.lang.reflect.MalformedParameterizedTypeException;
import java.util.Scanner;

public class TransposeMatrix {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    int column = scanner.nextInt();

    int[][] matrix = new int[row][column];

    for(int i = 0; i < row; i++) {
      for(int j = 0; j < column; j++) {
        matrix[i][j] = scanner.nextInt();
      }
    }

    for(int i = 0; i < column; i++) {
      for(int j = 0; j < row; j++) {
        System.out.print(matrix[j][i] + " ");
      }
      System.out.println();
    }

    

    scanner.close();
  } 
}
