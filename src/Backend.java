import java.util.InputMismatchException;
import java.util.Scanner;

public class Backend {
    public void inputNumber(){
        Scanner scanner = new Scanner(System.in);
        boolean execute;
        do {
            try {
                execute = false;
                //message "Enter a Number"
                int number=  scanner.nextInt();
            }
            catch (InputMismatchException ex) {
                //message "You must enter an integer"
                scanner.next();
                execute = true;
            }
        } while (execute);

    }
}
