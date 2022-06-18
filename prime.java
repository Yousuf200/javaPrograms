import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        int n,i,pr;
        pr=0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            n = sc.nextInt();
            for (i = 2; i < n; i++) 
            {
                if (n%i==0) {
                    pr =1;
                }    
            }
            if (pr==1) {
                System.out.println(n+" is not prime");
            } else {
                System.out.println(n+" is prime");  
            }

            sc.close();
        }

    }
}