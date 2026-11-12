
package P5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==========================================");
            System.out.println("   MENU PRAKTIKUM PERULANGAN JAVA  ");
            System.out.println("==========================================");
            System.out.println("1. Cari Bilangan Terbesar & Terkecil (10 Bilangan)");
            System.out.println("2. Penjumlahan & Rata-rata Dinamis");
            System.out.println("3. Floyd's Triangle");
            System.out.println("4. Menampilkan Angka Ganjil & Total Jumlahnya");
            System.out.println("5. Pola Bintang (Half Triangle & Full Triangle)");
            System.out.println("6. Melengkapi Bagian Rumpang (Cetak Angka 11 sebanyak 2x)");
            System.out.println("7. Perbedaan i++ dengan ++i pada while");
            System.out.println("8. Perulangan foreach pada Array");
            System.out.println("0. Keluar Program");
            System.out.print("Pilih menu (0-8): ");
            
            pilihan = input.nextInt();
            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.println("--- SOAL 1 ---");
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
                    break;

                case 2:
                    System.out.println("--- SOAL 2 ---");
                    System.out.print("Masukkan jumlah bilangan: ");
                    int n2 = input.nextInt();
                    double total2 = 0;
                    for (int i = 1; i <= n2; i++) {
                        System.out.print("Masukkan bilangan ke-" + i + ": ");
                        total2 += input.nextDouble();
                    }
                    System.out.println("Total jumlah bilangan: " + total2);
                    System.out.println("Rata-rata: " + (total2 / n2));
                    break;

                case 3:
                    System.out.println("--- SOAL 3 ---");
                    System.out.print("Masukkan banyak baris : ");
                    int baris3 = input.nextInt();
                    int angka3 = 1;
                    for (int i = 1; i <= baris3; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(angka3 + " ");
                            angka3++;
                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    System.out.println("--- SOAL 4 ---");
                    System.out.print("Masukkan banyak angka : ");
                    int n4 = input.nextInt();
                    int total4 = 0;
                    int angka4 = 1;
                    for (int i = 0; i < n4; i++) {
                        System.out.print(angka4 + " ");
                        total4 += angka4;
                        angka4 += 2;
                    }
                    System.out.println("\nTotal penjumlahan : " + total4);
                    break;

                case 5:
                    System.out.println("--- SOAL 5 ---");
                    System.out.println("Half Triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                        System.out.println();
                    }
                    
                    System.out.println("\nFull Triangle:");
                    for (int i = 1; i <= 3; i++) {
                        for (int j = 1; j <= 3 - i; j++) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                        System.out.println();
                    }
                    for (int i = 2; i >= 1; i--) {
                        for (int j = 1; j <= 3 - i; j++) System.out.print(" ");
                        for (int k = 1; k <= (2 * i - 1); k++) System.out.print("*");
                        System.out.println();
                    }
                    break;

                case 6:
                    System.out.println("--- SOAL 6 ---");
                    for (int i = 0; i < 10; i++) {
                        if (i < 2) {
                            System.out.println(11);
                        }
                    }
                    break;

                case 7:
                    System.out.println("--- SOAL 7 ---");
                    System.out.println("Penggunaan i++:");
                    int i7 = 0;
                    while (i7++ < 3) {
                        System.out.println("Nilai i di dalam loop: " + i7);
                    }
                    
                    System.out.println("\nPenggunaan ++i:");
                    int j7 = 0;
                    while (++j7 < 3) {
                        System.out.println("Nilai j di dalam loop: " + j7);
                    }
                    break;

                case 8:
                    System.out.println("--- SOAL 8 ---");
                    int[] dataArray = {10, 20, 30, 40, 50};
                    for (int nilai : dataArray) {
                        System.out.println("Nilai dalam array: " + nilai);
                    }
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid! Silakan masukkan angka 0-8.");
            }

            if (pilihan != 0) {
                System.out.println("\nTekan Enter untuk kembali ke menu...");
                input.nextLine(); // membersihkan buffer
                input.nextLine(); // menunggu enter dari user
            }

        } while (pilihan != 0);

        input.close();
    }
}
