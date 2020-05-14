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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Random;
public class InsertionSort5 {
    public static void main (String[] args) throws IOException {
        //objek BufferedReader
        BufferedReader dataIn = new BufferedReader (new InputStreamReader (System.in));
        
        //input jumlah data
        System.out.print("Masukkan jumlah data: ");
        int jlh_data = Integer.parseInt(dataIn.readLine());
        
        //array data untuk menampung nilai data
        int[] data = new int [jlh_data];
        
        //menu pengisian data
        System.out.println("\nMenu pengisian data");
        System.out.println("1. Di-input oleh user");
        System.out.println("2. Diisi oleh program");
        System.out.print("Pilihan: ");
        int isi_data = Integer.parseInt(dataIn.readLine());
        
        switch (isi_data) {
            case 1:         //pengisian data oleh si user
                System.out.println();
                for (int a = 0; a < jlh_data; a++) {
                    System.out.print("Data ke-" + (a + 1) + " : ");
                    data [a] = Integer.parseInt(dataIn.readLine());
                }
                
                break;
                
            case 2:         //pengisian data oleh program -> diisi secara acak
                System.out.println();
                for (int a = 0; a < jlh_data; a++) {
                    data [a] = new Random().nextInt(201);
                }
                
                //tampilkan data yang diisi oleh program
                System.out.print("Data: ");
                for (int a = 0; a < jlh_data; a++) {
                    System.out.print(data [a] + " ");
                }
                
                break;
            
            default: System.out.println("\nPilihan tidak tersedia");
        }
        
        //proses insertion sort
        System.out.println("\nProses Insertion Sort");
        for (int a = 0; a < jlh_data - 1; a++) {
            System.out.println("Iterasi ke-" + (a + 1));
            
            for (int b = 0; b < jlh_data; b++) {
                System.out.print(data [b] + "\t");
            }
            
            System.out.print("   --> bandingkan " + data [a + 1] + " dengan " + data [a]);
            
            for (int b = a + 1; b > 0; b--) {
                String pesan = "   --> tidak ada pertukaran";
                
                if (data [b] < data [b - 1]) {
                    pesan = "   --> " + data [b] + " tukar posisi dengan " + data [b - 1];
                    
                    //proses pertukaran
                    int temp = data [b];
                    data [b] = data [b - 1];
                    data [b - 1] = temp;
                    
                    System.out.println();
                    for (int c = 0; c < jlh_data; c++) {
                        System.out.print(data [c] + "\t");
                        System.out.print(pesan);
                    }
                } else {
                    System.out.println();
                    for (int c = 0; c < jlh_data; c++) {
                        System.out.print(data [c] + "\t");
                    }
                    
                    System.out.print(pesan);
                    break;
                }
            }
            System.out.println("\n");
        }
        
        //tampilkan hasil sorting
        System.out.print("\nData setelah di-sorting: ");
        for (int a = 0; a < jlh_data; a++) {
            System.out.print(data [a] + " ");
        }
    }
}
