public class Printer {


    // This method shows the title at the start of the game.
    private void showTitle(){
        int CHARACTERS_HEIGHT = 50; //To have a uniform size in the console.
        System.out.println("*".repeat(CHARACTERS_HEIGHT));
        System.out.println("******** Guess the number between 1 - 100 ********");
        System.out.println("*".repeat(CHARACTERS_HEIGHT));
    }

    // This method asks the user to show a title.
    private void askForGuess(){
        int CHARACTERS_HEIGHT = 50;
        System.out.println("*".repeat(CHARACTERS_HEIGHT));
        System.out.print("Enter a Number: "); // The input will be: Enter a number: 8
    }
}
