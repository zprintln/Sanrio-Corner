import java.io.ByteArrayOutputStream;
import java.io.StringBufferInputStream;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import java.io.PrintStream;

/**
 * This test class tests the methods of the Controller by using a Mock View
 */
public class ControllerTest {
  private Controller controller;
  private Model model;
  private MockView view;
  private StringBufferInputStream in;
  private ByteArrayOutputStream out;
  private PrintStream testOutput;

  @Before
  public void setUp() {
    model = new Model();
    out = new ByteArrayOutputStream();
    testOutput = new PrintStream(out);
    view = new MockView(testOutput);
    in = new StringBufferInputStream("1\n1\n1\n1\n1\n1\n5\n");
    controller = new Controller(model, view, in, testOutput);
  }

  /**
   * This method tests the flow of the quiz prompts in the go method and the final character reveal of hello kitty
   */
  @Test
  public void testFindCharacterHK() {
    model = new Model();
    view = new MockView(new PrintStream(out));
    controller = new Controller(model, view, in, testOutput);
    model.setAnswers(1);
    model.setAnswers(1);
    model.setAnswers(1);
    model.setAnswers(4);
    model.setAnswers(3);
    controller.findCharacter();
    assertEquals("Display test sanrio: Hello Kitty", out.toString());
  }
  /**
   * This method tests the flow of the quiz prompts in the go method and the final character reveal of kuromi
   */
  @Test
  public void testFindCharacterKUROMI() {
    model = new Model();
    view = new MockView(new PrintStream(out));
    controller = new Controller(model, view, in, testOutput);
    model.setAnswers(4);
    model.setAnswers(1);
    model.setAnswers(4);
    model.setAnswers(4);
    model.setAnswers(3);
    controller.findCharacter();
    assertEquals("Display test sanrio: Kuromi", out.toString());
  }
  /**
   * This method tests the flow of the quiz prompts in the go method and the final character reveal of my melody
   */
  @Test
  public void testFindCharacterMYMELO() {
    model = new Model();
    view = new MockView(new PrintStream(out));
    controller = new Controller(model, view, in, testOutput);
    model.setAnswers(3);
    model.setAnswers(3);
    model.setAnswers(3);
    model.setAnswers(4);
    model.setAnswers(3);
    controller.findCharacter();
    assertEquals("Display test sanrio: My Melody", out.toString());
  }
  /**
   * This method tests the flow of the quiz prompts in the go method and the final character reveal of cinnamoroll
   */
  @Test
  public void testFindCharacterCINNAMOROLl() {
    model = new Model();
    view = new MockView(new PrintStream(out));
    controller = new Controller(model, view, in, testOutput);
    model.setAnswers(2);
    model.setAnswers(2);
    model.setAnswers(2);
    model.setAnswers(4);
    model.setAnswers(3);
    controller.findCharacter();
    assertEquals("Display test sanrio: Cinnamoroll", out.toString());
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
   * This method tests the input validation method of the controller on an integer
   */
  @Test
  public void testAnotherValidateInputIsInteger() {
    in = new StringBufferInputStream("2");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger(2);
    assertTrue(result);
  }
  /**
   * This method tests the input validation method of the controller on an integer
   */
  @Test
  public void testOneMoreValidateInputIsInteger() {
    in = new StringBufferInputStream("6");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger(6);
    assertTrue(result);
  }
  /**
   * This method tests the input validation of the controller on a negative integer
   */
  @Test
  public void testValidateInputIsIntegerOnNegInteger() {
    in = new StringBufferInputStream("-1");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger("-1");
    assertFalse(result);
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
   * This method tests the input validation of the controller on a string
   */
  @Test
  public void testValidateInputIsIntegerOnString() {
    in = new StringBufferInputStream("haha");
    controller = new Controller(model, view, in, testOutput);
    boolean result = controller.validateInputIsInteger("haha");
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
   * This method tests the integer range validation method of the controller
   */
  @Test
  public void testAnotherVerifyInputRange() {
    boolean result = controller.verifyInputRange(6, -2, 100);
    assertTrue(result);
  }
  /**
   * This method tests the integer range validation method of the controller
   */
  @Test
  public void testOneMoreVerifyInputRange() {
    boolean result = controller.verifyInputRange(-1, -2, 100);
    assertTrue(result);
  }
  /**
   * This method tests the input range validation on an out of range integer
   */
  @Test
  public void testVerifyInputRangeIsInvalid() {
    boolean result = controller.verifyInputRange(15, 1, 10);
    assertFalse(result);
  }
  /**
   * This method tests the input range validation on an out of range negative integer
   */
  @Test
  public void testVerifyInputRangeIsInvalidNegative() {
    boolean result = controller.verifyInputRange(-1, 1, 10);
    assertFalse(result);
  }

  /**
   * This method tests the printing of the food prompt only
   */
  @Test
  public void testSanrioQuizFirstPrompt() {

  view.printQuizPrompts(1);
  assertEquals("Food prompt ", out.toString());
  }

  /**
   * This method tests the printing of the color prompt only
   */
  @Test
  public void testSanrioQuizSecondPrompt() {

    view.printQuizPrompts(2);
    assertEquals("Color prompt ", out.toString());
  }

  /**
   * This method tests the printing of the activity prompt only
   */
  @Test
  public void testSanrioQuizThirdPrompt() {

    view.printQuizPrompts(3);
    assertEquals("Activity prompt ", out.toString());
  }

  /**
   * This method tests the printing of the item prompt only
   */
  @Test
  public void testSanrioQuizFourthPrompt() {

    view.printQuizPrompts(4);
    assertEquals("Item prompt ", out.toString());
  }

  /**
   * This method tests the printing of the sport prompt only
   */
  @Test
  public void testSanrioQuizFifthPrompt() {

    view.printQuizPrompts(5);
    assertEquals("Sport prompt ", out.toString());
  }
  /**
   * This method tests the flow of all the quiz prompts together
   */
  @Test
  public void testSanrioQuiz() {

    for(int m = 0; m <=5; m++){
      view.printQuizPrompts(m);
    }
    assertEquals("Food prompt Color prompt Activity prompt Item prompt Sport prompt ", out.toString());

  }

  /**
   * This method tests the controller getting the character info for hello kitty character
   */
  @Test
  public void testGetCharacterInfoHK() {
   view.printCharacterInfo('h');
   assertEquals("Hello kitty", out.toString());
  }
  /**
   * This method tests the controller getting the character info for kuromi character
   */
  @Test
  public void testGetCharacterInfoKUROMI() {
    view.printCharacterInfo('k');
    assertEquals("Kuromi", out.toString());
  }
  /**
   * This method tests the controller getting the character info for my melody character
   */
  @Test
  public void testGetCharacterInfoMYMELO() {
    view.printCharacterInfo('m');
    assertEquals("My melody", out.toString());
  }
  /**
   * This method tests the controller getting the character info for cinnamoroll character
   */
  @Test
  public void testGetCharacterInfoCINNAMOROLL() {
    view.printCharacterInfo('c');
    assertEquals("Cinnamoroll", out.toString());
  }
  /**
   * This method tests the controller getting the character info for badtz-maru character
   */
  @Test
  public void testGetCharacterInfoBADTZMARU() {
    view.printCharacterInfo('b');
    assertEquals("Badtz-Maru", out.toString());
  }
  /**
   * This method tests the controller getting the character info for lala character
   */
  @Test
  public void testGetCharacterInfoLALA() {
    view.printCharacterInfo('l');
    assertEquals("Lala", out.toString());
  }
  /**
   * This method tests the controller getting the character info for gudetama character
   */
  @Test
  public void testGetCharacterInfoGUDETAMA() {
    view.printCharacterInfo('g');
    assertEquals("Gudetama", out.toString());
  }
  /**
   * This method tests the controller getting the character info for pompompurin character
   */
  @Test
  public void testGetCharacterInfoPOMPOM() {
    view.printCharacterInfo('p');
    assertEquals("Pompompurin", out.toString());
  }
  /**
   * This method tests simulates what the controller would do if a non-valid char was entered when getting character info
   */
  @Test
  public void testGetCharacterInfoInvalidInput() {
    view.printCharacterInfo('z');
    assertEquals("Type a valid letter to learn about a character", out.toString());
  }
  /**
   * This test method tests the printing of the error message using the mock view
   */
  @Test
  public void testErrorMsg(){
    view.inputErrorMsg();
    assertEquals("Error msg test", out.toString());
  }
}
