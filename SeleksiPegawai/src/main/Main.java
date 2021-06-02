/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import development.AndroidDevelopment;
import development.WebDevelopment;
import java.util.Scanner;

/**
 *
 * @author Radesca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        char pilihPertama, pilihKedua;
        String nik, nama;
        int nilaiTulis, nilaiCoding, nilaiWawancara;
        
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1. Android Development\n2. Web Development");
        System.out.print("Pilih Jenis Form: ");
        pilihPertama = input.next().charAt(0);
        
        if(pilihPertama == '1' || pilihPertama =='2'){
            System.out.println("\nFORM PENDAFTARAN");
            System.out.print("\nInput NIK\t: ");
            nik = input.next();
            System.out.print("Input Nama\t: ");
            input.nextLine();
            nama = input.nextLine();
            System.out.print("Input Nilai Tes Tulis\t\t: ");
            nilaiTulis = input.nextInt();
            System.out.print("Input Nilai Tes Coding\t\t: ");
            nilaiCoding = input.nextInt();
            System.out.print("Input Nilai Tes Wawancara\t: ");
            nilaiWawancara = input.nextInt();
            
            if (pilihPertama =='1') {
                AndroidDevelopment peserta = new AndroidDevelopment(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
                while(true){
                    System.out.print("\n\tMENU\n1. Edit\n2. Tampil\n3. Exit\nPilih: ");
                    pilihKedua=input.next().charAt(0);

                    if (pilihKedua == '1') {
                        System.out.println("\n\tFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis\t\t: ");
                        nilaiTulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding\t\t: ");
                        nilaiCoding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara\t: ");
                        nilaiWawancara = input.nextInt();
                        peserta.editNilai(nilaiTulis, nilaiCoding, nilaiWawancara);
                        peserta.hitungNilaiAkhir();
                    }else if (pilihKedua=='2') {
                        peserta.hasilTes();
                    }else if (pilihKedua =='3') {
                        break;
                    }else{
                        System.out.println("Input Salah!!");
                    }
                }
            }else if (pilihPertama=='2') {
                WebDevelopment peserta = new WebDevelopment(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
                while(true){
                    System.out.print("\n\tMENU\n1. Edit\n2. Tampil\n3. Exit\nPilih: ");
                    pilihKedua=input.next().charAt(0);

                    if (pilihKedua == '1') {
                        System.out.println("\n\tFORM EDIT");
                        System.out.print("Input Nilai Tes Tulis\t\t: ");
                        nilaiTulis = input.nextInt();
                        System.out.print("Input Nilai Tes Coding\t\t: ");
                        nilaiCoding = input.nextInt();
                        System.out.print("Input Nilai Tes Wawancara\t: ");
                        nilaiWawancara = input.nextInt();
                        peserta.editNilai(nilaiTulis, nilaiCoding, nilaiWawancara);
                        peserta.hitungNilaiAkhir();
                    }else if (pilihKedua=='2') {
                        peserta.hasilTes();
                    }else if (pilihKedua =='3') {
                        break;
                    }else{
                        System.out.println("Input Salah!!");
                    }
                }
            }
            

            
        }else{
            System.out.println("Input Salah! Silahkan mulai ulang");
        }
        
        
    }
    
}
