/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.bangunruang;

import tugaspertemuan3.bidangdatar.Lingkaran;

/**
 *
 * @author Radesca
 */
public class Kerucut extends Lingkaran implements MenghitungRuang{

    private int tinggi;
    public Kerucut(int jari, int tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    public double hitungLuasSelimut(){
        int jariKerucut = getJari();
        double selimutKuadrat = (jariKerucut*jariKerucut)+(tinggi*tinggi);
        double selimut = Math.sqrt(selimutKuadrat);
        return Math.PI*jariKerucut*selimut;
    }
    @Override
    public double hitungLuasPermukaan() {
        return hitungLuas() + hitungLuasSelimut();
    }
    
    @Override
    public double hitungVolume() {
        return (hitungLuas()*tinggi)/3;
    }   
    
}
