import java.util.ArrayList;
import java.util.Scanner;

public class Palindrome {
    public static void palindromeCheck(String str, ArrayList<Boolean> stat){
        String rev = new String();
        for(int i = str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }
        if(rev.equalsIgnoreCase(str)){
            stat.add(true);
        }else{
            stat.add(false);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int in = scan.nextInt();
        String str = new String();
        ArrayList<Boolean> stat = new ArrayList<>();
        for(int i = 0; i<in; i++){
            str = scan.next();
            palindromeCheck(str, stat);
        }
        for (Boolean bool : stat) {
            System.out.println(bool? "palindrom":"bukan palindrom");
        }
        scan.close();
    }
}
