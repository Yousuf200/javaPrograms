public class vargs {

    static int sum(int ...arr)
    {
        int result = 0;
        for (int i : arr) {
            result += i;
        }
        return result;
        
    }
    public static void main(String[] args) {
        System.out.println("The sum of 4,5,8,9 is : "+ sum(4,5,8,9));
        System.out.println("The sum of nothing is: "+ sum());
    }
    
}