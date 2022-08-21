import java.util.*;
public class PemilihanUmum {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int a1 = a;
        int b1 = b;
        for(int i=0; i<10; i++){
            if(a == b) {
                System.out.println(a);
                break;
            }else if(a>b){
                b+=b1;
            }else if(b>a){
                a+=a1;
            }
        }
    }
}
