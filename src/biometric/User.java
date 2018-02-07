/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biometric;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author vibodha
 */
public class User implements Serializable{
    
    private String name;
    private ArrayList<Finger> fingers = new ArrayList<Finger>();

    public User(String name,ArrayList<Finger> fingers) {
        this.name = name;
        this.fingers = fingers;
    }
    
    public String getName(){
        return this.name;
         }
    
    public Finger getFingerByIndex(int i){
        return this.fingers.get(i);
    }
}
