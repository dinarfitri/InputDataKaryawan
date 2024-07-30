/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class dl_data_karyawan {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    
    private String sql;
    
    public String nip;
    public String nama;
    public String jabatan;
    public String jenis_kelamin;
    public String agama;
    public String status;
    public String alamat;
    
    public void simpan() throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "INSERT INTO input_data_karyawan(nip,nama,jabatan,jenis_kelamin,agama,status,alamat)VALUES(?,?,?,?,?,?,?)";
        pst = conn.prepareStatement(sql);
        pst.setString(1, nip);
        pst.setString(2, nama);
        pst.setString(3, jabatan);
        pst.setString(4, jenis_kelamin);
        pst.setString(5, agama);
        pst.setString(6, status);
        pst.setString(7, alamat);
        pst.execute();
        pst.close();
    }
    
    public void rubah() throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "UPDATE data_karyawan set nama=?,jabatan=?,jenis_kelamin=?,agama=?,status=?,alamat=? where nip=?";
//        pst.setString(1, nama);
//        pst.setString(2, jabatan);
//        pst.setString(3, jenis_kelamin);
//        pst.setString(4, agama);
//        pst.setString(5, status);
//        pst.setString(6, alamat);
//        pst.setString(7, nip);
        pst.setString(1, nip);
        pst.setString(2, nama);
        pst.setString(3, jabatan);
        pst.setString(4, jenis_kelamin);
        pst.setString(5, agama);
        pst.setString(6, status);
        pst.setString(7, alamat);
        pst.execute();
        pst.close();
        pst = conn.prepareStatement(sql);
    }
    
    public void hapus() throws SQLException{
        conn = Koneksi.getKoneksi();
        String sql = "DELETE from input_data_karyawan where nip=?";
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, nip);
            pst.execute();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public ResultSet UpdateJTable() throws SQLException{
        conn = Koneksi.getKoneksi();
        sql = "select nip,nama,jabatan,jenis_kelamin,agama,status,alamat from input_data_karyawan";
        rs = pst.executeQuery();
        return rs;
    }
}
