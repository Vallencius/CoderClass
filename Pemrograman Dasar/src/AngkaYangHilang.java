import java.util.ArrayList;
import java.util.Scanner;

public class AngkaYangHilang {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int jumlahKertas = scanner.nextInt();
    int jumlahKertasYangDitemukan = scanner.nextInt();

    if(jumlahKertasYangDitemukan > jumlahKertas) {
      return;
    }

    ArrayList<Integer> kertasYangDitemukan = new ArrayList<>();

    for(int i = 0; i < jumlahKertasYangDitemukan; i++) {
      int inputUser = scanner.nextInt();
      kertasYangDitemukan.add(inputUser);
    }

    for(int i = 1; i < jumlahKertas; i++) {
      if(!kertasYangDitemukan.contains(i)) {
        System.out.println(i);
      }
    }
  }
}
