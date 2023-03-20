package org.example;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Calculator {

    // Logger
    private static Logger logger = LogManager.getLogger(Calculator.class);

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
        // Main menu
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Welcome to DevOps Calculator");
        System.out.println("Enter the code for the required operation");
        System.out.println("1. Square root function : √x");
        System.out.println("2. Natural logarithm : ln(x)");
        System.out.println("3. Power function : x^n");
        System.out.println("4. Factorial function : x!");
        System.out.println("5. Exit");

        // User input stage
        boolean done = false;
        while(!done){
            int code = sc.nextInt();

            // Default case
            if(code >= 5 || code <= 0){
                done = true;
                return;
            }

            // Square root
            else if(code == 1){
                double x = sc.nextDouble();
                double res = calc.squareRoot(x);
                if(Double.isNaN(res))   System.out.println("Invalid input for the square root function.");
                else    System.out.println("Result of the square root calculation: " + res);
            }

            // Natural log
            else if(code == 2){
                double x = sc.nextDouble();
                double res = calc.naturalLog(x);
                if(Double.isNaN(res))   System.out.println("Invalid input for the natural log function.");
                else    System.out.println("Result of the natural log calculation: " + res);
            }

            // Power
            else if(code == 3){
                double x = sc.nextDouble();
                double n = sc.nextDouble();
                double res = calc.power(x,n);
                if(Double.isNaN(res))   System.out.println("Invalid inputs for the power function.");
                else    System.out.println("Result of the power calculation: " + res);
            }

            // Factorial
            else if(code == 4){
                double x = sc.nextDouble();
                double res = calc.factorial(x);
                if(Double.isNaN(res))   System.out.println("Invalid input for the factorial function.");
                else    System.out.println("Result of the factorial calculation: " + res);
            }
        }
    }
}