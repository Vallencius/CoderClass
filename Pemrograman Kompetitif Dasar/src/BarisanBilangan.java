import java.util.*;

public class BarisanBilangan {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        ArrayList<Integer> hasil = new ArrayList<Integer>();
        for(int i=1; i<=N;i++){
            if(i%a==0 || i%b==0){
                hasil.add(i);
            }
        }
        System.out.println(hasil.size());
        scan.close();

    }
}
