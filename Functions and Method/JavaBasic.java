import java.util.Scanner;

public class JavaBasic {

    // public static void PrintHelloWorld(){
    //     System.err.println("Hello World");
    //     return;
    // }
    public static int calculateNumbers(int a,int b){
       
        int sum = a+b;
       
        return sum;
    }

    public static void main(String[] args) {
        // PrintHelloWorld();
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your frist Number");
        int a = sc.nextInt();
        System.out.println("Enter Your Second NUmber");
        int b = sc.nextInt();
       int sum = calculateNumbers(a,b);
       System.out.println("the sum is :"+sum);
    }
}
