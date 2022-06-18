class Base
{
    private int x;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void printthis()
    {
        System.out.println("This is a base constructor class");
    } 
    
    Base()
    {
        System.out.println("This is constructor of base class");    
    }

    Base(int a)
    {
        System.out.println("This is an overloaded constructor of base class with value: "+a);    
    }
}

class Derived extends Base
{
    private int y;

    
    Derived()
    {
        super(12);
        System.out.println("This is a derived class constructor");
    }

    Derived(int a)
    {
        super(12);
        System.out.println("This is a derived class constructor and value of a is: "+a);
    }

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }

}

public class constructor_inheritance {    
    public static void main(String[] args) {
        Derived d = new Derived(11);
        d.setX(10);
        System.out.println(d.getX());
    }
}
