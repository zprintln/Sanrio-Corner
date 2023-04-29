import java.io.PrintStream;

/**
 * This Mock View is used for testing of the Controller class
 * It implements all methods of the IView interface
 */
public class MockView implements IView {

  private PrintStream out;

  /**
   * Constructor for mock view
   */
  public MockView(PrintStream out) {
    this.out = out;
  }
  /**
   * This method shows the initial menu for the game
   */
  public void showMenu(){
    out.print("Menu test");
  }
  /**
  /**
   * This method displays a Sanrio character
   */
  @Override
  public void displayCharacter(String sanrio){
    out.print("Display test sanrio: " + sanrio);
  }
  /**
   * This method prompts the user to choose which Sanrio character to learn about
   */
  @Override
  public void characterInfoPrompt(){
    out.print("Character info prompt");
  }
  /**
   * This method prints an error message to indicate invalid user input
   */
  @Override
  public void inputErrorMsg(){
    out.print("Error msg test");
  }

  /**
   * This method prints a Sanrio character info based on user choice
   * @param choice the user choice of character
   */
  @Override
  public void printCharacterInfo(char choice){
    switch(choice){
      case 'h':
        out.print(
            "Hello kitty");
        break;
      case 'c':
        out.print(
            "Cinnamoroll");
        break;
      case 'm':
        out.print(
            "My melody");
        break;
      case 'k':
        out.print(
            "Kuromi");
        break;
      case 'p':
        out.print(
            "Pompompurin");
        break;
      case 'b':
        out.print(
            "Badtz-Maru");
        break;
      case 'l':
        out.print(
            "Lala");
        break;
      case 'g':
        out.print(
            "Gudetama");
        break;
      default:
        out.print("Type a valid letter to learn about a character");
        break;
    }
  }

  /**
   * This method prompts a user for a number to print a positive message
   */
  @Override
  public void happyMsgPrompt(){
    out.print("Happy message prompt");
  }
  /**
   * This method prints a positive message
   */
  @Override
  public void printHappyMsg(String msg){
    out.print(msg);
  }

  /**
   * This method prints a quiz prompt for fav food
   */
  @Override
  public void printFoodMsg(){
    out.print("Food prompt ");
  }

  /**
   * This method prints a quiz prompt for fav color
   */
  @Override
  public void printColorMsg(){
    out.print("Color prompt ");
  }

  /**
   * This method prints a quiz prompt for fav activity
   */
  @Override
  public void printActivityMsg(){
    out.print("Activity prompt ");
  }

  /**
   * This method prints a quiz prompt for fav item
   */
  @Override
  public void printItemMsg(){
    out.print("Item prompt ");
  }
  /**
   * This method prints a quiz prompt for fav sport
   */
  @Override
  public void printSportMsg(){
    out.print("Sport prompt ");
  }
  /**
   * This method prints a goodbye message to the user
   */
  @Override
  public void printGoodbye(){
    out.print("Have a nice day!");
  }

  /**
   * This method prints the mock quiz prompts
   * @param i index of the questions
   */
  @Override
  public void printQuizPrompts(int i){
    switch(i){
      case 1:
        this.printFoodMsg();
        break;
      case 2:
        this.printColorMsg();
        break;
      case 3:
        this.printActivityMsg();
        break;
      case 4:
        this.printItemMsg();
        break;
      case 5:
        this.printSportMsg();
        break;
    }

  }

}
