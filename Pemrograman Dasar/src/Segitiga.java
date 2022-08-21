import java.util.*;
public class Segitiga {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if(a+b > c && a+c > b && b+c > a){
            System.out.println("segitiga");
        }else{
            System.out.println("bukan segitiga");
        }
        scan.close();

    }
}
