import java.util.*;
public class BarisanBilangan2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long N = scan.nextLong();
        long a = scan.nextLong();
        long b = scan.nextLong();
        ArrayList<Long> hasil = new ArrayList<Long>();
        for(long i=1; i<=N;i++){
            if(i%a==0 || i%b==0){
                hasil.add(i);
            }
        }
        System.out.println(hasil.size());
        scan.close();

    }
}
