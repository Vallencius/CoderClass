import java.util.*;
public class TowerOfHanoi {
    public static void tower(int n, char from, char to, char aux){
        if(n==1){
            System.out.println(n + " " + from + " " + aux);
            return;
        }else{
            tower(n-1, from, aux, to);
            System.out.println(n + " " + from + " " + aux);
            tower(n-1, to, from, aux);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        tower(n, 'A', 'B', 'C');

        scan.close();
    }
}
