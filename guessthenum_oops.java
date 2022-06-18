import java.util.Random;
import java.util.Scanner;
// import java.util.random.*;

class game {
    int randomint;
    int noofgusses = 0;
    int usrnum;

    
    public void setNoofgusses(int noofgusses) {
        this.noofgusses = noofgusses;
    }

    public int getNoofgusses() {
        return noofgusses;
    }

    game() {
        Random rand = new Random();
        this.randomint = rand.nextInt(100);
    }
    
    void takeinput() {
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        usrnum = sc.nextInt();
    }
    
    boolean isGuess() {
        noofgusses++;
        if (usrnum == randomint) 
        {
            System.out.printf("You guessed it right.The number was %d and Number of attempts is %d.\n", randomint,noofgusses);
            return true;
        } 
        else if (usrnum > randomint) 
        {
            System.out.println("Too high guess...");
        } 
        else if (usrnum < randomint) 
        {
            System.out.println("Too low guess");
        }
        return false;
    }
    // sc.close();
}

public class guessthenum_oops {
    public static void main(String[] args) {
        game g = new game();

        boolean b = false;

        while (!b) 
        {
            g.takeinput();
            b = g.isGuess();    
        }

    }
}
