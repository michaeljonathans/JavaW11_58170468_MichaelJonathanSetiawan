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

public class SelectionSort {
    public static void urutkan (int data[]) {
        for (int langkah = 0; langkah < data.length - 1; langkah++) {
            int indeksTerkecil = langkah;
            
            for (int indeks = langkah + 1; indeks < data.length; indeks++) {
                if (data [indeks] < data [indeksTerkecil])
                    indeksTerkecil = indeks;
            }
            
            int temp = data [langkah];
            data [langkah] = data [indeksTerkecil];
            data [indeksTerkecil] = temp;
        }
    }
}
