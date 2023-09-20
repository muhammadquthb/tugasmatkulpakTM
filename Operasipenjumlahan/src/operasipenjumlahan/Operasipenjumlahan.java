/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operasipenjumlahan;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Operasipenjumlahan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan dua angka bulat
        System.out.print("Masukkan angka pertama: ");
        int angkaPertama = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angkaKedua = scanner.nextInt();

        // Melakukan operasi penjumlahan, pengurangan, perkalian, dan pembagian
        int hasilPenjumlahan = angkaPertama + angkaKedua;
        int hasilPengurangan = angkaPertama - angkaKedua;
        int hasilPerkalian = angkaPertama * angkaKedua;
        double hasilPembagian = (double) angkaPertama / angkaKedua;

        // Menampilkan hasil operasi ke layar
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        System.out.println("Hasil Pembagian: " + hasilPembagian);

        // Menutup objek Scanner
        scanner.close();
    }
}
   