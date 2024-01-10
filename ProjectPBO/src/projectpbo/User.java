/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpbo;

import Koneksi.Koneksi;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author kdkfr
 */
public class User {
    private int id;
    private String username;
    private Score userScore;
    
    public User(int id, String username, int userSkor){
        this.id = id;
        this.setUser(username);
        this.setSkor(userSkor);
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setUser(String user){
        this.username = user;
    }
    public String getUser(){
        return this.username;
    }
    
    public void setSkor(int skor){
        this.userScore = new Score(skor);
    }
    public int getSkor(){
        return this.userScore.getScore();
    }
    public void addScore(int newScore){
        int scoreUpdate = this.userScore.getScore() + newScore;
        try {
            java.sql.Connection conn = Koneksi.getKoneksi();
            PreparedStatement stmt = conn.prepareStatement("UPDATE akun SET skor=? WHERE username=? AND skor=?");
            stmt.setString(1, String.valueOf(scoreUpdate));
            stmt.setString(2, this.username);
            stmt.setString(3, String.valueOf(this.userScore.getScore()));
            stmt.executeUpdate();
            
            this.setSkor(scoreUpdate);
        } catch (SQLException e) {
            System.out.println("ups");
            System.out.println(e.getMessage());
        }
    }
    
    public int getAttempt(){
        return this.userScore.getAttempt();
    }
    
    public void setAttempt(int attempt) {
        this.userScore.setAttempt(attempt);
    }
    
    public void minusOnePoint(){
        this.userScore.minusOnePoint();
    }
}
