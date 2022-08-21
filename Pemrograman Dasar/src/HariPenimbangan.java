import java.util.Scanner;

public class HariPenimbangan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double total = 0;
        int n = 6;
        while(n-->0){
            total += s.nextInt();
        }
        System.out.println(total/6);
        s.close();
    }
}
