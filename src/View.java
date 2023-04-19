import java.sql.SQLOutput;

public class View implements IView {

  /**
   * This method displays a Sanrio character
   */
  @Override
  public void displayCharacter(String sanrio){
    System.out.println("\nYour Sanrio character is: " + sanrio);
    System.out.println("\n");

  }
  @Override
  public void characterInfoPrompt(){
    System.out.println("\nWhat character would you like to learn more about: \n"
        + "\nHello Kitty   Enter: h\n"
        + "Cinnamoroll   Enter: c\n"
        + "Badtz-Maru    Enter: b\n"
        + "My Melody     Enter: m\n"
        + "Gudetama      Enter: g\n"
        + "Kuromi        Enter: k\n"
        + "Pompompurin   Enter: p\n"
        + "Lala          Enter: l\n"
        + "\nAnswer: \n");
  }
  @Override
  public void inputErrorMsg(){
    System.out.println("\nError: Enter a valid input\n");
  }

  /**
   * This method prints a Sanrio character info based on user choice
   * @param choice
   */
  @Override
  public void printCharacterInfo(char choice){
    switch(choice){
      case 'h':
        System.out.println(
            "\nName: Hello Kitty\n"
                + "Species: Cat\n"
                + "Gender: Female\n"
                + "Personality: Sweet, caring, and curious. \n"
                + "Likes: Apples, baking, and spending time with her friends.\n"
                + "Dislikes: Rainy days and being alone.\n"
                + "\n   Hello Kitty loves making friends and exploring new things. \n"
                + "   She is also very determined and always tries her best.\n");
        break;
      case 'c':
        System.out.println(
            "\nName: Cinnamoroll\n"
                + "Species: Puppy\n"
                + "Gender: Male\n"
                + "Personality: Cheerful, optimistic, and friendly. \n"
                + "Likes: Flying with his long ears, cinnamon rolls, and spending time with his friends.\n"
                + "Dislikes: Bullies and anyone who is mean to his friends.\n"
                + " \n  Cinnamoroll loves making new friends and spreading happiness wherever he goes. \n"
                + "  He is also quite curious and loves to explore new places.\n");
        break;
      case 'm':
        System.out.println(
            "\nName: My Melody\n"
                + "Species: Rabbit\n"
                + "Gender: Female\n"
                + "Personality: Sweet, kind-hearted, and gentle. \n"
                + "Likes: Baking, playing the piano, and spending time with her best friend, a mouse named Flat.\n"
                + "Dislikes: Conflict and loud noises.\n"
                + "\n   My Melody is very shy but loves spending time with her friends and helping others.\n"
                + "   She is also quite resilient and won't give up easily.\n");
        break;
      case 'k':
        System.out.println(
              "\nName: Kuromi\n"
                  + "Species: Rabbit\n"
                  + "Gender: Female\n"
                  + "Personality: Mischievous, sassy, and confident. \n"
                  + "Likes: Goth fashion, playing pranks, and collecting skulls.\n"
                  + "Dislikes: Being told what to do and anything too cute.\n"
                  + " \n   Kuromi is a bit of a troublemaker but also has a caring side. \n"
                  + "   She enjoys making jokes and teasing her friends, but will \n"
                  + "   always have their back when they need her.\n");
        break;
      case 'p':
        System.out.println(
            "\nName: Pompompurin\n"
                + "Species: Golden Retriever\n"
                + "Gender: Male\n"
                + "Personality: Happy-go-lucky, easygoing, and friendly. \n"
                + "Likes: Pudding, his brown beret, and his best friend, a mouse named Muffin.\n"
                + "Dislikes: Getting up early, spicy food, and anything too scary.\n"
                + "\n   Pompom loves napping, eating pudding, and hanging out with his friends. \n"
                + "   He's also quite curious and loves to explore his surroundings.\n");
        break;
      case 'b':
        System.out.println(
            "\nName: Badtz-Maru\n"
                + "Species: Penguin\n"
                + "Gender: Male\n"
                + "Personality: Mischevious, sarcastic, and stubborn. \n"
                + "Likes: Playing pranks, music, and martial arts.\n"
                + "Dislikes: Rules and anyone who tells him what to do.\n"
                + "\n   Badtz-Maru likes to keep things cool and is often seen wearing sunglasses. \n"
                + "   He has a rebellious spirit but also a caring side.\n");
        break;
      case 'l':
        System.out.println(
            "\nName: Lala\n"
                + "Species: Star fairy\n"
                + "Gender: Female\n"
                + "Personality: Dreamy, kind, and whimsical. \n"
                + "Likes: Star gazing, sleeping in clouds, and spreading happiness.\n"
                + "Dislikes: Negative vibes and anything that would disturb her peace.\n"
                + "\n   Lala loves exploring the universe and meeting new friends. \n"
                + "   She is also very close to her brother Kiki, they share a strong bond.\n");
        break;
      case 'g':
        System.out.println(
            "\nName: Gudetama\n"
                + "Species: Egg\n"
                + "Gender: Unknown\n"
                + "Personality: Lazy, unmotivated, and apathetic. \n"
                + "Likes: Sleeping, being left alone, and eating egg dishes.\n"
                + "Dislikes: Being poked, prodded, or bothered in any way.\n"
                + "\n   Gudetama is a little egg with a big personality. \n"
                + "   He doesn't like to do much and would rather lay around all day. \n"
                + "   He's often seen sleeping or lounging in his shell.\n");
        break;
      default:
        System.out.println("Type a letter to learn about a character:\n");
        break;
    }
  }

  /**
   * This method prompts a user for a number to print a positive message
   */
  @Override
  public void happyMsgPrompt(){
    System.out.println("\nEnter a number to from 1-10 to get a positive message: \n");
  }
  /**
   * This method prints a positive message
   */
  @Override
  public void printHappyMsg(String msg){
    System.out.println(msg);
  }

  /**
   * This method prints a quiz prompt for fav food
   */
  @Override
  public void printFoodMsg(){
    System.out.println("\nWhat is your favorite food? \n"
        + "Sushi - 1 \n"
        + "Cotton Candy - 2 \n"
        + "Strawberries - 3 \n"
        + "Dark Chocolate - 4 \n"
        + "\nAnswer: \n");
  }

  /**
   * This method prints a quiz prompt for fav color
   */
  @Override
  public void printColorMsg(){
    System.out.println("\nWhat is your favorite color? \n"
        + "Red - 1 \n"
        + "Blue - 2 \n"
        + "Pink - 3 \n"
        + "Black -4 \n"
        + "\nAnswer: \n");
  }

  /**
   * This method prints a quiz prompt for fav activity
   */
  @Override
  public void printActivityMsg(){
    System.out.println("\nWhat is your favorite activity? \n"
        + "Baking - 1 \n"
        + "Exploring - 2 \n"
        + "Playing music - 3 \n"
        + "Dress-up - 4 \n"
        + "\nAnswer: \n");
  }

  /**
   * This method prints a quiz prompt for fav item
   */
  @Override
  public void printItemMsg(){
    System.out.println("\nWhat is your favorite item? \n"
        + "Chessboard - 1 \n"
        + "Headphones - 2 \n"
        + "Lip gloss - 3 \n"
        + "Skull - 4 \n"
        + "\nAnswer: \n");
  }
  /**
   * This method prints a quiz prompt for fav sport
   */
  @Override
  public void printSportMsg(){
    System.out.println("\nWhat is your favorite item? \n"
        + "Chess - 1 \n"
        + "Tennis - 2 \n"
        + "Dance - 3 \n"
        + "Foosball - 4 \n"
        + "\nAnswer: \n");
  }
}
