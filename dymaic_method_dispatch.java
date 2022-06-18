class phone
{
    public void showTime()
    {
        System.out.println("The time is 11");
    }

    public void greet()
    {
        System.out.println("Welcome handshake");
    }
}

class smartPhone extends phone
{
    public void music()
    {
        System.out.println("Playing music");
    }
    public void greet()
    {
        System.out.println("Welcome android");
    }
}

public class dymaic_method_dispatch
{
    public static void main(String[] args) {
        phone v = new smartPhone();

        // only obj in super or parent class can be called
        
        v.greet();
        v.showTime();
    }
}