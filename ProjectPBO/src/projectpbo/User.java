/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpbo;

/**
 *
 * @author kdkfr
 */
public class User {
    private String username;
    private Score userScore;
    
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
    
    public int getAttempt(){
        return this.userScore.getAttempt();
    }
    public void minusOnePoint(){
        this.userScore.minusOnePoint();
    }
}
