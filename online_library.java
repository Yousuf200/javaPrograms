import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Library
{
    String books [] = {"java headfirst", "data strucutres", "harry potter","te"};

    String usrbook;



    public void issueBook()
    {
        System.out.println("Enter the name of the book you want: ");
        Scanner sc = new Scanner(System.in);
        usrbook = sc.nextLine();

        for (int i = 0; i < books.length; i++) 
        {
            if(usrbook == books[i])
            {
                System.out.format("%s book is present in library. You can take the book. \n",books[i]);
                List<String> list = new ArrayList<String>(Arrays.asList(books));
                list.remove(usrbook);
                books = list.toArray(new String[0]);
            }    
            else
            {
                System.out.format("%s book is not present in library. \n",books[i]);
            }
        }
        showBooks();
    }
    public void returnBook()
    {
        System.out.println("Enter the name of the book you want to return: ");
        Scanner sc = new Scanner(System.in);
        usrbook = sc.nextLine();
        System.out.format("%s book is returned",usrbook);
        showBooks();
    }
    public void showBooks()
    {
        System.out.println("The books available in library are:");
        for (String book : books) 
        {
            System.out.println(book);
        }
    }
}

public class online_library {
    public static void main(String[] args)
    {
        Library l = new Library();

        l.showBooks();
        l.issueBook();

    }
    
}
