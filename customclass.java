class Employee
{
    int id;
    String name;
    public void printdata() {
        System.out.println("this is id: "+id);
        System.out.println("This is name:"+name);
        
    }
}

class square
{
    int side;

    public int area()
    {
        return side*side;
    }

    public int perimeter()
    {
        return 4*side;
    }

    public void printval() {
        System.out.println("area of square is: "+area());
        System.out.println("Perimeter of square is: "+perimeter());
    }
}

public class customclass {
    public static void main(String[] args) {
        System.out.println("This is custom class");

        // Employee nazeer = new Employee();
        // nazeer.id = 31;
        // nazeer.name = "Nazeer";

        // System.out.println(nazeer.id);
        // System.out.println(nazeer.name);

        // nazeer.printdata(); 

        square sq = new square();

        sq.side = 12;

        int a = sq.area();
        int b = sq.perimeter();

        System.out.printf("The area of squuare is %d, perimeter is %d.\n",a,b);

        sq.printval();

    }
    
}
