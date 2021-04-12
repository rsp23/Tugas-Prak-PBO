/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.bangunruang;

import tugaspertemuan3.bidangdatar.PersegiPanjang;

/**
 *
 * @author Radesca
 */
public class Balok extends PersegiPanjang implements MenghitungRuang{



    private int tinggi;
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double hitungVolume() {
        return hitungLuas()*tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        int panjangPersegi = getPanjang();
        int lebarPersegi = getLebar();
        return 2*(hitungLuas())+2*(panjangPersegi*tinggi)+2*(lebarPersegi*tinggi);
        
    }

}
