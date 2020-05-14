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

public class InsertionSort {
    public static void main (String[] args) {
        int a[] = {8, 5, 9, 6, 3, 4, 2, 1, 7, 5};
        
        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int j = i;
            
            while ((j > 0) && (min < a [j - 1])) {
                a[j] = a[j - 1];
                j--;
            }
            
            a[j] = min;
        }
        
        for (int h = 0; h < a.length; h++) {
            System.out.print(a[h] + ", ");
        }
    }
}
