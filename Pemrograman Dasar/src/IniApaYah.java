import java.util.*;

public class IniApaYah {
    public static boolean isInteger(String str) {
        int length = str.length();
        
        int i = 0;
        if (str.charAt(0) == '-') {
            if (length == 1) {
                return false;
            }
            i = 1;
        }
        for (; i < length; i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String txt = scan.next();
        if(isInteger(txt)){
            int a = Integer.parseInt(txt);
            if(a < 0) {
                System.out.println("bilangan bulat negatif");
            }else if(a>0){
                System.out.println("bilangan bulat positif");
            }else{
                System.out.println("nol");
            }
        }else{
            System.out.println("kata");
        }

        scan.close();
    }
}
