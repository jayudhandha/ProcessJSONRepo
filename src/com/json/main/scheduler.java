package com.json.main;

import java.util.Date;
import java.util.Timer;

/**
 *
 * @author jayesh
 */
public class scheduler {

    public static void main(String[] args) {
        
        try {
            Timer t1 = new Timer();
            t1.scheduleAtFixedRate(new ProcessJSON(),new Date(),5000L);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Exception in parsing json : " + e.getMessage());
        }

    }

}
