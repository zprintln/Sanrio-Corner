import java.io.PrintStream;
import java.util.IllegalFormatException;
import java.util.Scanner;
import java.io.StringReader;
public class Controller implements IController{

 private int userNum;
 private Model model;
  private View view;
  private Scanner scanner;
  private StringReader in;
  private PrintStream out;


  /**
   * This is the constructor for a Controller
   * @param model
   * @param view
   * @param in
   * @param out
   */
  public Controller(Model model, View view, StringReader in, PrintStream out){
    this.model = model;
    this.view = view;
    this.in = in;
    this.out = out;
    this.scanner = new Scanner(System.in); //Is this correct?
  }
  /**
   * This method starts the program!
   */
  @Override
  public void go(){
    boolean quit = false;
    while(!quit){
      //call view to show user menu
      view.showMenu();
      //take in user input
      userNum = this.validateInputIsInteger();
      //validate input is within bounds

      //switch to determine action taken
      switch(userNum){
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
          int input = Integer.parseInt(scanner.nextLine());
          while(input < 1 || input > 10){
            view.inputErrorMsg();
          }
          String msg = model.MsgGenerator(input);
          view.printHappyMsg(msg);
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
          view.inputErrorMsg();
          break;
      }//end switch
    }//end while
  }//end go method


  /**
   * This method calls the fav food prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavFood(){
    //print user prompt
    view.printFoodMsg();
    //store user input
    userNum = Integer.parseInt(scanner.nextLine());
    //send to model
    model.setAnswers(userNum);
  }
  /**
   * This method calls the fav color prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavColor(){
    //print user prompt
    view.printColorMsg();
    //store user input
    userNum = Integer.parseInt(scanner.nextLine());
    //send to model
    model.setAnswers(userNum);
  }

  /**
   * This method verifies user input is an integer
   * @return true if input is valid
   * @throws IllegalFormatException if input is not an integer
   */
  @Override
  public int validateInputIsInteger() {
    int userInput = 0;
    boolean isValid = false;
    while (!isValid) {
      try {
        userInput = Integer.parseInt(scanner.nextLine());
        isValid = true;
      } catch (IllegalFormatException e) {
       view.inputErrorMsg();
        isValid = false;
      }
    }
    return userInput;
  }

  /**
   * This method determines if a given input is within range
   * @param input the integer input
   * @param minRange the floor of the range
   * @param maxRange the ceiling of the range
   * @return true if input is within range, or false if not
   */
  @Override
  public boolean verifyInputRange(int input, int minRange, int maxRange) {
    boolean inRange = false;
    while(!inRange){
      if(input >= minRange && input <= maxRange){
        inRange = true;
      }else{
        view.inputErrorMsg();
      }
    }
    return inRange;
  }

  /**
   * This method calls the fav activity prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavActivity(){
    //print user prompt
    view.printActivityMsg();
    //store user input
    userNum = Integer.parseInt(scanner.nextLine());
    //send to model
    model.setAnswers(userNum);
  }

  /**
   * This method calls the fav item prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavItem(){
    //print user prompt
    view.printItemMsg();
    //store user input
    userNum = Integer.parseInt(scanner.nextLine());
    //send to model
    model.setAnswers(userNum);
  }
  /**
   * This method calls the fav sport prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavSport(){
    //print user prompt
    view.printSportMsg();
    //store user input
    userNum = Integer.parseInt(scanner.nextLine());
    //send to model
    model.setAnswers(userNum);
  }

  /**
   * This method gets the most frequent score from the model and sends it to the view to
   * call the print character method
   */
  @Override
  public void findCharacter(){
    //find character match
    String sanrio = model.getSanrioCharacter();
    //send to view to print character
    view.displayCharacter(sanrio);
  }

  /**
   * This method gets the user choice input and calls the print character info in view
   */
  @Override
  public void getCharacterInfo(){
    //prompt user
    view.characterInfoPrompt();
    //store input in lower case
    String input = scanner.nextLine().toLowerCase();
    //parse to char
    char userChoice = input.charAt(0);
    //verify that input is correct
    if(userChoice == 'h' || userChoice == 'c' || userChoice == 'k' ||
        userChoice == 'g' || userChoice == 'm' || userChoice == 'b' ||
        userChoice == 'l' || userChoice == 'p'){

        //send to view
        view.printCharacterInfo(userChoice);
    }
    else{
        //print error message
        view.inputErrorMsg();
        //call function again
        getCharacterInfo();
    }

  }

}
