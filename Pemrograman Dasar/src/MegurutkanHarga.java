import java.util.Scanner;

public class MegurutkanHarga {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int [] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = scan.nextInt();
        }
        for(int i = 0; i<len; i++){
            for(int j = i+1; j<len; j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                    System.out.println((i+1)+" "+(j+1));
                }
            }
        }
        scan.close();
    }
}
