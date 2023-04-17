import java.util.ArrayList;
import java.util.Random;

public class Model implements IModel{
  //declare an array to store answer choices in
  private ArrayList<Character> scores = new ArrayList<>();
  //declare a variable to represent the final test score
  private char answer;
  private ArrayList<String> msgs = new ArrayList<>();

  /**
   * This is a constructor of a model object
   */
  public Model(){
    msgs.add("Be yourself like Hello Kitty and let your uniqueness shine!");
    msgs.add("Don't let bad days get you down, be as resilient as My Melody!");
    msgs.add("Spread love and kindness like Cinnamoroll's fluffy clouds!");
    msgs.add("Like Little Twin Stars, share your dreams with those you trust.");
    msgs.add(" Stay positive and keep smiling like Pompompurin!");
    msgs.add("Embrace your creativity like Keroppi and explore new things.");
    msgs.add("Be loyal and caring like Pochacco, and cherish your friendships.");
    msgs.add("Live life to the fullest like Kuromi, and don't be afraid to take risks.");
    msgs.add(" Have a curious spirit like Badtz-Maru and always ask questions.");
    msgs.add(" Keep a positive attitude like Tuxedo Sam, and face challenges with grace.");

  }
  /**
   * This method generates a random number
   * @return a number
   */
  @Override
  public int randNum(){
    //generate a random number from 1-10
    Random rand = new Random();
    int num = rand.nextInt(10) + 1;
    return num;
  }

  /**
   * This method generates a random positive message from a list of messages
   * @return a random message
   */
  @Override
  public String MsgGenerator(int num){
    //return the message in position rand num
    return msgs.get(num);
  }


  /**
   * This method returns a character that most relates to the player
   * @return character
   */
  @Override
  public String getCharacter(){
    return "Test character";
  }
  /**
   * This method stores the answer of the quiz questions
   */
  @Override
  public void setScore(char ans){
    //store the answer into the array
    scores.add(ans);
  }

  /**
   * This method counts the instances of answer scores in a test and returns the character
   * with the highest frequency
   * @return answer
   */
  @Override
  public char getHighestScore(ArrayList<Character> scores){
    int cinnamorollCount = 0;
    int hellokittyCount = 0;
    int kuromiCount = 0;
    int mymeloCount = 0;
    int maxCount = 0;
    char mostFrequentChar = ' ';
    for(int i = 0; i < scores.size(); i++){
        if(scores.get(i) == 'h'){
          hellokittyCount++;
        }
        else if(scores.get(i) == 'c'){
          cinnamorollCount++;
        }
        else if(scores.get(i) == 'k'){
          kuromiCount++;
        }
        else if(scores.get(i) == 'm') {
          mymeloCount++;
        }
        }//end for

        if(hellokittyCount > maxCount) {
          maxCount = hellokittyCount;
          mostFrequentChar = 'h';
        }
        if(cinnamorollCount > maxCount) {
          maxCount = cinnamorollCount;
          mostFrequentChar = 'c';
        }
        if(kuromiCount > maxCount) {
          maxCount = kuromiCount;
          mostFrequentChar = 'k';
        }
        if(mymeloCount > maxCount) {
          maxCount = mymeloCount;
          mostFrequentChar = 'm';
        }
        return mostFrequentChar;
    }




  }//end class

