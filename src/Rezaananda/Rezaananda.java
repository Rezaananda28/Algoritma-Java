/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rezaananda;

/**
 *
 * @author REZA ANANDA PANDIA
 */
import java.util.Scanner;

public class Rezaananda {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            boolean exit = false;
            
            while (!exit) {
                System.out.print("Masukkan angka pertama: ");
                double Nilai1 = keyboard.nextDouble();
                
                System.out.print("Masukkan angka kedua: ");
                double Nilai2 = keyboard.nextDouble();
                
                System.out.println("Pilih operasi:");
                System.out.println("1. Operator Matematika");
                System.out.println("2. Operator Bitwise");
                System.out.println("3. Operator Pembanding");
                System.out.println("4. Operator Penugasan");
                System.out.println("5. Keluar");
                
                int pilihan = keyboard.nextInt();
                
                double hasil = 0.0; // Inisialisasi hasil
                
                switch (pilihan) {
                    case 1:
                        // Operator Matematika
                        System.out.println("1. Penjumlahan");
                        System.out.println("2. Pengurangan");
                        System.out.println("3. Perkalian");
                        System.out.println("4. Pembagian");
                        System.out.println("5. Sisa Bagi");
                        
                        int operasiMatematika = keyboard.nextInt();
                        
                        switch (operasiMatematika) {
                            case 1:
                                hasil = Nilai1 + Nilai2;
                                System.out.println("Hasil Penjumlahan = " + hasil);
                                break;
                            case 2:
                                hasil = Nilai1 - Nilai2;
                                System.out.println("Hasil Pengurangan = " + hasil);
                                break;
                            case 3:
                                hasil = Nilai1 * Nilai2;
                                System.out.println("Hasil Perkalian = " + hasil);
                                break;
                            case 4:
                                hasil = Nilai1 / Nilai2;
                                System.out.println("Hasil Pembagian = " + hasil);
                                break;
                            case 5:
                                hasil = Nilai1 % Nilai2;
                                System.out.println("Hasil Sisa Bagi = " + hasil);
                                break;
                            default:
                                System.out.println("Pilihan operasi matematika tidak valid.");
                                break;
                        }
                        break;
                    case 2:
                        // Operator Bitwise
                        int intNilai1 = (int) Nilai1;
                        int intNilai2 = (int) Nilai2;
                        
                        System.out.println("Operator Bitwise:");
                        System.out.println("Nilai1 & Nilai2 = " + (intNilai1 & intNilai2));
                        System.out.println("Nilai1 | Nilai2 = " + (intNilai1 | intNilai2));
                        System.out.println("Nilai1 ^ Nilai2 = " + (intNilai1 ^ intNilai2));
                        System.out.println("Nilai1 << Nilai2 = " + (intNilai1 << intNilai2));
                        System.out.println("Nilai1 >> Nilai2 = " + (intNilai1 >> intNilai2));
                        break;
                    case 3:
                        // Operator Pembanding
                        System.out.println("Operator Pembanding:");
                        System.out.println("Nilai1 == Nilai2: " + (Nilai1 == Nilai2));
                        System.out.println("Nilai1 != Nilai2: " + (Nilai1 != Nilai2));
                        System.out.println("Nilai1 > Nilai2: " + (Nilai1 > Nilai2));
                        System.out.println("Nilai1 < Nilai2: " + (Nilai1 < Nilai2));
                        System.out.println("Nilai1 >= Nilai2: " + (Nilai1 >= Nilai2));
                        System.out.println("Nilai1 <= Nilai2: " + (Nilai1 <= Nilai2));
                        break;
                    case 4:
                        // Operator Penugasan
                        System.out.println("Operator Penugasan:");
                        System.out.println("1. += (Tambah dan Berikan Nilai)");
                        System.out.println("2. -= (Kurang dan Berikan Nilai)");
                        System.out.println("3. *= (Kali dan Berikan Nilai)");
                        System.out.println("4. /= (Bagi dan Berikan Nilai)");
                        System.out.println("5. %= (Sisa Bagi dan Berikan Nilai)");
                        
                        int operasiPenugasan = keyboard.nextInt();
                        
                        switch (operasiPenugasan) {
                            case 1:
                                Nilai1 += Nilai2;
                                System.out.println("Nilai1 setelah +=: " + Nilai1);
                                break;
                            case 2:
                                Nilai1 -= Nilai2;
                                System.out.println("Nilai1 setelah -=: " + Nilai1);
                                break;
                            case 3:
                                Nilai1 *= Nilai2;
                                System.out.println("Nilai1 setelah *=: " + Nilai1);
                                break;
                            case 4:
                                Nilai1 /= Nilai2;
                                System.out.println("Nilai1 setelah /=: " + Nilai1);
                                break;
                            case 5:
                                Nilai1 %= Nilai2;
                                System.out.println("Nilai1 setelah %=: " + Nilai1);
                                break;
                            default:
                                System.out.println("Pilihan operasi penugasan tidak valid.");
                                break;
                        }
                        break;
                    case 5:
                        // Keluar dari program
                        exit = true;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid.");
                        break;
                }
            }
        }
    }
}

