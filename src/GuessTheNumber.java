import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessTheNumber {
    Printer printer;
    int LIMIT_NUMBER;
    int PLAYS_LIMIT;

    GuessTheNumber(Printer printer){
        this.printer = printer;
        LIMIT_NUMBER = 100;
        PLAYS_LIMIT = 3;
    }
    //Receive the number entered by the user
    private int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        boolean state = true;
        while(state){
            try {
                printer.askForGuess();
                state=false;
                return scanner.nextInt();
            }
            catch (InputMismatchException ex) {
                printer.ErrorMessage();
                scanner.next();
            }
        }
        return 0;
    }
    //Generate a random number
    private int generateRandomNumber(){
        return (int) ((Math.random() * LIMIT_NUMBER) + 1);
    }

    /*Checks if the number entered by the user is less than, greater than or equal
     to the randomly generated number and returns a boolean value
     */
    protected boolean compareNumbers(int userNumber, int hidden_number){
        if (userNumber == hidden_number){
            printer.showEquals();
            return false;
        }
        if (userNumber > hidden_number){
            printer.showLessThan();
        }else{
            printer.showMoreThan();
        }
        return true;
    }

    protected void runGame(){
        int plays = 0;
        while(plays != PLAYS_LIMIT){
            printer.showTitle(LIMIT_NUMBER);
            int hiddenNumber = generateRandomNumber();
            int userNumber = inputNumber();
            int tries = 1;
            while(compareNumbers(userNumber, hiddenNumber)){
                userNumber = inputNumber();
                tries ++;
            }
            printer.showAttemptsNumber(tries);
            plays++;
        }
    }
}
