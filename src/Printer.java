public class Printer {
    private final int CHARACTERS_HEIGHT; //To have a uniform size in the console.

    Printer(){
        CHARACTERS_HEIGHT = 50;
    }

    protected void showAttemptsNumber(int count){
        System.out.println("You tried " + count + " times.");
    }

    // This method shows the title at the start of the game.
    protected void showTitle(int numberLimit){
        System.out.println("*".repeat(CHARACTERS_HEIGHT));
        System.out.println("******** Guess the number between 1 - "+ numberLimit +" ********");
        System.out.println("*".repeat(CHARACTERS_HEIGHT));
    }

    // This method asks the user for a number.
    protected void askForGuess(){
        System.out.println("\n" + "*".repeat(CHARACTERS_HEIGHT));
        System.out.print("Enter a number: ");
    }
    // This method shows a message in case the user does not enter a number.
    protected void ErrorMessage(){
        System.out.println("You must enter an integer");
    }

    // this method displays a message that the number is greater
    protected final void showMoreThan() {
        System.out.println("Your number is more than the mysterious number");
    }
    //this method displays a message that the number is less
    protected final void showLessThan() {
        System.out.println("Your number is less than the mysterious number");
    }
    //this method displays a message that the user won
    protected final void showEquals(){
        System.out.println("Congratulations, you guessed the number");
    }
}