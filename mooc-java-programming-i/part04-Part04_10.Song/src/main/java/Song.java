/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jae
 */
public class Song {
    
    private String title;
    private int inSeconds;
    
    public Song (String name, int length) {
        
        this.title = name;
        this.inSeconds = length;
        
    }
    
    public String name() {
        
        return this.title;
            
    }
    
    public int length() {
        
        return this.inSeconds;
        
    }
    
}
