import java.util.Scanner;

public class JumlahFaktor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum =  0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    sum++;
                }
            }
        }
        System.out.println(sum);
        s.close();
    }
}
