public class Calculator {
    static int powerInt(int num1, int num2){
        return (int)Math.pow(num1, num2);
    }
    static double powerDouble(double num1,int num2){
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        System.out.println("2 power 6 is "+powerInt(2,6));
        System.out.println("3 Power 5 is "+powerDouble(3,5));
    }
    
}
