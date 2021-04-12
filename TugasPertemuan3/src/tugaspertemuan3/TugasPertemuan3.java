/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3;

import java.util.Scanner;
import tugaspertemuan3.bangunruang.Balok;
import tugaspertemuan3.bangunruang.Kerucut;

/**
 *
 * @author Radesca
 */
public class TugasPertemuan3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int panjang,lebar,tinggi,jari;
        char pilih;
        Balok balok = new Balok(0,0,0);
        Kerucut kerucut = new Kerucut(0,0);
        
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("INPUT");
            System.out.println("1. Balok\n2. Kerucut\n3. Exit");
            System.out.print("Pilih : ");
            pilih = input.next().charAt(0);
            
            if (pilih == '1') {
                System.out.print("Panjang\t:");
                panjang = input.nextInt();
                System.out.print("Lebar\t:");
                lebar = input.nextInt();
                System.out.print("Tinggi\t:");
                tinggi = input.nextInt();
                balok.setLebar(lebar);
                balok.setPanjang(panjang);
                balok.setTinggi(tinggi);
                System.out.println("------OUTPUT-----");
                System.out.println("Luas Persegi     \t: "+ balok.hitungLuas());
                System.out.println("Keliling Persegi    \t: "+ balok.hitungKeliling());
                System.out.println("Volume Balok    \t: "+ balok.hitungVolume());
                System.out.println("Luas Permukaan Balok\t: " +balok.hitungLuasPermukaan() +"\n\n");
            }else if (pilih =='2') {
                System.out.print("Jari-jari\t:");
                jari = input.nextInt();
                System.out.print("Tinggi\t\t:");
                tinggi=input.nextInt();
                
                kerucut.setJari(jari);
                kerucut.setTinggi(tinggi);
                
                System.out.println("------OUTPUT------");
                System.out.println("Luas Lingkaran\t\t: "+ kerucut.hitungLuas());
                System.out.println("Keliling Lingkaran\t: "+ kerucut.hitungKeliling());
                System.out.println("Volume Kerucut\t\t: "+ kerucut.hitungVolume());
                System.out.println("Luas Permukaan Kerucut\t: "+ kerucut.hitungLuasPermukaan()+"\n\n");
            }else if (pilih == '3') {
                break;
            }
        }
    }
    
}
