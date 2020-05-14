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

public class InsertionSort2 {
    public static void main (String[] args) {
        int[] tabInt = {51, 23, 17, 32, 43, 88};
        int i, j, data_sisip;
        
        for (i = 1; i < 6; i++) {
            data_sisip = tabInt [i];
            j = i;
            
            while((j > 0) && (tabInt [j - 1] > data_sisip)) {
                tabInt [j] = tabInt [j - 1];
                j = j - 1;
            }
            
            tabInt [j] = data_sisip;
        }
        
        for (i = 0; i < 6; i++) {
            System.out.print(tabInt [i] + " ");
        }
    }
}
