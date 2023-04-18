public class View implements IView {

  /**
   * This method displays a Sanrio character
   */
  @Override
  public void displayCharacter(String sanrio){
    System.out.println("Your character is: " ) ;
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
            "Name: Hello Kitty\n"
                + "Species: Cat\n"
                + "Gender: Female\n"
                + "Personality: Sweet, caring, and curious. She loves making friends and exploring new things. "
                + "She is also very determined and always tries her best.\n"
                + "Likes: Apples, baking, and spending time with her friends.\n"
                + "Dislikes: Rainy days and being alone.");
        break;
      case 'c':
        System.out.println(
            "Name: Cinnamoroll\n"
                + "Species: Puppy\n"
                + "Gender: Male\n"
                + "Personality: Cheerful, optimistic, and friendly. "
                + "He loves making new friends and spreading happiness wherever he goes. "
                + "He is also quite curious and loves to explore new places.\n"
                + "Likes: Flying with his long ears, cinnamon rolls, and spending time with his friends.\n"
                + "Dislikes: Bullies and anyone who is mean to his friends.");
        break;
      case 'm':
        System.out.println(
            "Name: My Melody\n"
                + "Species: Rabbit\n"
                + "Gender: Female\n"
                + "Personality: Sweet, kind-hearted, and gentle. "
                + "She is very shy but loves spending time with her friends and helping others. "
                + "She is also quite resilient and won't give up easily.\n"
                + "Likes: Baking, playing the piano, and spending time with her best friend, a mouse named Flat.\n"
                + "Dislikes: Conflict and loud noises.");
        break;
      case 'k':
        System.out.println(
              "Name: Kuromi\n"
                  + "Species: Rabbit\n"
                  + "Gender: Female\n"
                  + "Personality: Mischievous, sassy, and confident. "
                  + "She is a bit of a troublemaker but also has a caring side. "
                  + "She enjoys making jokes and teasing her friends but will always have their back when they need her.\n"
                  + "Likes: Goth fashion, playing pranks, and collecting skulls.\n"
                  + "Dislikes: Being told what to do and anything too cute.");
        break;
      case 'p':
        System.out.println(
            "Name: Pompompurin\n"
                + "Age: 5 dog years\n"
                + "Species: Golden Retriever\n"
                + "Gender: Male\n"
                + "Personality: Happy-go-lucky, easygoing, and friendly. He loves napping, "
                + "eating pudding, and hanging out with his friends. He's also quite curious and loves to explore his surroundings.\n"
                + "Likes: Pudding, his brown beret, and his best friend, a mouse named Muffin.\n"
                + "Dislikes: Getting up early, spicy food, and anything too scary.\n");
        break;
      case 'b':
        System.out.println(
            "Name: Badtz-Maru\n"
                + "Species: Penguin\n"
                + "Gender: Male\n"
                + "Personality: Mischevious, sarcastic, and stubborn. "
                + "He likes to keep things cool and is often seen wearing sunglasses. "
                + "He has a rebellious spirit but also a caring side.\n"
                + "Likes: Playing pranks, music, and martial arts.\n"
                + "Dislikes: Rules and anyone who tells him what to do.");
        break;
      case 'l':
        System.out.println(
            "Name: Kiki and Lala\n"
                + "Species: Star fairies\n"
                + "Gender: Female\n"
                + "Personality: Dreamy, kind, and whimsical. "
                + "They love exploring the universe and meeting new friends. "
                + "They are also very close to each other and share a strong bond.\n"
                + "Likes: Star gazing, sleeping in clouds, and spreading happiness.\n"
                + "Dislikes: Negative vibes and anything that would disturb their peace.");
        break;
      case 'g':
        System.out.println(
            "Name: Gudetama\n"
                + "Species: Egg\n"
                + "Gender: Unknown\n"
                + "Personality: Lazy, unmotivated, and apathetic. "
                + "Gudetama is a little egg with a big personality. "
                + "He doesn't like to do much and would rather lay around all day. "
                + "He's often seen sleeping or lounging in his shell.\n"
                + "Likes: Sleeping, being left alone, and eating egg dishes.\n"
                + "Dislikes: Being poked, prodded, or bothered in any way.");
        break;
      default:
        System.out.println("Type a letter to learn about a character!");
        break;
    }
  }

  /**
   * This method prints a positive message
   */
  public void printHappyMsg(){
    System.out.println("Enter a number to from 1-10 to get a positive message: \n");
  }

  /**
   * This method prints a quiz prompt for fav food
   */
  public void printFoodMsg(){
    System.out.println("What is your favorite food: \n"
        + "Sushi - 1 \n"
        + "Cotton Candy - 2 \n"
        + "Strawberries - 3 \n"
        + "Dark Chocolate - 4 \n");
  }

  /**
   * This method prints a quiz prompt for fav color
   */
  public void printColorMsg(){
    System.out.println("What is your favorite color: \n"
        + "Red - 1 \n"
        + "Blue - 2 \n"
        + "Pink - 3 \n"
        + "Black -4 \n");
  }

  /**
   * This method prints a quiz prompt for fav activity
   */
  public void printActivityMsg(){
    System.out.println("What is your favorite activity: \n"
        + "Baking - 1 \n"
        + "Exploring - 2 \n"
        + "Playing music - 3 \n"
        + "Dress-up - 4 \n");
  }

  /**
   * This method prints a quiz prompt for fav item
   */
  public void printItemMsg(){
    System.out.println("What is your favorite item: \n"
        + "Chessboard - 1 \n"
        + "Headphones - 2 \n"
        + "Lip gloss - 3 \n"
        + "Skull - 4 \n");
  }

}
