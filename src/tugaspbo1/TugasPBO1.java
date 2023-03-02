/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugaspbo1;

public class TugasPBO1 {

    public static void main(String[] args) {
       //tes output
       System.out.print("Halo Nama saya Hibatul Azis\n");
       System.out.print("Saya adalah Mahasiswa Teknik Informatika Universitas Dian Nuswantoro\n");
       System.out.print("Saya sedang menulis program java\n\n");
        
       //lingkaran
       final double phi = 3.14;
       double diameter = 10, hasil;
       hasil = phi * diameter;
       
       //segitiga
       int alas = 6, tinggi = 8, hasil2;
       hasil2 = alas*tinggi/2;
       
       //tabung
       int diametertb = 5;
       double rtabung = diametertb/2;
       int tinggitabung =  10;
       double hasiltb = 3.14 * rtabung * rtabung * tinggitabung ;
       
       System.out.println("Keliling Lingkaran = " + hasil);
       System.out.println("Luas Segitiga Siku = " + hasil2);
       System.out.println("Volume Tabung = " + hasiltb);
       
    }
    
  
}
