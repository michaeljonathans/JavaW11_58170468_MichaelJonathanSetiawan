/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 * Michael Jonathan Setiawan
 * 58170468
 */

import java.util.Scanner;
public class SelectionSort4 {
    public static void main (String[] args) {
        //buat objek scanner
        Scanner input = new Scanner (System.in);
        
        //input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jlh_data = input.nextInt();
        
        //input nilai tiap data
        int[] data = new int [jlh_data];         //array untuk nilai tiap data
        System.out.println();
        
        for (int x = 0; x < jlh_data; x++) {
            System.out.print("Input nilai data ke-" + (x + 1) + " : ");
            data [x] = input.nextInt();
        }
        
        //tampilkan data sebelum di-sorting
        System.out.println();
        System.out.print("Data sebelum di-sorting: ");
        
        for (int x = 0; x < jlh_data; x++) {
            System.out.print(data [x] + " ");
        }
        
        //proses selection sort
        System.out.println("\n\nProses Selection Sort");
        
        for (int x = 0; x < jlh_data - 1; x++) {
            System.out.println("Iterasi ke-" + (x + 1) + " : ");
            
            for (int y = 0; y < jlh_data; y++) {
                System.out.print(data [y] + " ");
            }
            
            System.out.println("Apakah data " + data [x] + " sudah benar urutannya?");
            
            boolean tukar = false;
            int index = 0;
            int min = data [x];
            String pesan = "Tidak ada pertukaran";
            
            for (int y = x + 1; y < jlh_data; y++) {
                if (min > data [y]) {
                    tukar = true;
                    index = y;
                    min = data [y];
                }
            }
            
            if (tukar == true) {
                //pertukaran data
                pesan = "Data " + data [x] + " ditukar dengan data " + data [index];
                
                int temp = data [x];
                data [x] = data [index];
                data [index] = temp;
            }
            
            for (int y = 0; y < jlh_data; y++) {
                System.out.print(data [y] + " ");
            }
            
            System.out.println(pesan + "\n");
        }
        
        //tampilkan data setelah di-sorting
        System.out.print("Data setelah di-sorting: ");
        for (int x = 0; x < jlh_data; x++) {
            System.out.print(data [x] + " ");
        }
    }
}
