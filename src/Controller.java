import java.util.Scanner;
public class Controller implements IController{
  Scanner scanner = new Scanner(System.in);
  private Model model = new Model();
  private View view = new View();
  private int userNum;
  public Controller(Model model, View view){
    //instantiate a model and a view object
    this.model = model;
    this.view = view;
  }
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
   * This method gets the most frequent score from the model and sends it to the view to
   * call the print character method
   */
  @Override
  public void findCharacter(){
    //call frequentInt method in model
    int freqInt = model.getMostFrequentInt();
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
