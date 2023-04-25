import java.io.InputStream;
import java.io.PrintStream;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.io.InputStream;
public class Controller implements IController {

  private IModel model;
  private IView view;
  private Scanner scanner;
  private InputStream in;
  private PrintStream out;
  private final String charChoices = "hckgmblp";
  private String sanrio;
  private int userInput;
  private int userNum;
  private boolean isValid = false;
  private boolean inRange = false;
  private boolean quit = false;
  private String happyMsg;
  private String strInput;


  /**
   * This is the constructor for a Controller
   *
   * @param model
   * @param view
   * @param in
   * @param out
   */
  public Controller(IModel model, IView view, InputStream in, PrintStream out) {
    this.model = model;
    this.view = view;
    this.in = in;
    this.out = out;
    this.scanner = new Scanner(in);
  }

  /**
   * This method starts the program!
   */
  @Override
  public void go() {
    while (!quit) {
      //call view to show user menu
      view.showMenu();
      //take in user input
      userNum = getUserInput();
      while(verifyInputRange(userNum, 1,4) == false){
        userNum = reEnterInput();
      }
      //switch to determine action taken
      switch (userNum) {
        case 1:
          this.findFavFood();
          this.findFavColor();
          this.findFavActivity();
          this.findFavItem();
          this.findFavSport();
          this.findCharacter();
          break;
        case 2:
          view.happyMsgPrompt();
          userInput = getUserInput();
          while (verifyInputRange(userInput,1,10) == false) {
            userInput = reEnterInput();
          }
          happyMsg = model.MsgGenerator(userInput);
          view.printHappyMsg(happyMsg);
          break;
        case 3:
          view.characterInfoPrompt();
          this.getCharacterInfo();
          break;
        case 4:
          quit = true;
          view.printGoodbye();
          break;
        default:
          userNum = reEnterInput();
          break;
      }//end switch
    }//end while
  }//end go method


  /**
   * This method calls the fav food prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavFood() {
    //print user prompt
    view.printFoodMsg();
    //store user input
    userInput = getUserInput();
    while(verifyInputRange(userInput, 1,4) == false){
      userInput = reEnterInput();
    }
    //send to model
    model.setAnswers(userInput);
  }

  /**
   * This method calls the fav color prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavColor() {
    //print user prompt
    view.printColorMsg();
    //store user input
    userInput = getUserInput();
    while(verifyInputRange(userInput, 1,4) == false){
      userInput = reEnterInput();
    }
    //send to model
    model.setAnswers(userInput);
  }

  /**
   * This method calls the fav activity prompt method in view and stores the user input in the
   * model
   */
  @Override
  public void findFavActivity() {
    //print user prompt
    view.printActivityMsg();
    //store user input
    userInput = getUserInput();
    while(verifyInputRange(userInput, 1,4) == false){
      userInput = reEnterInput();
    }
    //send to model
    model.setAnswers(userInput);
  }

  /**
   * This method calls the fav item prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavItem() {
    //print user prompt
    view.printItemMsg();
    //store user input
    userInput = getUserInput();
    while(verifyInputRange(userInput, 1,4) == false){
      userInput = reEnterInput();
    }
    //send to model
    model.setAnswers(userInput);
  }

  /**
   * This method calls the fav sport prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavSport() {
    //print user prompt
    view.printSportMsg();
    //store user input
    userInput = getUserInput();
    while(verifyInputRange(userInput, 1,4) == false){
      userInput = reEnterInput();
    }
    //send to model
    model.setAnswers(userInput);
  }

  /**
   * This method gets the most frequent score from the model and sends it to the view to call the
   * print character method
   */
  @Override
  public void findCharacter() {
    //find character match
    sanrio = model.getSanrioCharacter();
    //send to view to print character
    view.displayCharacter(sanrio);
  }

  /**
   * This method gets the user choice input and calls the print character info in view
   */
  @Override
  public void getCharacterInfo() {
    //prompt user
    view.characterInfoPrompt();
    //store input in lower case
    strInput = scanner.nextLine().toLowerCase();
    //parse to char
    char userChoice = strInput.charAt(0);
    //verify that input is correct
    if (charChoices.indexOf(userChoice) != -1) {
      //send to view
      view.printCharacterInfo(userChoice);
    } else {
      //print error message
      view.inputErrorMsg();
      //call function again
      getCharacterInfo();
    }

  }

  /**
   * This method verifies user input is an integer
   * @return true if input is valid integer type, false if another data type
   */
  @Override
  public <T> boolean validateInputIsInteger(T userVar) {
    if (userVar instanceof Integer) {
      int myInt = (Integer) userVar;
      return true;
    } else {
      // userVar is not an instance of Integer
      return false;
    }
  }
  /**
   * This method determines if a given input is within range
   *
   * @param input the integer input
   * @param minRange the floor of the range
   * @param maxRange the ceiling of the range
   * @return true if input is within range, or false if not
   */
  @Override
  public boolean verifyInputRange(int input, int minRange, int maxRange) {
      if (input >= minRange && input <= maxRange) {
        return true;
      }
      return false;
  }
  /**
   * This method prompts user for input
   * while input is not valid, user is re-prompted
   * @return validated user input
   */
  @Override
  public int getUserInput(){
    userInput = Integer.parseInt(scanner.nextLine());
    //validate input is an integer
    isValid = validateInputIsInteger(userInput);
    while(!isValid){
      view.inputErrorMsg();
      getUserInput();
    }
    return userInput;
  }

  /**
   * This method prints the input error message and re-prompts the user for input
   * @return
   */
  public int reEnterInput(){
    view.inputErrorMsg();
    userInput = getUserInput();
    return userInput;
  }

}