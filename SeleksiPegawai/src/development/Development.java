/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package development;

/**
 *
 * @author Radesca
 */
abstract class Development {
    private String nama;
    private String nik;
    public int nilaiTulis, nilaiCoding, nilaiWawancara;

    public Development(String nama, String nik, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        this.nama = nama;
        this.nik = nik;
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
    }
    
    abstract void hasilTes();
    
    public void editNilai(int nilaiTulis, int nilaiCoding, int nilaiWawancara){
        
        this.nilaiTulis = nilaiTulis;
        this.nilaiCoding = nilaiCoding;
        this.nilaiWawancara = nilaiWawancara;
        
    }

    public String getNama() {
        return nama;
    }
    
    
}
