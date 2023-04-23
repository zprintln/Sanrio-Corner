public interface IController {
  /**
   * This method starts the program!
   */
  void go();
  /**
   * This method verifies user input is an integer
   * @return
   */
  int validateInputIsInteger();

  /**
   * This method determines if a given input is within range
   * @param input the integer input
   * @param minRange the floor of the range
   * @param maxRange the ceiling of the range
   * @return true if input is within range, or false if not
   */
  public boolean verifyInputRange(int input, int minRange, int maxRange);
  /**
   * This method calls the fav food prompt method in view and stores the user input in the model
   */
  void findFavFood();
  /**
   * This method calls the fav color prompt method in view and stores the user input in the model
   */
  void findFavColor();
  /**
   * This method calls the fav activity prompt method in view and stores the user input in the model
   */
  void findFavActivity();
  /**
   * This method calls the fav item prompt method in view and stores the user input in the model
   */
  void findFavItem();
  void findCharacter();
  /**
   * This method calls the fav sport prompt method in view and stores the user input in the model
   */
  void findFavSport();

  /**
   * This method gets the most frequent score from the model and sends it to the view to
   * call the print character method
   */
  void getCharacterInfo();

}
