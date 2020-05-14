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

public class MergeSort {
    public static void main(String[] args) {
        System.out.println("Merge Sorting");
        System.out.println();

        //angka yang akan diurutkan:
        int n[] = {3, 9, 4, 1, 5, 2};
        System.out.println("Sebelum diurutkan: ");

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
        System.out.println();

        initializemergeSort(n, 0, n.length - 1);
        System.out.println();
        System.out.println("Setelah diurutkan: ");

        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i] + " ");
        }
    }

    public static void initializemergeSort(int n[], int l, int h) {
        int low = l;
        int high = h;

        if (low >= high) {
            return;
        }
        
        int middle = (low + high) / 2;
        
        initializemergeSort(n, low, middle);
        initializemergeSort(n, middle + 1, high);
        int end_low = middle;
        int start_high = middle + 1;
        
        while((l <= end_low) && (start_high <= high)) {
            if (n[low] < n[start_high]) {
                low++;
            } else {
                int Temp = n[start_high];
                
                for (int k = start_high - 1; k >= low; k--) {
                    n[k + 1] = n[k];
                }
                n[low] = Temp;
                low++;
                end_low++;
                start_high++;
            }
        }
    }
}
