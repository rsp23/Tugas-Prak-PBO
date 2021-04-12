/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan3.bidangdatar;

/**
 *
 * @author Radesca
 */
public class Lingkaran implements MenghitungBidang{
    private int jari;

    public Lingkaran(int jari) {
        this.jari = jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }

    public int getJari() {
        return jari;
    }
    

    @Override
    public double hitungKeliling() {
        return 2*Math.PI*jari; 
    }
    

    
    @Override
    public double hitungLuas() {
        return Math.PI*jari*jari;
    }
    
}
