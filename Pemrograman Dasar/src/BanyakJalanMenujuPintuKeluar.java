import java.util.*;

public class BanyakJalanMenujuPintuKeluar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int[][] matrix = new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                matrix[i][j] = 1;
            }
        }

        for(int i=1; i<N; i++){
            for(int j=1; j<M; j++){
                matrix[i][j] = matrix[i-1][j] + matrix[i][j-1];
            }
        }

        System.out.println(matrix[N-1][M-1]);

        scan.close();
    }
}
