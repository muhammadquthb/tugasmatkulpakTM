/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganganjilgenap;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class BilanganGanjilGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Meminta pengguna memasukkan angka bulat
            System.out.print("Masukkan sebuah angka bulat (0 untuk keluar): ");
            int angka = scanner.nextInt();
            
            if (angka == 0) {
                // Keluar dari program jika angka yang dimasukkan adalah 0
                System.out.println("Terima kasih, program selesai.");
                break;
            } else if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        }
        
        // Menutup objek Scanner
        scanner.close();
    }
}
