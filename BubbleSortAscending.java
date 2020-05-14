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

import java.util.Arrays;
public class BubbleSortAscending {
    public static void main (String[] args) {
        //variabel
        int[] bilangan = {5, 12, 3, 19, 1, 47};
        
        //tampilkan bilangan
        System.out.println("Bilangan sebelum di-sorting bubble sort: " + Arrays.toString(bilangan));
        
        //proses Bubble Sort
        System.out.println("\nProses bubble sort secara ascending: ");
        for (int a = 0; a < bilangan.length; a++) {
            //tampilkan proses iterasi
            System.out.println("Iterasi " + (a + 1));
            for (int b = 0; b < bilangan.length - 1; b++) {
                if (bilangan [b] > bilangan [b + 1]) {
                    //proses pertukaran bilangan
                    int temp = bilangan [b];
                    bilangan [b] = bilangan [b + 1];
                    bilangan [b + 1] = temp;
                }
                //tampilkan proses pertukaran tiap iterasi
                System.out.println(Arrays.toString(bilangan));
            }
            System.out.println();
        }
        //tampilkan hasil akhir
        System.out.println("Hasil akhir setelah dilakukan sorting: " + Arrays.toString(bilangan));
    }
}
