import java.util.ArrayList;
import java.util.Random;

public class Model implements IModel{
  //declare an array to store answer choices in
  private ArrayList<Integer> answers = new ArrayList<>();
  //declare a variable to represent the final answers list
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
  public String getSanrioCharacter(){
    int answer = getMostFrequentInt();
    if(answer == 1){
      return "Hello Kitty";
    }
    else if(answer == 2){
      return "Cinnamoroll";
    }
    else if(answer == 3){
      return "My Melody";
    }
    else if(answer == 4){
      return "Kuromi";
    }
    return "No character match";
  }
  /**
   * This method stores the answer of the quiz questions
   */
  @Override
  public void setAnswers(int ans){
    //store the answer into the array
    answers.add(ans);
  }

  /**
   * This method returns the list of
   * @return
   */
  @Override
  public ArrayList<Integer> getAnswersList(){
    return answers;
  }

  /**
   * This method counts the instances of answer answers in a test and returns the character
   * with the highest frequency
   * @return answer
   */
  @Override
  public int getMostFrequentInt(){
    int cinnamorollCount = 0;
    int hellokittyCount = 0;
    int kuromiCount = 0;
    int mymeloCount = 0;
    int maxCount = 0;
    char mostFrequentInt = 0;
    for(int i = 0; i < answers.size(); i++){
        if(answers.get(i) == 1){
          hellokittyCount++;
        }
        else if(answers.get(i) == 2){
          cinnamorollCount++;
        }
        else if(answers.get(i) == 3) {
          mymeloCount++;
        }
        else if(answers.get(i) == 4){
          kuromiCount++;
        }
        }//end for

        if(hellokittyCount > maxCount) {
          maxCount = hellokittyCount;
          mostFrequentInt = 1;
        }
        if(cinnamorollCount > maxCount) {
          maxCount = cinnamorollCount;
          mostFrequentInt = 2;
        }
        if(mymeloCount > maxCount) {
          maxCount = mymeloCount;
          mostFrequentInt = 3;
        }
        if(kuromiCount > maxCount) {
          maxCount = kuromiCount;
          mostFrequentInt = 4;
        }
        return mostFrequentInt;
    }

  }//end class

