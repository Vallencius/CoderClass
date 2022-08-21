import java.util.*;

public class IniApaYah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char a = scan.next().charAt(0);
        if(a > 48 && a<58) {
            System.out.println("bilangan bulat negatif");
        }else if(a == 45){
            System.out.println("bilangan bulat positif");
        }else if(a == 30){
            System.out.println("nol");
        }else{
            System.out.println("kata");
        }
    }
}
