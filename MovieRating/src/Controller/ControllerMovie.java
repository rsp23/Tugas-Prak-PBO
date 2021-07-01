/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Radesca
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import model.ModelMovie;
import view.ViewMovie;

public class ControllerMovie implements ActionListener{
    
    ViewMovie viewMovie;
    ModelMovie modelMovie;
   
    public ControllerMovie(ViewMovie viewMovie, ModelMovie modelMovie) {
        this.viewMovie = viewMovie;
        this.modelMovie = modelMovie;
        
        refreshTable();
        viewMovie.bTambah.addActionListener(this);
        viewMovie.bUpdate.addActionListener(this);
        viewMovie.bDelete.addActionListener(this);
        viewMovie.bClear.addActionListener(this);
        
        viewMovie.table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                int row = viewMovie.table.getSelectedRow();

                viewMovie.tfJudul.setText(viewMovie.table.getValueAt(row,0).toString());
                viewMovie.tfAlur.setText(viewMovie.table.getValueAt(row,1).toString());
                viewMovie.tfPenokohan.setText(viewMovie.table.getValueAt(row,2).toString());
                viewMovie.tfAkting.setText(viewMovie.table.getValueAt(row,3).toString());
                
            }
        });
    }
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == viewMovie.bTambah){
            tambahMovie();
        }else if(e.getSource() == viewMovie.bUpdate){
            updateMovie();
        }else if(e.getSource() == viewMovie.bDelete){
            deleteMovie();
        }else if(e.getSource() == viewMovie.bClear){
            clear();
        }
    }
    
    
    public void tambahMovie(){
        String judul = viewMovie.getJudul();
        String alur = viewMovie.getAlur();
        String penokohan = viewMovie.getPenokohan();
        String akting = viewMovie.getAkting();
        
        if (judul.equals("") || alur.equals("") || penokohan.equals("") || akting.equals("")){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }else{
        
            if (modelMovie.insertMovie(judul, alur, penokohan, akting) == 1){
                JOptionPane.showMessageDialog(null,"Berhasil Ditambahkan");
                refreshTable();
                clear();
            } else {
                JOptionPane.showMessageDialog(null,"Data Sudah Ada/Anda yang salah input!");
            }
        }
        
    }

    
    public void refreshTable(){
        String data[][] = modelMovie.getAllMovies();
        viewMovie.table.setModel(new JTable(data, viewMovie.coloumnName).getModel());
    
    }
    
    public void updateMovie(){
        String judul = viewMovie.getJudul();
        String alur = viewMovie.getAlur();
        String penokohan = viewMovie.getPenokohan();
        String akting = viewMovie.getAkting();
        
        if (judul.equals("") || alur.equals("") || penokohan.equals("") || akting.equals("")){
            JOptionPane.showMessageDialog(null, "Data Tidak Boleh Kosong");
        }else{
        
            if (modelMovie.updateMovie(judul, alur, penokohan, akting) == 1){
                JOptionPane.showMessageDialog(null,"Berhasil Diupdate");
                refreshTable();
                clear();
            } else {
                JOptionPane.showMessageDialog(null,"Data Tidak Ada/Anda yang salah input!");
            }
        }
        
        
    
    }
    
    public void deleteMovie(){
        String judul = viewMovie.getJudul();

            if (judul.equals("")){
                JOptionPane.showMessageDialog(null, "Judul Tidak Boleh Kosong");
            } else {
                if (modelMovie.deleteMovie(judul) == 1)
                    JOptionPane.showMessageDialog(null, "Delete Berhasil");
                else
                    JOptionPane.showMessageDialog(null, "Delete Gagal");
            }
            refreshTable();
            clear();
    
    }
    
    public void clear(){
        viewMovie.tfJudul.setText("");
        viewMovie.tfAlur.setText("");
        viewMovie.tfPenokohan.setText("");
        viewMovie.tfAkting.setText("");
    }
}
