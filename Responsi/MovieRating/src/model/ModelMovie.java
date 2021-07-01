/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Radesca
 */
public class ModelMovie {
    
    private Statement statement;
    
    public int checkAlreadyMovie(String judul){
        int count = 0;
        try {
            String query = "SELECT COUNT(*) as count FROM movie " +
                    "WHERE judul = '" + judul + "'";
            statement = (Statement) Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next())
                count = resultSet.getInt("count");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return count;
    }
    
    
    public int insertMovie(String judul, String alur, String penokohan, String akting){
        int count = 0;
        double dAlur = -1;
        double dPenokohan = -1;
        double dAkting = -1;
        double dNilai = -1;
        try {
            
            dAlur = Double.parseDouble(alur);
            dPenokohan = Double.parseDouble(penokohan);
            dAkting = Double.parseDouble(akting);
          
            if (checkAlreadyMovie(judul) == 0){
                if((dAlur >=0 && dAlur <=5) && (dPenokohan >=0 && dPenokohan <=5) && (dAkting >=0 && dAkting <=5)){
                    dNilai = (dAlur + dPenokohan + dAkting)/3;
                    String query = "INSERT INTO movie VALUES" +
                            "('" + judul + "','" + dAlur + "','" + dPenokohan + "','" + dAkting + "','" + dNilai + "')";
                    statement = (Statement) Database.getConnection().createStatement();
                    statement.executeUpdate(query);
                    count = 1;
                }else{
                    JOptionPane.showMessageDialog(null,"Nilai harus 0-5!");
                }
            }
        } catch (Exception error) {
             JOptionPane.showMessageDialog(null,error.getMessage());
        }
        return count;
    }
    
    
    public int getCountMovies(){
        int total = 0;
        try {
            String query = "SELECT COUNT(*) as Count FROM movie";
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            if (resultSet.next()){
                total = resultSet.getInt("Count");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return total;
    }
    
    public String[][] getAllMovies(){
        String[][] data = new String[getCountMovies()][5];
        try{
            String query = "SELECT * FROM movie ORDER BY judul ASC";
            statement = Database.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            int i = 0;
            while (resultSet.next()){
                data[i][0] = resultSet.getString("judul");
                data[i][1] = resultSet.getString("alur");
                data[i][2] = resultSet.getString("penokohan");
                data[i][3] = resultSet.getString("akting");
                data[i][4] = resultSet.getString("nilai");
                
                i++;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return data;
    }
    
    
    public int updateMovie(String judul, String alur, String penokohan, String akting){
        int count = 0;
        double dAlur = -1;
        double dPenokohan = -1;
        double dAkting = -1;
        double dNilai = -1;
        try {
            
            dAlur = Double.parseDouble(alur);
            dPenokohan = Double.parseDouble(penokohan);
            dAkting = Double.parseDouble(akting);
          
            if (checkAlreadyMovie(judul) == 1){
                if((dAlur >=0 && dAlur <=5) && (dPenokohan >=0 && dPenokohan <=5) && (dAkting >=0 && dAkting <=5)){
                    dNilai = (dAlur + dPenokohan + dAkting)/3;
                    String query = "UPDATE movie SET " +
                    "alur = '" + dAlur + "', penokohan = '" + dPenokohan + "', " +
                    "akting = '" + dAkting + "', nilai = '" + dNilai + "' " +
                    "WHERE judul = '" + judul + "'";
                    statement = Database.getConnection().createStatement();
                    statement.executeUpdate(query);
                    count = 1;
                }else{
                    JOptionPane.showMessageDialog(null,"Nilai harus 0-5!");
                }
            }
        } catch (Exception error) {
             JOptionPane.showMessageDialog(null,error.getMessage());
        }
        return count;
    
    }
    
    public int deleteMovie(String judul){
        int result = 0;
        try {
            if (checkAlreadyMovie(judul) == 1){
                String query = "DELETE FROM movie WHERE judul = '" + judul + "'";
                statement = Database.getConnection().createStatement();
                statement.executeUpdate(query);
                result = 1;
            }else{
                JOptionPane.showMessageDialog(null,"Judul Tidak ada!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return result;
    }
}
