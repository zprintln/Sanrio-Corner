
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.StringBufferInputStream;
import java.util.IllegalFormatException;
import java.util.Optional;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.PrintStream;

public class ControllerTest {
  private Controller controller;
  private Model model;
  private View view;
  private StringBufferInputStream in;
  private ByteArrayOutputStream out;
  private PrintStream testOutput;

  @Before
  public void setUp() {
    model = new Model();
    out = new ByteArrayOutputStream();
    testOutput = new PrintStream(out);
    view = new View(testOutput);
    in = new StringBufferInputStream("1\n1\n1\n1\n1\n1\n5\n");
    controller = new Controller(model, view, in, testOutput);
  }
  /**
   * This method tests the flow of the findFavFood method of the controller
   */
  @Test
  public void testFindFavFood() {
    in = new StringBufferInputStream("1");
    controller = new Controller(model, view, in, testOutput);
    controller.findFavFood();
    assertEquals("\nWhat is your favorite food? \n"
        + "Sushi - 1 \n"
        + "Cotton Candy - 2 \n"
        + "Strawberries - 3 \n"
        + "Dark Chocolate - 4 \n"
        + "\nAnswer: \n\n", out.toString());
    assertSame( 1, model.getAnswersList().get(0));
  }
  /**
   * This method tests the flow of the findFavColor method of the controller
   */
  @Test
  public void testFindFavColor() {
    in = new StringBufferInputStream("2");
    controller = new Controller(model, view, in, testOutput);
    controller.findFavColor();
    assertEquals("\nWhat is your favorite color? \n"
        + "Red - 1 \n"
        + "Blue - 2 \n"
        + "Pink - 3 \n"
        + "Black -4 \n"
        + "\nAnswer: \n\n", out.toString());
    assertSame(2, model.getAnswersList().get(0));
  }
  /**
   * This method tests the flow of the findFavActivity method of the controller
   */
  @Test
  public void testFindFavActivity() {
    in = new StringBufferInputStream("3");
    controller = new Controller(model, view, in, testOutput);
    controller.findFavActivity();
    assertEquals("\nWhat is your favorite activity? \n"
        + "Baking - 1 \n"
        + "Exploring - 2 \n"
        + "Playing music - 3 \n"
        + "Dress-up - 4 \n"
        + "\nAnswer: \n\n", out.toString());
    assertSame(3, model.getAnswersList().get(0));
  }
  /**
   * This method tests the flow of the findFavItem method of the controller
   */
  @Test
  public void testFindFavItem() {
    in = new StringBufferInputStream("1");
    controller = new Controller(model, view, in, testOutput);
    controller.findFavItem();
    assertEquals("\nWhat is your favorite item? \n"
        + "Chessboard - 1 \n"
        + "Headphones - 2 \n"
        + "Lip gloss - 3 \n"
        + "Skull - 4 \n"
        + "\nAnswer: \n\n", out.toString());
    assertSame(1, model.getAnswersList().get(0));
  }

  /**
   * This method tests the flow of the findFavSport method of the controller
   */
  @Test
  public void testFindFavSport() {
    in = new StringBufferInputStream("1");
    controller = new Controller(model, view, in, testOutput);
    controller.findFavSport();
    assertEquals( "\nWhat is your favorite sport? \n"
        + "Chess - 1 \n"
        + "Tennis - 2 \n"
        + "Dance - 3 \n"
        + "Foosball - 4 \n"
        + "\nAnswer: \n\n", out.toString());
    assertSame(1, model.getAnswersList().get(0));
  }

  /**
   * This method tests the flow of the quiz prompts in the go method and the final character reveal.
   */
  @Test
  public void testFindCharacter() {
    model = new Model();
    view = new View(new PrintStream(out));
    controller = new Controller(model, view, in, testOutput);
    model.setAnswers(1);
    model.setAnswers(1);
    model.setAnswers(1);
    model.setAnswers(4);
    model.setAnswers(3);
    controller.findCharacter();
    assertEquals("Your Sanrio character is: Hello Kitty\n\n\n", out.toString());
  }

  /**
   * This method tests the menu prompt of the go method

  @Test
  public void testGo() {
    controller.go();
    assertEquals("==============SANRIO CORNER ============\n" + " Take a quiz! - 1\n" +
        " Print a message to brighten my day - 2\n" + "Learn about a Sanrio character - 3\n" + "Quit - 4\n" + "Enter your choice: ", out.toString());
  }
  */

  /**
   * This method tests the input validation method of the controller on an integer
   */
  @Test
  public void testValidateInputIsInteger() {
    in = new StringBufferInputStream("4");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger(4);
    assertTrue(result);
  }
  /**
   * This method tests the input validation of the controller on a non-integer
   */
  @Test
  public void testValidateInputIsIntegerOnNonInteger() {
    in = new StringBufferInputStream("c");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger("c");
    assertFalse(result);
  }

  /**
   * This method tests the integer range validation method of the controller
   */
  @Test
  public void testVerifyInputRange() {
    boolean result = controller.verifyInputRange(5, 1, 10);
    assertTrue(result);
  }

  /**
   * This method tests the input range validation on a non-valid integer
   */
  @Test
  public void testVerifyInputRange_invalid() {
    boolean result = controller.verifyInputRange(15, 1, 10);
    assertFalse(result);
  }


}
