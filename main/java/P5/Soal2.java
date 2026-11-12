package P5;

import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah bilangan: ");
        int n = input.nextInt();

        double total = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            total += input.nextDouble();
        }

        double rataRata = total / n;
        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
