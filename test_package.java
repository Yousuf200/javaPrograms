package tryPackage;

public class test_package {

    public static void add(int a, int b) {
        int c = a + b;
        System.out.printf("Sum is %d\n", c);
    }

    public static void main(String[] args) {
        System.out.println("This is main of package");
        add(12,13);
    }

}
