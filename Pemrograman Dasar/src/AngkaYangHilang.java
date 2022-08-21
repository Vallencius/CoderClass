import java.util.*;

public class AngkaYangHilang {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int jumlahKertas = scanner.nextInt();
    int jumlahKertasYangDitemukan = scanner.nextInt();
    ArrayList<Integer> arr = new ArrayList<>();

    for(int i = 0; i < jumlahKertasYangDitemukan; i++) {
      arr.add(scanner.nextInt());
    }

    for(int i = 1; i <= jumlahKertas; i++) {
      if(!arr.contains(i)){
        System.out.print(i+" ");
      }
    }
    scanner.close();
  }
}
