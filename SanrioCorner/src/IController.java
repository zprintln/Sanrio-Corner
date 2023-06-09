/**
 * This is the interface for the Controller.
 * It contains all required methods for the Controller class.
 */
public interface IController {
  /**
   * This method starts the program!
   */
  void go();
  /**
   * This method verifies user input is an integer
   * @return true if input is an integer, false if not
   */
  <T> boolean validateInputIsInteger(T var);

  /**
   * This method determines if a given input is within range
   * @param input the integer input
   * @param minRange the floor of the range
   * @param maxRange the ceiling of the range
   * @return true if input is within range, or false if not
   */
  boolean verifyInputRange(int input, int minRange, int maxRange);
  /**
   * This method prompts user for input
   * while input is not valid, user is re-prompted
   * @return validated user input
   */
  int getUserInput();

  /**
   * This method calls view to print the input error message and re-prompts the user for input
   * @return validated userInput
   */
  int reEnterInput();

  /**
   * This method begins the Sanrio quiz
   * Prompts the user for input by calling view
   * Verify user input
   * Sends answer to model to store
   * Calls view again to display final character
   */
   void sanrioQuiz();
  /**
   * This method gets the most frequent score from the model and sends it to the view to call the
   * print character method
   */
  void findCharacter();

  /**
   * This method gets the most frequent score from the model and sends it to the view to
   * call the print character method
   */
  void getCharacterInfo();

}
