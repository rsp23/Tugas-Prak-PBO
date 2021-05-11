/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import bidang.Persegi;
import java.awt.event.*;
import javax.swing.*;
import ruang.Balok;
/**
 *
 * @author Radesca
 */
public class View extends JFrame implements ActionListener {
    JLabel ljudul = new JLabel("KALKULATOR BALOK");
    JLabel lpanjang = new JLabel("Panjang");
    final JTextField fpanjang = new JTextField();
    JLabel llebar = new JLabel("Lebar");
    final JTextField flebar = new JTextField();
    JLabel ltinggi = new JLabel("Tinggi");
    final JTextField ftinggi = new JTextField();
    
    JButton bhitung = new JButton("Hitung");
    JButton breset = new JButton("Reset");
    
    JLabel lvolume = new JLabel("");
    JLabel lluasPermukaan = new JLabel("");
    JLabel lluas = new JLabel("");
    JLabel lkeliling = new JLabel("");
    JLabel lhasil = new JLabel("Hasil:");
    
    private int panjang, lebar, tinggi;
    
    public View(){
        setTitle("Aplikasi");
        setSize(400, 500);
        setLayout(null);
        add(ljudul);
        add(lpanjang);
        add(fpanjang);
        add(llebar);
        add(flebar);
        add(ltinggi);
        add(ftinggi);
        add(bhitung);
        add(breset);
        add(lvolume);
        add(lluasPermukaan);
        add(lluas);
        add(lkeliling);
        add(lhasil);
        ljudul.setBounds(100,10,150,40);
        lpanjang.setBounds(10,60,120,20);
        fpanjang.setBounds(130,60,150,20);
        llebar.setBounds(10,90,120,20);
        flebar.setBounds(130,90,150,20);
        ltinggi.setBounds(10,120,120,20);
        ftinggi.setBounds(130,120,150,20);
        lhasil.setBounds(100,140,120,20);
        lluas.setBounds(10,170,200,20);
        lkeliling.setBounds(10,200,200,20);
        lvolume.setBounds(10,230,200,20);
        lluasPermukaan.setBounds(10,260,200,20);
        bhitung.setBounds(80,290,80,20);
        breset.setBounds(170,290,80,20);
        
        
        setVisible(true);
        setLocationRelativeTo(null);
        bhitung.addActionListener(this);
        
        breset.addActionListener(this);
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    
    public void actionPerformed(ActionEvent e)
        {
            if(e.getSource() == bhitung)
            {   
                try{
                    panjang = Integer.parseInt(fpanjang.getText());
                    lebar = Integer.parseInt(flebar.getText());
                    tinggi = Integer.parseInt(ftinggi.getText());
                    Persegi persegi = new Persegi(panjang,lebar);
                    Balok balok = new Balok(panjang,lebar,tinggi);
                    lluas.setText(String.valueOf("Luas Persegi\t= "+persegi.luas));
                    lkeliling.setText(String.valueOf("Keliling Persegi\t = "+persegi.keliling));
                    lvolume.setText(String.valueOf("Volume Balok\t= "+balok.volume));
                    lluasPermukaan.setText(String.valueOf("Luas Permukaan Balok\t= "+balok.luasPermukaan));
                }catch (Exception error){
                    JOptionPane.showMessageDialog(this, error.getMessage());
                    
                }
                
                
            }
            
            if(e.getSource() == breset){
                lluas.setText("");
                lkeliling.setText("");
                lvolume.setText("");
                lluasPermukaan.setText("");
                fpanjang.setText("");
                flebar.setText("");
                ftinggi.setText("");
            }

        }
}
