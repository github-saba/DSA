public class Factorial {
    public static int fact(int num){
        int facto = 1;
        if (num == 0) 
            return facto;
        facto = num*fact(num-1);
        return facto;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of "+ num + " is " + fact(num));
    }
    
}
