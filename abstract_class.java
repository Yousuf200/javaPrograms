abstract class Base
{
    public void greet()
    {
        System.out.println("Yello from base");
    }

    abstract void hi();
}

class Derived extends Base
{
    public void greet()
    {
        System.out.println("Yelooo from derived");
    }

    @Override
    void hi() {
        // TODO Auto-generated method stub
        
    }
}

public class abstract_class
{
    public static void main(String[] args) 
    {
        Derived d = new Derived();
        // d.hi();
        d.greet();
        
    }
}