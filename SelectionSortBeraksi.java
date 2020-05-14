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

public class SelectionSortBeraksi {
    public static void main (String[] args) {
        int data[] = {34, 86, 15};
        
        System.out.print("Data awal: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        SelectionSort.urutkan(data);
        
        System.out.print('\n' + "Data hasil: ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
        
        System.out.println();
    }
}
