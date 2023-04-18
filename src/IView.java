public interface IView {
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
void printHappyMsg();
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

}
