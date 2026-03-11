package minggu5;

import java.util.Scanner;

public class MainSum26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Sum26 sm = new Sum26(elemen);
        for(int i=0;i<elemen;i++){
            System.out.print("Masukkan keuntungan hari ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }
        System.out.println("Total keuntungan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, elemen-1));
        input.close();
    }
    
}
