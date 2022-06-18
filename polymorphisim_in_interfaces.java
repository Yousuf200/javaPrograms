interface camera
{
    void capture();
    void record();
}


interface wifi
{
    void listNetwork();
    void connectNetwork();
}

class cellPhone
{
    void call()
    {
        System.out.println("Calling");
    }
}

class smartPhone extends cellPhone implements camera, wifi
{
    public void capture()
    {
        System.out.println("Capturing....");
    }
    public void record()
    {
        System.out.println("Recording...");
    }
    public void listNetwork()
    {
        System.out.println("List of networks");
    }
    
    public void connectNetwork()
    {
        System.out.println("Connecting to wifi");
    }
}



public class polymorphisim_in_interfaces {
    public static void main(String[] args) {
        // smartPhone mySp = new smartPhone();
        // mySp.call();
         camera mysp = new smartPhone();

        //  mysp.call(); --error 

    }
}
