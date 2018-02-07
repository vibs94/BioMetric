/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biometric;

import java.util.ArrayList;

/**
 *
 * @author vibodha
 */
public class BiometricModel {
    
    private FileHandler fileHandler = new FileHandler();
    private float threshould = 0.05f;
    
    public boolean saveUser(User u){
        return fileHandler.saveUser(u); 
    }
    
    public User getBestConfidanceUser(User main){
        float best = Float.POSITIVE_INFINITY;
        User bestUser=null;
        ArrayList<User> users = fileHandler.getAllUsers();
        for(int i=0;i<users.size();i++){
            if(getConfidance(main, users.get(i))<best && getConfidance(main, users.get(i))<threshould){
                best=getConfidance(main, users.get(i));
                bestUser = users.get(i);
            }
        }
        return bestUser;
    }
    
    public float getConfidance(User main, User sub){
        float ave_sum =0;
        for(int i=0;i<5;i++){
            Finger givenF = main.getFingerByIndex(i);
            //System.out.println(i+" "+givenF.getF_div_length());
            Finger claimF = sub.getFingerByIndex(i);
            //System.out.println(i+" "+claimF.getF_div_length());
            ave_sum = ave_sum + Math.abs(givenF.getF_length()-claimF.getF_length())+Math.abs(givenF.getF_width()-claimF.getF_width())+Math.abs(givenF.getF_div_length()-claimF.getF_div_length());
        }
        return ave_sum/15;
    }
    
    
    
}
