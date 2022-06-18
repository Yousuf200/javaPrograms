class Base
{
    int x;

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
}

class Derived extends Base
{
    int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class Inheritance {    
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(10);
        System.out.println(d.getX());
    }
}
