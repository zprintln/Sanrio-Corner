import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ViewTest {
View viewTest = new View();
  @Before
  public void setUp() {
  }
  /**
   * This test prints the name of character that most relates to the user
   * In this case, Kuromi is printed
   */
  @Test
  public void displayCharacterKuromi() {
    viewTest.displayCharacter("Kuromi");
  }
  /**
   * This test prints the name of character that most relates to the user
   * In this case, My Melody is printed
   */
  @Test
  public void displayCharacterMyMelo() {
    viewTest.displayCharacter("My Melody");
  }

  /**
   * This test prints the name of character that most relates to the user
   * In this case, Cinnamoroll is printed
   */
  @Test
  public void displayCharacterCinnamoroll() {
    viewTest.displayCharacter("Cinnamoroll");
  }

  /**
   * This method prints a character profile for Hello Kitty
   */
  @Test
  public void printCharacterInfoHelloKitty() {
    viewTest.printCharacterInfo('h');
  }
  /**
   * This method prints a character profile for Cinnamoroll
   */
  @Test
  public void printCharacterInfoCinnamoroll() {
    viewTest.printCharacterInfo('c');
  }
  /**
   * This method prints a character profile for My Melody
   */
  @Test
  public void printCharacterInfoMyMelody() {
    viewTest.printCharacterInfo('m');
  }
  /**
   * This method prints a character profile for Badtz-Maru
   */
  @Test
  public void printCharacterInfoBadtz() {
    viewTest.printCharacterInfo('b');
  }
  /**
   * This method prints a character profile for Lala
   */
  @Test
  public void printCharacterInfoLala() {
    viewTest.printCharacterInfo('l');
  }
  /**
   * This method prints a character profile for Gudetama
   */
  @Test
  public void printCharacterInfoGudetama() {
    viewTest.printCharacterInfo('g');
  }
  /**
   * This method prints a character profile for Kuromi
   */
  @Test
  public void printCharacterInfoKuromi() {
    viewTest.printCharacterInfo('k');
  }
  /**
   * This method prints a character profile for Pompompurin
   */
  @Test
  public void printCharacterInfoPomPom() {
    viewTest.printCharacterInfo('p');
  }

  /**
   * This method tests printing a positive message
   */

  @Test
  public void testPrintHappyMsg() {
    String msg = "\nEmbrace your creativity like Keroppi and explore new things.\n";
    viewTest.printHappyMsg(msg);
  }

  /**
   * This method tests printing another positive message
   */

  @Test
  public void testprintAnotherHappyMsg() {
    String msg = "\nEmbrace your creativity like Keroppi and explore new things.\n";
    viewTest.printHappyMsg(msg);
  }

  /**
   * This method tests printing one more positive message
   */
  @Test
  public void testPrintOneMoreHappyMsg() {
    String msg = "\nLike Little Twin Stars, share your dreams with those you trust.\n";
    viewTest.printHappyMsg(msg);
  }

  /**
   * This test method prints the quiz prompt for fav food
   */
  @Test
  public void printFoodMsg() {
    viewTest.printFoodMsg();
  }

  /**
   * This test method prints the quiz prompt for fav color
   */
  @Test
  public void printColorMsg() {
    viewTest.printColorMsg();
  }

  /**
   * This test method prints the quiz prompt for fav activity
   */
  @Test
  public void printActivityMsg() {
    viewTest.printActivityMsg();
  }

  /**
   * This test method prints the quiz prompt for fav item
   */
  @Test
  public void printItemMsg() {
    viewTest.printItemMsg();
  }
}