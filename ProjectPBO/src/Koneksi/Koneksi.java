/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksi;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class Koneksi {
    private static java.sql.Connection koneksi;
    
    public static java.sql.Connection getKoneksi(){
        if (koneksi==null){
            try{
                String url = "jdbc:mysql://localhost:3306/katanya";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                koneksi = DriverManager.getConnection(url,user,pass);
                System.out.println("koneksi sukses");
            }catch (SQLException e){
                System.out.println(e);
            }
        }
        return koneksi;
    }
    public static void main(String[] args) {
        getKoneksi();
    }
}
