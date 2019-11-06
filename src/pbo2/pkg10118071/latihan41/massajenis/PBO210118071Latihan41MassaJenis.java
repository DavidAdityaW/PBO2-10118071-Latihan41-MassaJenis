/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan41.massajenis;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk menghitung
 *                     volume dan massa jenis
 * 
 */
public class PBO210118071Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Kubus kubus = new Kubus();
        kubus.setSisi(5);
        kubus.setMassa(250);
        
        System.out.println("===Massa Jenis Kubus===");
        System.out.println("Sisi : "+kubus.getSisi());
        System.out.println("Massa : "+kubus.getMassa());
        
        System.out.println("===Hasil Perhitungan===");
        System.out.println("Volume : "+kubus.hitungVolume(kubus.getSisi()));
        System.out.println("Massa Jenis : "+kubus.hitungMassaJenis(kubus.getMassa(), kubus.hitungVolume(kubus.getSisi())));
        
    }
    
}
