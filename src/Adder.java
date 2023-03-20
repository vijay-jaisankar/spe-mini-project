package src;

public class Adder {
    public static double add(double x, double y){
        double res = x + y;
        return res;
    }

    public static void main(String[] args) {
        double x = Adder.add(2.3, -2.3);
        System.out.println(x);
    }
}
