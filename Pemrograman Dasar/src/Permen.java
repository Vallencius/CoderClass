import java.util.*;
public class Permen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        if(a%b == 0){
            System.out.println("Hore ^_^");
        }else{
            System.out.println("Kecewa :(");
        }
        scan.close();
    }
}
