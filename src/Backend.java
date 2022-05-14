import java.util.InputMismatchException;
import java.util.Scanner;

public class Backend {
    protected int inputNumber(){
        Scanner scanner = new Scanner(System.in);
        int number;
        while(true)
        {

            try {
                //message "Enter a Number"
                number=  scanner.nextInt();
                return number;
            }
            catch (InputMismatchException ex) {
                //message "You must enter an integer"
            }
        }
    }

}
