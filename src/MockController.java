import java.io.Reader;
import java.io.StringReader;
import java.util.Scanner;

public class MockController implements IController {
  //instantiate Model and View objects
  private Model model;
  private View view;

  //num to store "user input"
  private int userNum;

  //create mock input Reader
  private StringReader in = new StringReader("");
  // create mock output StringBuffer
  private StringBuffer out = new StringBuffer();

  /**
   * This is the constructor for the Mock Controller
   * @param model
   * @param view
   * @param in
   * @param out
   */
  public MockController(Model model, View view, StringReader in, StringBuffer out) {
    this.model = model;
    this.view = view;
    this.in = in;
    this.out = out;
  }
  /**
   * This method calls the fav food prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavFood() {
    view.printFoodMsg(); //How do I test that this method is printing the correct output string?
  }

  /**
   * This method returns the StringBuffer
   * @return out
   */
  public StringBuffer getOut() {
    return out;
  }

  /**
   * This method calls the fav color prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavColor() {
    view.printColorMsg();
    userNum = Integer.parseInt("2");
    model.setAnswers(userNum);
  }
  /**
   * This method calls the fav activity prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavActivity() {
    view.printActivityMsg();
    userNum = Integer.parseInt("3");
    model.setAnswers(userNum);
  }
  /**
   * This method calls the fav item prompt method in view and stores the user input in the model
   */
  @Override
  public void findFavItem() {
    view.printItemMsg();
    userNum = Integer.parseInt("4");
    model.setAnswers(userNum);
  }
  /**
   * This method gets the most frequent score from the model and sends it to the view to
   * call the print character method
   */
  @Override
  public void findCharacter() {
    int freqInt = model.getMostFrequentInt();
    String sanrio = model.getSanrioCharacter();
    view.displayCharacter(sanrio);
  }
  /**
   * This method gets the user choice input and calls the print character info in view
   */
  @Override
  public void getCharacterInfo() {
    view.characterInfoPrompt();
    String input = new Scanner(in).nextLine().toLowerCase();
    char userChoice = input.charAt(0);
    if(userChoice == 'h' || userChoice == 'c' || userChoice == 'k' ||
        userChoice == 'g' || userChoice == 'm' || userChoice == 'b' ||
        userChoice == 'l' || userChoice == 'p'){
      view.printCharacterInfo(userChoice);
    }
    else{
      view.inputErrorMsg();
      getCharacterInfo();
    }
  }
}
