import java.util.*;

public class IniApaYah {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        if(scan.hasNextInt()){
            int a = scan.nextInt();
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
