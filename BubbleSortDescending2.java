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
public class BubbleSortDescending2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, i, j, swap;

        System.out.print("Masukkan jumlah bilangan yang mau di-input: ");
        jumlah = input.nextInt();

        int array[] = new int[jumlah];

        System.out.println("\nMasukkan " + jumlah + " buah bilangan integer");
        System.out.println("------------------------");
        for (i = 0; i < jumlah; i++) {
            System.out.print("Bilangan ke-" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        System.out.println("\nBilangan belum terurutnya");
        for (int a = 0; a < jumlah; a++) {
            System.out.print(array[a] + " ");
        }

        for (i = 0; i < (jumlah - 1); i++) {
            for (j = 0; j < jumlah - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }

        System.out.println("\n\nBilangan terurutnya adalah ");
        for (i = 0; i < jumlah; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
