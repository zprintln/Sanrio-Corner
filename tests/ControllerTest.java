
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

  /**
   * This method tests the quiz method
   */
  @Test
  public void testSanrioQuiz() {
  }
}
