/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radesca
 */


public class Mahasiswa {
   
   String nama, nim;
   int usia, uts, uas;

    public Mahasiswa(String nama, String nim, int usia, int uts, int uas) {
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
        this.uts = uts;
        this.uas = uas;
    }
    
    
    void tampilkanData(){
        System.out.println("\n\nPerkenalkan nama saya " + nama + " Nim " + nim + " ,");
        System.out.println("Usia    : "+usia);
        System.out.println("Nilai   : "+ perhitungan());
    }
    
    float perhitungan(){
        float a = 2;
        return (uts + uas)/a;
    }
   
    
   
   
    
}
