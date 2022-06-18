import java.util.Scanner;

public class recuFact {

    static long  fact(long n)
    {
        if (n==1 || n==0) {
            return 1;
            
        } else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");;
        long a = sc.nextInt();
        long b = fact(a);
        System.out.printf("Factorial of %d is %d",a,b);
        sc.close();
    }
    
}
