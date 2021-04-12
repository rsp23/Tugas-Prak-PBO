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
public class PersegiPanjang implements MenghitungBidang{


    private int panjang, lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }
    
    

    @Override
    public double hitungKeliling() {
        return 2*(panjang+lebar);
    }
    
    
    @Override
    public double hitungLuas() {
        return panjang*lebar;
    }
}
