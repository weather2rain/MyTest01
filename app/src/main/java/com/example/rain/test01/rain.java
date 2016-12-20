package com.example.rain.test01;

/**
 * Created by rain on 2016/12/19.
 */

public class rain {
    private rain(){
            
        }
        private static rain xdd = new rain();
        
        public static rain getInstance(){
            return xdd;
        }
}
