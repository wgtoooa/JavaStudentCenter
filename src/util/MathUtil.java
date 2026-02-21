package util;

public class MathUtil {
    private static int callCount;

    public static int sum(int a,int b){
        callCount++;
        return a+b;
    }
    public static double sum(double a, double b){
        callCount++;
        return a+b;
    }
    public static int sum(int[] array){
        callCount++;
        if (array == null) {
            throw new IllegalArgumentException("Array is null");
        }
        int result=0;
        for(int s: array){
            result+=s;
        }
        return result;
    }
    public static int getCallCount(){return callCount;}

    public static int factorial(int n) {
        callCount++;
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
