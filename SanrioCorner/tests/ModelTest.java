import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
/**
 * This test class tests all the methods of the Model
 */
public class ModelTest {

  // Create an instance of the class
  private Model modelTest;
  ArrayList<Integer> list;
  @Before
  public void setUp() throws Exception {
    this.modelTest = new Model();
    this.list = new ArrayList<Integer>();
  }

  /**
   * This method tests that answers list contains correct answers
   */
  @Test
  public void testAnswerList(){
    modelTest.setAnswers(1);
    modelTest.setAnswers(2);
    modelTest.setAnswers(3);
    modelTest.setAnswers(1);
    modelTest.setAnswers(1);

    list = modelTest.getAnswersList();
    assertEquals((long) 1, (long) list.get(0));
    assertEquals((long) 2, (long) list.get(1));
    assertEquals((long) 3, (long) list.get(2));
    assertEquals((long) 1, (long) list.get(3));
    assertEquals((long) 1, (long) list.get(4));

  }
  /**
   * This method tests another list of answers and asserts the list contains correct answers
   */
  @Test
  public void testAnotherAnswerList(){
    modelTest.setAnswers(2);
    modelTest.setAnswers(2);
    modelTest.setAnswers(3);

    list = modelTest.getAnswersList();
    assertEquals((long) 2, (long) list.get(0));
    assertEquals((long) 2, (long) list.get(1));
    assertEquals((long) 3, (long) list.get(2));
  }
  /**
   * This method tests that answers list contains only one correct answer
   */
  @Test
  public void testAnswerOneItem(){
    modelTest.setAnswers(3);
    System.out.println(modelTest.getAnswersList());
  }

  /**
   * This method tests that the message generator returns the hello kitty message
   */
  @Test
  public void testMsgGeneratorHK() {
    int num = 0;
    assertEquals("\nBe yourself like Hello Kitty and let your uniqueness shine!\n",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests that the message generator returns the keroppi message
   */
  @Test
  public void testMsgGeneratorKeroppi() {
    int num = 5;
    assertEquals("\nEmbrace your creativity like Keroppi and explore new things.\n",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests that the message generator returns a My Melody message
   */
  @Test
  public void testMsgGeneratorMyMelo() {
    int num = 1;
    assertEquals("\nDon't let bad days get you down, be as resilient as My Melody!\n",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests hello kitty is returned
   */
  @Test
  public void getCharacterHelloKitty() {
    modelTest.setAnswers(1);
    modelTest.setAnswers(1);
    modelTest.setAnswers(4);
    modelTest.setAnswers(1);
    modelTest.setAnswers(3);
    String character = modelTest.getSanrioCharacter();
    assertEquals("Hello Kitty", character);
  }
  /**
   * This method tests my melody is returned
   */
  @Test
  public void getCharacterMyMelody() {
    modelTest.setAnswers(1);
    modelTest.setAnswers(3);
    modelTest.setAnswers(4);
    modelTest.setAnswers(3);
    modelTest.setAnswers(3);
    String character = modelTest.getSanrioCharacter();
    assertEquals("My Melody", character);
  }
  /**
   * This method tests cinnamoroll is returned
   */
  @Test
  public void getCharacterCinnamoroll() {
    modelTest.setAnswers(1);
    modelTest.setAnswers(2);
    modelTest.setAnswers(2);
    modelTest.setAnswers(3);
    modelTest.setAnswers(4);
    String character = modelTest.getSanrioCharacter();
    assertEquals("Cinnamoroll", character);
  }
  /**
   * This method tests Kuromi is returned
   */
  @Test
  public void getCharacterKuromi() {
    modelTest.setAnswers(1);
    modelTest.setAnswers(4);
    modelTest.setAnswers(4);
    modelTest.setAnswers(3);
    modelTest.setAnswers(2);
    String character = modelTest.getSanrioCharacter();
    assertEquals("Kuromi", character);
  }

  /**
   * This tests that answers are correctly set to the list of answers
   */
  @Test
  public void testSetAnswers(){
    modelTest.setAnswers(1);
    modelTest.setAnswers(2);
    modelTest.setAnswers(4);
    modelTest.setAnswers(2);
    modelTest.setAnswers(3);
    int ans = modelTest.getMostFrequentInt();
    assertEquals(2, ans);
  }

  /**
   * This test checks that the highest character frequency is h
   */
  @Test
  public void testGetMostFrequentCharHelloKitty() {
    // Initialize the scores arrayList
    modelTest.setAnswers(1);
    modelTest.setAnswers(1);
    modelTest.setAnswers(4);
    modelTest.setAnswers(1);
    modelTest.setAnswers(3);

    // Call the getMostFrequentInt method and store the result in a variable
    int result = modelTest.getMostFrequentInt();

    // Check that the result is the expected character
    assertEquals(1, result);
  }
  /**
   * This test checks that the highest character frequency is m
   */
  @Test
  public void testGetMostFrequentCharMyMelo() {
    // Initialize the scores arrayList
    modelTest.setAnswers(1);
    modelTest.setAnswers(3);
    modelTest.setAnswers(4);
    modelTest.setAnswers(3);
    modelTest.setAnswers(3);

    // Call the getMostFrequentInt method and store the result in a variable
    int result = modelTest.getMostFrequentInt();

    // Check that the result is the expected character
    assertEquals(3, result);
  }
  /**
   * This test checks that the highest character frequency is c
   */
  @Test
  public void testGetMostFrequentIntCinnamoroll() {
    // Initialize the scores arrayList
    modelTest.setAnswers(1);
    modelTest.setAnswers(2);
    modelTest.setAnswers(2);
    modelTest.setAnswers(3);
    modelTest.setAnswers(4);

    // Call the getMostFrequentInt method and store the result in a variable
    int result = modelTest.getMostFrequentInt();

    // Check that the result is the expected character
    assertEquals(2, result);
  }
  /**
   * This test checks that the highest character frequency is k
   */
  @Test
  public void testGetMostFrequentIntKuromi() {
    // Initialize the scores arrayList
    modelTest.setAnswers(1);
    modelTest.setAnswers(4);
    modelTest.setAnswers(4);
    modelTest.setAnswers(1);
    modelTest.setAnswers(4);

    // Call the getMostFrequentInt method and store the result in a variable
    int result = modelTest.getMostFrequentInt();

    // Check that the result is the expected character
    assertEquals(4, result);
  }


}