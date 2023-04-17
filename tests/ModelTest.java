import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ModelTest {

  // Create an instance of the class
  Model modelTest = new Model();

  @Before
  public void setUp(){


  }

  /**
   * Test random number generator
   */
  @Test
  public void testRandNum(){
    int num = modelTest.randNum();
  }
  @Test
  public void testMsgGeneratorHK() {
    int num = 0;
    assertEquals("Be yourself like Hello Kitty and let your uniqueness shine!", modelTest.MsgGenerator(num));
  }
  @Test
  public void testMsgGeneratorKeroppi() {
    int num = 5;
    assertEquals("Embrace your creativity like Keroppi and explore new things.", modelTest.MsgGenerator(num));
  }
  @Test
  public void testMsgGeneratorMyMelo() {
    int num = 1;
    assertEquals("Don't let bad days get you down, be as resilient as My Melody!", modelTest.MsgGenerator(num));
  }

  @Test
  public void getCharacter() {

  }

  @Test
  public void setScore() {
  }

  /**
   * This test checks that the highest character frequency is h
   */
  @Test
  public void testGetHighestScoreH() {
    // Initialize the scores arrayList
    ArrayList<Character> scores = new ArrayList<>();
    scores.add('h');
    scores.add('m');
    scores.add('c');
    scores.add('h');
    scores.add('m');
    scores.add('h');
    scores.add('c');
    scores.add('h');

    // Call the getHighestScore method and store the result in a variable
    char result = modelTest.getHighestScore(scores);

    // Check that the result is the expected character
    assertEquals('h', result);
  }
  /**
   * This test checks that the highest character frequency is m
   */
  @Test
  public void testGetHighestScoreM() {
    // Initialize the scores arrayList
    ArrayList<Character> scores = new ArrayList<>();
    scores.add('h');
    scores.add('m');
    scores.add('m');
    scores.add('h');
    scores.add('m');
    scores.add('h');
    scores.add('m');
    scores.add('m');

    // Call the getHighestScore method and store the result in a variable
    char result = modelTest.getHighestScore(scores);

    // Check that the result is the expected character
    assertEquals('m', result);
  }
  /**
   * This test checks that the highest character frequency is c
   */
  @Test
  public void testGetHighestScoreC() {
    // Initialize the scores arrayList
    ArrayList<Character> scores = new ArrayList<>();
    scores.add('h');
    scores.add('m');
    scores.add('c');
    scores.add('h');
    scores.add('c');
    scores.add('c');
    scores.add('c');
    scores.add('m');

    // Call the getHighestScore method and store the result in a variable
    char result = modelTest.getHighestScore(scores);

    // Check that the result is the expected character
    assertEquals('c', result);
  }
  /**
   * This test checks that the highest character frequency is k
   */
  @Test
  public void testGetHighestScoreK() {
    // Initialize the scores arrayList
    ArrayList<Character> scores = new ArrayList<>();
    scores.add('k');
    scores.add('m');
    scores.add('k');
    scores.add('h');
    scores.add('k');
    scores.add('h');
    scores.add('k');
    scores.add('m');

    // Call the getHighestScore method and store the result in a variable
    char result = modelTest.getHighestScore(scores);

    // Check that the result is the expected character
    assertEquals('k', result);
  }


}