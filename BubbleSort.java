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

public class BubbleSort {
    public static void urutkan (int data[]) {
        for (int langkah = 0; langkah < data.length; langkah++) {
            for (int indeks = 0; indeks < data.length - 1; indeks++) {
                if (data [indeks] > data [indeks + 1]) {
                    int temp = data [indeks];
                    data [indeks] = data [indeks + 1];
                    data [indeks + 1] = temp;
                }
            }
        }
    }
}
