/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ktnya;

/**
 *
 * @author kdkfr
 */
public class Score {
    private int attempt = 6;
    
    public int getAttempt(){
        return attempt;
    }
    public void minusOnePoint(){
            if(this.attempt > 0){
                this.attempt --;
                return;
            } 
            
        
    }
    

}
