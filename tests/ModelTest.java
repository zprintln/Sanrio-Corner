import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.*;

public class ModelTest {

  // Create an instance of the class
  Model modelTest = new Model();

  /**
   * This method tests that answers list contains correct answers
   */
  @Test
  public void testAnswerList(){
    modelTest.setAnswers('m');
    modelTest.setAnswers('m');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    ArrayList<Character> list = new ArrayList<>();
    list = modelTest.getAnswersList();
    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
  /**
   * This method tests that answers list contains correct answer
   */
  @Test
  public void testAnswerOneItem(){
    modelTest.setAnswers('m');
    System.out.println(modelTest.getAnswersList());
  }

  /**
   * This method tests that the message generator returns the hello kitty message
   */
  @Test
  public void testMsgGeneratorHK() {
    int num = 0;
    assertEquals("Be yourself like Hello Kitty and let your uniqueness shine!",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests that the message generator returns the keroppi message
   */
  @Test
  public void testMsgGeneratorKeroppi() {
    int num = 5;
    assertEquals("Embrace your creativity like Keroppi and explore new things.",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests that the message generator returns the my melody message
   */
  @Test
  public void testMsgGeneratorMyMelo() {
    int num = 1;
    assertEquals("Don't let bad days get you down, be as resilient as My Melody!",
        modelTest.MsgGenerator(num));
  }

  /**
   * This method tests hello kitty is returned
   */
  @Test
  public void getCharacterHelloKitty() {
    modelTest.setAnswers('h');
    modelTest.setAnswers('h');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    String character = modelTest.getSanrioCharacter();
    assertEquals("Hello Kitty", character);
  }
  /**
   * This method tests my melody is returned
   */
  @Test
  public void getCharacterMyMelody() {
    modelTest.setAnswers('m');
    modelTest.setAnswers('m');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    String character = modelTest.getSanrioCharacter();
    assertEquals("My Melody", character);
  }
  /**
   * This method tests cinnamoroll is returned
   */
  @Test
  public void getCharacterCinnamoroll() {
    modelTest.setAnswers('c');
    modelTest.setAnswers('c');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    String character = modelTest.getSanrioCharacter();
    assertEquals("Cinnamoroll", character);
  }
  /**
   * This method tests Kuromi is returned
   */
  @Test
  public void getCharacterKuromi() {
    modelTest.setAnswers('k');
    modelTest.setAnswers('k');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    String character = modelTest.getSanrioCharacter();
    assertEquals("Kuromi", character);
  }
  @Test
  public void testSetAnswers(){
    modelTest.setAnswers('c');
    modelTest.setAnswers('c');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');
    char ans = modelTest.getMostFrequentChar();
    assertEquals('c', ans);
  }

  /**
   * This test checks that the highest character frequency is h
   */
  @Test
  public void testGetMostFrequentCharH() {
    // Initialize the scores arrayList
    modelTest.setAnswers('c');
    modelTest.setAnswers('h');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('h');

    // Call the getMostFrequentChar method and store the result in a variable
    char result = modelTest.getMostFrequentChar();

    // Check that the result is the expected character
    assertEquals('h', result);
  }
  /**
   * This test checks that the highest character frequency is m
   */
  @Test
  public void testGetMostFrequentCharM() {
    // Initialize the scores arrayList
    modelTest.setAnswers('k');
    modelTest.setAnswers('m');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');

    // Call the getMostFrequentChar method and store the result in a variable
    char result = modelTest.getMostFrequentChar();

    // Check that the result is the expected character
    assertEquals('m', result);
  }
  /**
   * This test checks that the highest character frequency is c
   */
  @Test
  public void testGetMostFrequentCharC() {
    // Initialize the scores arrayList
    modelTest.setAnswers('c');
    modelTest.setAnswers('c');
    modelTest.setAnswers('h');
    modelTest.setAnswers('m');
    modelTest.setAnswers('c');

    // Call the getMostFrequentChar method and store the result in a variable
    char result = modelTest.getMostFrequentChar();

    // Check that the result is the expected character
    assertEquals('c', result);
  }
  /**
   * This test checks that the highest character frequency is k
   */
  @Test
  public void testGetMostFrequentCharK() {
    // Initialize the scores arrayList
    modelTest.setAnswers('k');
    modelTest.setAnswers('k');
    modelTest.setAnswers('h');
    modelTest.setAnswers('k');
    modelTest.setAnswers('c');

    // Call the getMostFrequentChar method and store the result in a variable
    char result = modelTest.getMostFrequentChar();

    // Check that the result is the expected character
    assertEquals('k', result);
  }


}