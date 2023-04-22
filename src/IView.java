public interface IView {
/**
 * This method shows the initial menu for the game
 */
void showMenu();
/**
 * This method displays a Sanrio character
 */
void displayCharacter(String sanrio);
/**
 * This method prints a Sanrio character info based on user choice
 * @param choice
 */
void printCharacterInfo(char choice);
/**
 * This method prints a positive message
 */
void printHappyMsg(String msg);
/**
 * This method prints a quiz prompt for fav food
 */
void printFoodMsg();
/**
 * This method prints a quiz prompt for fav color
 */
void printColorMsg();
/**
 * This method prints a quiz prompt for fav activity
 */
void printActivityMsg();
/**
 * This method prints a quiz prompt for fav item
 */
void printItemMsg();

/**
 * This method prompts a user for a number to print a positive message
 */
void happyMsgPrompt();

/**
 * This method prints a quiz prompt for fav sport
 */
void printSportMsg();

/**
 * This method prompts a user to enter the character they want to learn more about
 */
void characterInfoPrompt();

/**
 * This method prints an error message if the input is incorrect
 */
void inputErrorMsg();
/**
 * This method prints a goodbye message to the user
 */
void printGoodbye();
}
