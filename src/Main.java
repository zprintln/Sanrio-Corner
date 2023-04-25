
public class Main {

  public static void main(String[] args) {
    IModel model = new Model();
    IView view = new View(System.out);
    IController controller = new Controller(model, view, System.in, System.out);
    controller.go();
  }
}