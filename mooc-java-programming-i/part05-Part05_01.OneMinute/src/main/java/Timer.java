/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jae
 */
public class Timer {
    
   private ClockHand seconds;
   private ClockHand hundredsOfSeconds;
     
   public Timer() {
       
        this.seconds = new ClockHand(60);
        this.hundredsOfSeconds = new ClockHand(100);
       
   }
   
   public void advance() {
       this.hundredsOfSeconds.advance();
       
       if (this.hundredsOfSeconds.value() == 0) {
           this.seconds.advance();
          
       }
   }
   
   public String toString() {
       return seconds + ":" + hundredsOfSeconds;
   }
   
    
}
