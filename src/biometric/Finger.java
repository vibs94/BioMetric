/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biometric;

import java.io.Serializable;

/**
 *
 * @author vibodha
 */
public class Finger implements Serializable{
    
    private float f_length;
    private float f_width;
    private float f_div_length;

    public Finger(float f_length, float f_width, float f_div_length) {
        this.f_length = f_length;
        this.f_width = f_width;
        this.f_div_length = f_div_length;
    }

    public float getF_length() {
        return f_length;
    }

    public float getF_width() {
        return f_width;
    }

    public float getF_div_length() {
        return f_div_length;
    }
    
    
    
}
