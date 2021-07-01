/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Radesca
 */
public class ViewMovie extends JFrame{
  
    JLabel lJudul = new JLabel("Judul");
    JLabel lAlur = new JLabel("Alur(0-5)");
    JLabel lPenokohan = new JLabel("Penokohan(0-5)");
    JLabel lAkting = new JLabel("Akting(0-5)");
    
    public JTextField tfJudul = new JTextField();
    public JTextField tfAlur = new JTextField();
    public JTextField tfPenokohan = new JTextField();
    public JTextField tfAkting = new JTextField();
    
    public JButton bTambah = new JButton("Tambah");
    public JButton bUpdate = new JButton("Update");
    public JButton bDelete = new JButton("Delete");
    public JButton bClear = new JButton("Clear");

    
    public JTable table;
    public DefaultTableModel tableModel;
    JScrollPane scrollPane;
    public Object coloumnName[] = {"Judul", "Alur","Penokohan","Akting","Nilai"};
    
     
    public ViewMovie() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Data Movie");
        
        tableModel = new DefaultTableModel(coloumnName,0);
        table = new JTable(tableModel);
        scrollPane = new JScrollPane(table);
        
        setResizable(false);
        setVisible(true);
        setLayout(null);
        setSize(850, 600);
        setLocationRelativeTo(null);
        
        
        add(scrollPane);
        add(lJudul);
        add(lAlur);
        add(lPenokohan);
        add(lAkting);
        add(tfJudul);
        add(tfAlur);
        add(tfPenokohan);
        add(tfAkting);
        add(bTambah);
        add(bUpdate);
        add(bDelete);
        add(bClear);
        
        scrollPane.setBounds(25, 20, 600, 400);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        lJudul.setBounds(650, 20, 150, 20);
        tfJudul.setBounds(650, 40, 150, 20);
        lAlur.setBounds(650, 60, 150, 20);
        tfAlur.setBounds(650, 80, 150, 20);
        lPenokohan.setBounds(650, 100, 150, 20);
        tfPenokohan.setBounds(650, 120, 150, 20);
        lAkting.setBounds(650, 140, 150, 20);
        tfAkting.setBounds(650, 160, 150, 20);
        bTambah.setBounds(650, 200, 150, 20);
        bUpdate.setBounds(650, 230, 150, 20);
        bDelete.setBounds(650, 260, 150, 20);
        bClear.setBounds(650, 290, 150, 20);
        
        
        setLocationRelativeTo(null);
        
    
    }

    public String getJudul() {
        return tfJudul.getText();
    }

    public String getAlur() {
        return tfAlur.getText();
    }

    public String getPenokohan() {
        return tfPenokohan.getText();
    }

    public String getAkting() {
        return tfAkting.getText();
    }
    
    
    
    
}
