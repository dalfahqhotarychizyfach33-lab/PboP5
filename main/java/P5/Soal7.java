package P5;

public class Soal7 {
    public static void main(String[] args) {
        System.out.println("=== Penggunaan i++ ===");
        int i = 0;
        while (i++ < 3) {
            // Evaluasi dulu kondisi (i < 3), baru i ditambah 1
            System.out.println("Nilai i di dalam loop: " + i);
        }

        System.out.println("\n=== Penggunaan ++i ===");
        int j = 0;
        while (++j < 3) {
            // Tambahkan j dengan 1 dulu, baru evaluasi kondisi (j < 3)
            System.out.println("Nilai j di dalam loop: " + j);
        }
    }
}
