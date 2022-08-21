import java.util.*;

public class KekacauanAntriSembako {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short Q = scan.nextShort();
        List<String> q = new ArrayList<>();

        for(short i=0; i<Q; i++){
            short a = scan.nextShort();
            if(a == 1){
                String name = scan.nextLine();
                q.add(0, name);
            }else if(a == 2){
                String name = scan.nextLine();
                q.add(name);
            }else if(a == 3){
                System.out.println(q.remove(0));
            }else if(a == 4){
                System.out.println(q.remove(q.size()-1));
            }
        }
        scan.close();
    }
}
