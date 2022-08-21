import java.util.Scanner;

public class AngkaHilang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a,i;
        a = scan.nextInt();
        boolean[] all = new boolean[a];
        i = scan.nextInt();
        while(i-->0){
            all[scan.nextInt()-1] = true;
        }
        for(i = 0; i<a; i++){
            if(!all[i]){
                System.out.print((i+1)+" ");
            }
        }
    }
}
