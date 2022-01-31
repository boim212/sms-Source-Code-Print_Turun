/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package print_turun;

import java.util.Scanner;

/**
 *
 * @author Personal
 */
public class Print_Turun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        int angka, angkaBaru;
        String nama;
       
        nama = "FX BIMA YUDHA PRATAMA";
       
        System.out.print  ("Masukkan Angka = ");
        angka = input.nextInt();
        
            while(angka > 0)
            {
                System.out.printf ("%d. %s %n" , angka, nama);
                angkaBaru = angka - 1;
                angka--;
            }
    }
}
