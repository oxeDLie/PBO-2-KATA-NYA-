/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectpbo;

/**
 *
 * @author kdkfr
 */
public class Score {
    private int overallScore = 0;
    private int attempt;
    
    public Score(int overallskor){
        if(overallskor != 0){
            overallScore = overallskor;
        }
        this.setAttempt(6);
    }
    
    public int getScore(){
        return this.overallScore;
    }
    
    public int getAttempt(){
        return attempt;
    }
    public void setAttempt(int attempt){
        this.attempt = attempt;
    }
    public void minusOnePoint(){
        if(this.attempt > 0){
            this.attempt --;
            return;
        }   
    }
    

}
