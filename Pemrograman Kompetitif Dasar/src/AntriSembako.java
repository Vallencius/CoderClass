import java.util.*;

public class AntriSembako {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        short Q = scan.nextShort();
        Queue<String> q = new LinkedList<>();

        for(short i=0; i<Q; i++){
            short a = scan.nextShort();
            if(a == 1){
                String name = scan.nextLine();
                q.add(name);
            }else if(a == 2){
                System.out.println(q.remove());
            }
        }

        scan.close();
    }
}
