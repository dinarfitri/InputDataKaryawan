/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Koneksi {
    private static Connection koneksi;
    public static Connection getKoneksi() {
        if(koneksi==null) {
            try{
                String url;
                url="jdbc:mysql://localhost:3306/data_karyawan";
                String username = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,username,password);
            }catch (SQLException t) {
                JOptionPane.showMessageDialog(null, "Error Koneksi");
            }
        } return koneksi;
    } static Object getConnection() {
        throw new UnsupportedOperationException ("Not yet implemented");
    }
}
