package P5;

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        System.out.println("Masukkan 10 bilangan:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Bilangan ke-" + i + ": ");
            int bil = input.nextInt();
            
            if (bil > max) max = bil;
            if (bil < min) min = bil;
        }

        System.out.println("Bilangan Terbesar: " + max);
        System.out.println("Bilangan Terkecil: " + min);
    }
}