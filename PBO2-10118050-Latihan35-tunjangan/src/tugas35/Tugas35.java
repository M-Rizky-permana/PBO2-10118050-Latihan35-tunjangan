/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas35;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Tugas35 {
     public String Status;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        PerhitunganGaji PG = new PerhitunganGaji();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa Gaji Pokok anda perbulan ?: Rp .");
        PG.gaji = (int) s.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) : ");
        PG.status = s.next();
        
        System.out.println();
        System.out.println("========Hasil Perhitungan========");
        System.out.println("Gaji Pokok : RP. "+PG.gaji);
        System.out.println("Tunjangan : RP. "+PG.perhitungTunjangan());
        System.out.println("Total Gaji : RP. "+PG.perhitungGajiTotal());
        System.out.println("Developed by : Rizki Adam Kurniawan");
        
        
        
    }
    
}
