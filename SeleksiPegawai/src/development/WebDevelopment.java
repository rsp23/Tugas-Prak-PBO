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
public class WebDevelopment extends Development implements MenghitungSeleksi {
    private double nilaiAkhir;

    public WebDevelopment(String nama, String nik, int nilaiTulis, int nilaiCoding, int nilaiWawancara) {
        super(nama, nik, nilaiTulis, nilaiCoding, nilaiWawancara);
        hitungNilaiAkhir();
    }
    
    
    @Override
    public void hasilTes() {
        System.out.println("Nilai Akhir\t: "+nilaiAkhir);
        if (nilaiAkhir>=85) {
            System.out.println("Keterangan\t: Lolos");
            System.out.println("Selamat kepada "+ getNama() +" telah diterima sebagai Web");
        }else{
            System.out.println("Keterangan\t: Gagal");
            System.out.println("Mohon maaf kepada "+ getNama() +" telah ditolak sebagai Web");
        }
    }

    @Override
    public void hitungNilaiAkhir() {
        this.nilaiAkhir=(nilaiTulis*0.4)+(nilaiCoding*0.35)+(nilaiWawancara*0.25);
    }
    
}
