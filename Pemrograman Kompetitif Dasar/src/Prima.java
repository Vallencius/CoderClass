import java.util.*;

public class Prima {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int K = scan.nextInt();
        int num=1, count=0, i;

        for(int j=0; j<N; j++){
            int n=(j*K)+1;
            while (count < n){
                num=num+1;
                for (i = 2; i <= num; i++){
                    if (num % i == 0){
                        break;
                    }
                }
                if (i == num){
                    count = count+1;
                }
            }
            System.out.println(num);
        }
    }
}
