/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radesca
 */
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nama, nim;
        int uts, uas, usia;
        boolean cekMenu = true;
        
        System.out.println("Input Data ====");
        System.out.print("Nama  : ");
        nama = input.nextLine();
        System.out.print("Nim   : ");
        nim = input.next();
        System.out.print("Usia  : ");
        usia = input.nextInt();
        System.out.print("UTS   : ");
        uts = input.nextInt();
        System.out.print("UAS   : ");
        uas = input.nextInt();
        
        Mahasiswa dataMahasiswa = new Mahasiswa(nama, nim, usia, uts, uas);
        
        while(cekMenu){
            char pilihan;
            System.out.println("\n\nOpsi=====");
            System.out.println("1. Tampilkan data");
            System.out.println("2. Edit data");
            System.out.println("3. Exit");
            System.out.print("Pilih   : ");
            pilihan = input.next().charAt(0);
            
            if (pilihan == '1') {
                dataMahasiswa.tampilkanData();  
            }else if (pilihan == '2') {
                input.nextLine();
                System.out.println("\n\nEdit Data ====");
                System.out.print("Nama  : ");
                dataMahasiswa.nama = input.nextLine();
                System.out.print("Nim   : ");
                dataMahasiswa.nim = input.next();
                System.out.print("Usia  : ");
                dataMahasiswa.usia = input.nextInt();
                System.out.print("UTS   : ");
                dataMahasiswa.uts = input.nextInt();
                System.out.print("UAS   : ");
                dataMahasiswa.uas = input.nextInt();
            }else if (pilihan == '3') {
                cekMenu = false;
            }
        }
        
        
        
        
    }
}
