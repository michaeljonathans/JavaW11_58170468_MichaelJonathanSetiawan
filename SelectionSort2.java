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

public class SelectionSort2 {
    public static void main (String[] args) {
        int a[] = {8, 5, 9, 6, 3, 4, 2, 1, 7, 5};
        int i = 0;
        
        while(i < a.length - 1) {
            int tmp = i;
            
            for(int j = i + 1; j < a.length; j++) {
                if (a[j] < a[tmp])
                    tmp = j;
            }
            
            int hlp = a[i];
            a[i] = a[tmp];
            a[tmp] = hlp;
            i++;
        }
        
        //mencetak hasil
        for (int h = 0; h < a.length; h++) {
            System.out.print(a[h] + ", ");
        }
    }
}
