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
        logger.info("[INPUT SQROOT] " + x);

        if(x < 0 || Double.isNaN(x))  {
            logger.info("[OUTPUT SQROOT] ERROR");
            return Double.NaN;
        }
            

        double res = Math.sqrt(x);
        logger.info("[OUTPUT SQROOT] " + res);
        return res;
    }

    // Natural log function
    public double naturalLog(double x){
        logger.info("[INPUT NLOG] " + x);

        if(x < 0 || Double.isNaN(x)){
            logger.info("[OUTPUT NLOG] ERROR");
            return Double.NaN;
        }

        double res = Math.log(x);
        logger.info("[OUTPUT NLOG] " + res);
        return res;
    }

    // Power function
    public double power(double x, double n){
        logger.info("[INPUT POWER] " + x + " " + n);

        if(Double.isNaN(x) || Double.isNaN(n)){
            logger.info("[OUTPUT POWER] ERROR");
            return Double.NaN;
        }

        double res = Math.pow(x, n);
        logger.info("[OUTPUT POWER]" + res);
        return res;
    }

    // Factorial function
    public double factorial(double x){
        logger.info("[INPUT FACT] " + x);

        if(x < 0 || Double.isNaN(x)){
            logger.info("[OUTPUT FACT] ERROR");
            return Double.NaN;
        }

        x = Math.floor(x);
        double res = 1;
        for(double i = 1; i <= x; i+=1.0){
            res = res*i;
        }
        logger.info("[OUTPUT FACT] " + res);
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Hello from Java!");
    }
}