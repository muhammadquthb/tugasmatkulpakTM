/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nilairata.rata;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class NilaiRataRata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            int total = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (0 untuk selesai):");

            while (true) {
                try {
                    System.out.print("Masukkan angka: ");
                    int angka = Integer.parseInt(scanner.nextLine());

                    if (angka == 0) {
                        break;
                    }

                    total += angka;
                    jumlahAngka++;
                } catch (NumberFormatException e) {
                    System.out.println("Input tidak valid. Masukkan angka bulat.");
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) total / jumlahAngka;
                System.out.println("Rata-rata angka adalah: " + rataRata);
            } else {
                System.out.println("Tidak ada angka yang dimasukkan.");
            }

            System.out.print("Apakah Anda ingin melanjutkan? (Ya/Tidak): ");
            String jawaban = scanner.nextLine().toLowerCase();

            if (!jawaban.equals("ya")) {
                lanjut = false;
            }
        }

        System.out.println("Terima kasih, program selesai.");
        scanner.close();
    }
}
