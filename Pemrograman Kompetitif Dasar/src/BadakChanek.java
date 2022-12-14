import java.util.*;

public class BadakChanek {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Q = scan.nextInt();
        int[] badak = new int[N];

        for(int i=0; i<N; i++){
            badak[i] = scan.nextInt();
        }

        Arrays.sort(badak);

        int[] hasil = new int[Q];

        for(int i = 0; i<Q; i++){
           int query = scan.nextInt();
           hasil[i] = badak[query-1];
        }

        for(int i = 0; i<Q; i++){
            System.out.println(hasil[i]);
        }

        
        scan.close();

    }
}
