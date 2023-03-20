package org.example;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {

    // Logger
    private static Logger logger = LogManager.getLogger(Calculator.class);

    // Add function
    public double add(double x, double y){
        double res = x + y;
        return res;
    }

    // Square root function
    public double squareRoot(double x){
        logger.info("[INPUT SQROOT] - " + x);

        if(x < 0)  {
            logger.info("[OUTPUT SQROOT] ERROR");
            return Double.NaN;
        }
            

        double res = Math.sqrt(x);
        logger.info("[OUTPUT SQROOT] " + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Java!");
    }
}