import java.util.*;

public class AnalisisMemori {

    public static int rekursi(int N){
        if(N==1){
            return 1;
        }else if(N>1){
            return 1 + rekursi((int)Math.ceil((double)N/2)) + rekursi((int)Math.floor((double)N/2));
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        System.out.println(rekursi(N));
        scan.close();
    }
}
