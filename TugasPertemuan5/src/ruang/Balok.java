/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruang;

import bidang.Persegi;

/**
 *
 * @author Radesca
 */
public class Balok extends Persegi implements MenghitungRuang{
    private int tinggi;
    public double volume, luasPermukaan;
    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
        volume = hitungVolume();
        luasPermukaan = hitungLuasPermukaan();
    }

    
    @Override
    public double hitungVolume() {
        return luas*tinggi;
    }
    
    @Override
    public double hitungLuasPermukaan() {
        
        return 2*(luas)+2*(panjang*tinggi)+2*(lebar*tinggi);
        
    }
}
