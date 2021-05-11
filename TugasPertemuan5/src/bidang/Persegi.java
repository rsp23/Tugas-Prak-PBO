/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bidang;

/**
 *
 * @author Radesca
 */
public class Persegi implements MenghitungBidang{
    public int panjang, lebar;
    public double luas, keliling;

    public Persegi(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        keliling = hitungKeliling();
        luas = hitungLuas();
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
