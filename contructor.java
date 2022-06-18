class employee
{
    private int id;
    private String name;

    public employee(String myname, int myid)
    // a member function 
    {
        id = myid;
        name = myname;
    }

    public employee()
    // a member function 
    {
        id = 31;
        name = "My-Name";
    }

    public void setname(String n)
    {
        name = n;
    }

    public String getname()
    {
        return name;
    }

    public void setid(int n)
    {
        id = n;
    }

    public int getid()
    {
        return id;
    }
}

public class contructor {
    public static void main(String[] args) {
        
        employee nazeer = new employee("Nazeer",3173);

        nazeer.setname("Nazeeruddin");

        System.out.println(nazeer.getid());
        System.out.println(nazeer.getname());
        
    }
    
}
