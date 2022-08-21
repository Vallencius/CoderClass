import java.util.*;

public class MengurutkanDataI {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] query = new int[N];

        for(int i=0; i<N; i++){
            query[i] = scan.nextInt();
        }

        Arrays.sort(query);

        for(int i=0; i<N; i++){
            System.out.print(query[i] + " ");
        }
        scan.close();

    }
}
