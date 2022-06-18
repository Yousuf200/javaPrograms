interface Bicycle
{
    int a = 3173;
    void brakes();
    void race();
}

interface parentSam
{
    void meth1();
    void meth2();
}

interface childSam extends parentSam
{
    void meth3();
    void meth4();
}

class mycycles implements Bicycle, childSam
{
    @Override
    public void brakes()
    {
        System.out.println("Applying brakes");
    }

    @Override
    public void race() 
    {
        System.out.println("Incresing Speed");
    }

    void blowHorn()
    {
        System.out.println("Pe pee Po Poo");
    }

    public void meth1()
    {
        System.out.println("Thsi is test for inheritance in interfaces");
    }
    public void meth2()
    {
        System.out.println("Thsi is test for inheritance in interfaces");
    }
    public void meth3()
    {
        System.out.println("Thsi is test for inheritance in interfaces");
    }
    public void meth4()
    {
        System.out.println("Thsi is test for inheritance in interfaces");
    }


    // int a = 12; 
}

public class interfaces {
    public static void main(String[] args) 
    {
        mycycles c = new mycycles();
        c.brakes(); 
        // c.a = 12;
        System.out.println(c.a);

    }
    
}
