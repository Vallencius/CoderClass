import java.util.Scanner;

public class PusingString {
    public static void swap(char[] str, int a, int b){
        char temp = str[a];
        str[a] = str[b];
        str[b] = temp;
    }
    public static void rotate(char[] str, int a, int b){
        char temp ;
        int diff = b-a+1;
            for(int i = 0; i<diff/2; i++){
                temp = str[a+i];
                str[a+i] = str[b-i];
                str[b-i] = temp;

            }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int queries = scan.nextInt();
        scan.nextLine();
        char[] str = new char[len];
        String input = new String();
        int ord = 0;
        int a = 0;
        int b = 0;
        input = scan.nextLine();
        for(int i = 0; i<len; i++){
            str[i] = input.charAt(i);
        }
        for(int i = 0; i<queries; i++){
            ord = scan.nextInt();
            a = scan.nextInt();
            b = scan.nextInt();
            a--; b--;
            switch (ord) {
                case 1:
                    swap(str, a, b);
                    break;
                case 2:
                    rotate(str, a, b);
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
        for(int i = 0; i<len; i++){
            System.out.printf("%c",str[i]);
        }
        scan.close();
    }
}
