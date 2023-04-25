import static org.junit.Assert.*;
import java.io.Reader;
import java.io.StringReader;
import org.junit.Before;
import org.junit.Test;
import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

public class ViewTest {
private View viewTest;
private ByteArrayOutputStream out;
  @Before
  public void setUp() throws Exception {
    this.out = new ByteArrayOutputStream();
    this.viewTest = new View(new PrintStream(out));
  }
  /**
   * This method shows the initial menu for the game
   */
  @Test
  public void testShowGo(){
    viewTest.showMenu();
    assertEquals("==============SANRIO CORNER ============\n" +
     "\n\n" + " Take a quiz! - 1\n\n" + " Print a message to brighten my day - 2\n\n"
        + "Learn about a Sanrio character - 3\n\n" +
        "Quit - 4\n\n" + "Enter your choice: ", out.toString());
  }

  /**
   * This test prints the name of character that most relates to the user
   * In this case, Kuromi is printed
   */
  @Test
  public void testDisplayCharacterKuromi() {
    viewTest.displayCharacter("Kuromi");
    assertEquals("Your Sanrio character is: Kuromi\n\n\n", out.toString());
  }
  /**
   * This test prints the name of character that most relates to the user
   * In this case, My Melody is printed
   */
  @Test
  public void testDisplayCharacterMyMelo() {
    viewTest.displayCharacter("My Melody");
    assertEquals("Your Sanrio character is: My Melody\n\n\n", out.toString());
  }

  /**
   * This test prints the name of character that most relates to the user
   * In this case, Cinnamoroll is printed
   */
  @Test
  public void testDisplayCharacterCinnamoroll() {
    viewTest.displayCharacter("Cinnamoroll");
    assertEquals("Your Sanrio character is: Cinnamoroll\n\n\n", out.toString());
  }

  /**
   * This method prints a character profile for Hello Kitty
   */
  @Test
  public void testPrintCharacterInfoHelloKitty() {
    viewTest.printCharacterInfo('h');
    assertEquals("\nName: Hello Kitty\n"
        + "Species: Cat\n"
        + "Gender: Female\n"
        + "Personality: Sweet, caring, and curious. \n"
        + "Likes: Apples, baking, and spending time with her friends.\n"
        + "Dislikes: Rainy days and being alone.\n"
        + "\n   Hello Kitty loves making friends and exploring new things. \n"
        + "   She is also very determined and always tries her best.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for Cinnamoroll
   */
  @Test
  public void testPrintCharacterInfoCinnamoroll() {
    viewTest.printCharacterInfo('c');
    assertEquals( "\nName: Cinnamoroll\n"
        + "Species: Puppy\n"
        + "Gender: Male\n"
        + "Personality: Cheerful, optimistic, and friendly. \n"
        + "Likes: Flying with his long ears, cinnamon rolls, and spending time with his friends.\n"
        + "Dislikes: Bullies and anyone who is mean to his friends.\n"
        + " \n  Cinnamoroll loves making new friends and spreading happiness wherever he goes. \n"
        + "  He is also quite curious and loves to explore new places.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for My Melody
   */
  @Test
  public void testPrintCharacterInfoMyMelody() {
    viewTest.printCharacterInfo('m');
    assertEquals("\nName: My Melody\n"
        + "Species: Rabbit\n"
        + "Gender: Female\n"
        + "Personality: Sweet, kind-hearted, and gentle. \n"
        + "Likes: Baking, playing the piano, and spending time with her best friend, a mouse named Flat.\n"
        + "Dislikes: Conflict and loud noises.\n"
        + "\n   My Melody is very shy but loves spending time with her friends and helping others.\n"
        + "   She is also quite resilient and won't give up easily.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for Badtz-Maru
   */
  @Test
  public void testPrintCharacterInfoBadtz() {
    viewTest.printCharacterInfo('b');
    assertEquals("\nName: Badtz-Maru\n"
        + "Species: Penguin\n"
        + "Gender: Male\n"
        + "Personality: Mischevious, sarcastic, and stubborn. \n"
        + "Likes: Playing pranks, music, and martial arts.\n"
        + "Dislikes: Rules and anyone who tells him what to do.\n"
        + "\n   Badtz-Maru likes to keep things cool and is often seen wearing sunglasses. \n"
        + "   He has a rebellious spirit but also a caring side.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for Lala
   */
  @Test
  public void testPrintCharacterInfoLala() {
    viewTest.printCharacterInfo('l');
    assertEquals("\nName: Lala\n"
        + "Species: Star fairy\n"
        + "Gender: Female\n"
        + "Personality: Dreamy, kind, and whimsical. \n"
        + "Likes: Star gazing, sleeping in clouds, and spreading happiness.\n"
        + "Dislikes: Negative vibes and anything that would disturb her peace.\n"
        + "\n   Lala loves exploring the universe and meeting new friends. \n"
        + "   She is also very close to her brother Kiki, they share a strong bond.\n\n",out.toString());
  }
  /**
   * This method prints a character profile for Gudetama
   */
  @Test
  public void testPrintCharacterInfoGudetama() {
    viewTest.printCharacterInfo('g');
    assertEquals("\nName: Gudetama\n"
        + "Species: Egg\n"
        + "Gender: Unknown\n"
        + "Personality: Lazy, unmotivated, and apathetic. \n"
        + "Likes: Sleeping, being left alone, and eating egg dishes.\n"
        + "Dislikes: Being poked, prodded, or bothered in any way.\n"
        + "\n   Gudetama is a little egg with a big personality. \n"
        + "   He doesn't like to do much and would rather lay around all day. \n"
        + "   He's often seen sleeping or lounging in his shell.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for Kuromi
   */
  @Test
  public void testPrintCharacterInfoKuromi() {
    viewTest.printCharacterInfo('k');
    assertEquals("\nName: Kuromi\n"
        + "Species: Rabbit\n"
        + "Gender: Female\n"
        + "Personality: Mischievous, sassy, and confident. \n"
        + "Likes: Goth fashion, playing pranks, and collecting skulls.\n"
        + "Dislikes: Being told what to do and anything too cute.\n"
        + " \n   Kuromi is a bit of a troublemaker but also has a caring side. \n"
        + "   She enjoys making jokes and teasing her friends, but will \n"
        + "   always have their back when they need her.\n\n", out.toString());
  }
  /**
   * This method prints a character profile for Pompompurin
   */
  @Test
  public void testPrintCharacterInfoPomPom() {
    viewTest.printCharacterInfo('p');
    assertEquals("\nName: Pompompurin\n"
        + "Species: Golden Retriever\n"
        + "Gender: Male\n"
        + "Personality: Happy-go-lucky, easygoing, and friendly. \n"
        + "Likes: Pudding, his brown beret, and his best friend, a mouse named Muffin.\n"
        + "Dislikes: Getting up early, spicy food, and anything too scary.\n"
        + "\n   Pompom loves napping, eating pudding, and hanging out with his friends. \n"
        + "   He's also quite curious and loves to explore his surroundings.\n\n", out.toString());
  }

  /**
   *This method tests the prompt for the happy message
   */
  @Test
  public void testPrintHappyMsgPrompt() {
    viewTest.happyMsgPrompt();
    assertEquals("\nEnter a number from 1-10 to get a positive message: ", out.toString());
  }
  /**
   * This method tests printing a positive message
   */
  @Test
  public void testPrintHappyMsg() {
    String msg = "\nHave a curious spirit like Badtz-Maru and always ask questions.\n";
    viewTest.printHappyMsg(msg);
    assertEquals("\nHave a curious spirit like Badtz-Maru and always ask questions.\n\n", out.toString());
  }

  /**
   * This method tests printing another positive message
   */
  @Test
  public void testprintAnotherHappyMsg() {
    String msg = "\nEmbrace your creativity like Keroppi and explore new things.\n";
    viewTest.printHappyMsg(msg);
    assertEquals("\nEmbrace your creativity like Keroppi and explore new things.\n\n", out.toString());
  }

  /**
   * This method tests printing one more positive message
   */
  @Test
  public void testPrintOneMoreHappyMsg() {
    String msg = "\nLike Little Twin Stars, share your dreams with those you trust.\n";
    viewTest.printHappyMsg(msg);
    assertEquals("\nLike Little Twin Stars, share your dreams with those you trust.\n\n", out.toString());
  }

  /**
   * This test method prints the quiz prompt for fav food
   */
  @Test
  public void testPrintFoodMsg() {
    viewTest.printFoodMsg();
    assertEquals("\nWhat is your favorite food? \n"
        + "Sushi - 1 \n"
        + "Cotton Candy - 2 \n"
        + "Strawberries - 3 \n"
        + "Dark Chocolate - 4 \n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This test method prints the quiz prompt for fav color
   */
  @Test
  public void testPrintColorMsg() {
    viewTest.printColorMsg();
    assertEquals("\nWhat is your favorite color? \n"
        + "Red - 1 \n"
        + "Blue - 2 \n"
        + "Pink - 3 \n"
        + "Black -4 \n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This test method prints the quiz prompt for fav activity
   */
  @Test
  public void testPrintActivityMsg() {
    viewTest.printActivityMsg();
    assertEquals("\nWhat is your favorite activity? \n"
        + "Baking - 1 \n"
        + "Exploring - 2 \n"
        + "Playing music - 3 \n"
        + "Dress-up - 4 \n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This test method prints the quiz prompt for fav item
   */
  @Test
  public void testPrintItemMsg() {
    viewTest.printItemMsg();
    assertEquals("\nWhat is your favorite item? \n"
        + "Chessboard - 1 \n"
        + "Headphones - 2 \n"
        + "Lip gloss - 3 \n"
        + "Skull - 4 \n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This test method prints the quiz prompt for fav sport
   */
  @Test
  public void printSportMsg(){
    viewTest.printSportMsg();
    assertEquals( "\nWhat is your favorite sport? \n"
        + "Chess - 1 \n"
        + "Tennis - 2 \n"
        + "Dance - 3 \n"
        + "Foosball - 4 \n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This test method prints the learn-more about a character information prompt
   */
  @Test
  public void testCharacterInfoPrompt(){
    viewTest.characterInfoPrompt();
    assertEquals("\nWhat character would you like to learn more about: \n"
        + "\nHello Kitty   Enter: h\n"
        + "Cinnamoroll   Enter: c\n"
        + "Badtz-Maru    Enter: b\n"
        + "My Melody     Enter: m\n"
        + "Gudetama      Enter: g\n"
        + "Kuromi        Enter: k\n"
        + "Pompompurin   Enter: p\n"
        + "Lala          Enter: l\n"
        + "\nAnswer: \n\n", out.toString());
  }

  /**
   * This method tests printing an error message
   */
  @Test
  public void testInputErrorMsg(){
    viewTest.inputErrorMsg();
    assertEquals("\nError: Enter a valid input\n\n", out.toString());
  }
  @Test
  public void testPrintGoodBye(){
    viewTest.printGoodbye();
    assertEquals("Have a nice day!", out.toString());
  }

}