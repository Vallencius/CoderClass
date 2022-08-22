import java.util.Scanner;

public class AngkaHilang {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int a,i;
        a = s.nextInt();
        boolean[] all = new boolean[a];
        i = s.nextInt();
        while(i-->0){
            all[s.nextInt()-1] = true;
        }
        for(i = 0; i<a; i++){
            if(!all[i]){
                System.out.print((i+1)+" ");
            }
        }
        s.close();
    }
}
