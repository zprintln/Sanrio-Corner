import static org.junit.Assert.*;

import java.util.Scanner;
import org.junit.Test;

public class ControllerTest {
  private Model m = new Model();
  private View v = new View();
  private Controller controllerTest = new Controller(m,v);
   Scanner scanner = new Scanner(System.in);

  @Test
  public void findFavFood() {
    controllerTest.findFavFood();
  }

  @Test
  public void findFavColor() {
  }

  @Test
  public void findFavActivity() {
  }

  @Test
  public void findFavItem() {
  }

  @Test
  public void findCharacter() {
  }

  @Test
  public void getCharacterInfo() {
  }
}