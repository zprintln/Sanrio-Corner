/**
 * This main class runs the entire program!
 */
public class Main {

  public static void main(String[] args) {
    //Instantiate Model object
    IModel model = new Model();
    //Instantiate View object with System.out to print to the console
    IView view = new View(System.out);
    //Instantiate a Controller object with model and view, System.in and System.out to read in user input and call view to print to console
    IController controller = new Controller(model, view, System.in, System.out);
    //Call go to begin the program!
    controller.go();
  }
}