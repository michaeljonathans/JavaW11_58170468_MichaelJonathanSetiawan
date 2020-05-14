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
public class InsertionSort4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Banyak data: ");
        int N = input.nextInt();

        int data[] = new int[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = input.nextInt();
        }
        
        //proses insertion sort
        for (int i = 1; i < data.length; i++) {
            int key = data [i];
            int j = i;
            
            while (j > 0 && data [j - 1] > key) {
                data [j] = data [j - 1];
                j--;
            }
            
            data [j] = key;
        }
        
        //hasil pengurutan
        System.out.print("Data yang telah diurutkan: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data [i] + " ");
        }
        
        System.out.println();
    }
}
