import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        int n;
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter the number of subjects: ");
        n=s.nextInt();
        
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the marks of student in subject "+(i+1));
            a[i] = s.nextInt(); 
        }

        

        float sum = 0f;

        for (int j = 0; j < n; j++) {
            sum = sum + a[j];
        }

        // System.out.println("The sum is "+sum);

        System.out.println("The percentage of student is "+(sum/n));

        s.close();

    }
}
