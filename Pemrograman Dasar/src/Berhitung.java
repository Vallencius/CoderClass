import java.util.*;

public class Berhitung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        char op = scan.next().charAt(0);
        int b = scan.nextInt();

        switch(op){
            case('+'):
                System.out.println(a+b);
                break;
            case('-'):
                System.out.println(a-b);
                break;
            case('/'):
                System.out.println(a/b);
                break;
            case('*'):
                System.out.println(a*b);
                break;
            case('%'):
                System.out.println(a%b);
                break;
        }
        scan.close();
    }
}
