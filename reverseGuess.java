
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;






public class reverseGuess {
    
    public static void playGuessingGame(){
    /*
    Eray Alparslan
    http://erayalparslan.blogspot.com
    */
  
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();
    int maxLimit = 10;
    int minLimit = 1;
    int number;
    int count=1;
    int flag=0;
    int tmp;
    String input;
    String highlow;
    System.out.println("Let's play a game... I will try to guess your number.");
    
    number = (int) rnd.nextInt(10)+1;
    tmp = number;
    do {  //    as long as the answers is not 'y', the main loop will contiue.
        
        //  take input from the user and if the answer is not 'y' or 'n' continue asking.
        do{
            System.out.print("Is it " + number + "? (y/n): "); 
            input = sc.next(); 
            
            if(!input.equalsIgnoreCase("n") && !input.equalsIgnoreCase("y"))
                System.out.println("\nPlase make a correct choice.");
            
        }while(!input.equalsIgnoreCase("y") && !input.equalsIgnoreCase("n"));
        
        //  if the answer is yes, no need to continue, just exit from the main loop
        if(input.equalsIgnoreCase("y"))
                break;
        
        //  if the answer is no, ask whether it is higher or lower
        else{
                do{
                    System.out.print("Is it higher or lower? (h/l): ");
                    highlow = sc.next();

                    if(highlow.equalsIgnoreCase("h")){ //if the guess is higher than the user input
                            number = number+(rnd.nextInt(10-number)+1);
                    }
                    else if (highlow.equalsIgnoreCase("l")){
                            number = number-2;
                    }
                    else
                        System.out.println("\nPlease make a correct choice.");
                }while(!highlow.equals("h") && !highlow.equalsIgnoreCase("l"));
            //  count how many times the computer will try for the answer.    
            count++;
        }
    } while (!input.equalsIgnoreCase("y"));
    
    //  the output
    System.out.println("I got your number of " + number + " in " + count + " guesses.");
}    

    
    public static void main(String[] args) {
        playGuessingGame();
    }

}

