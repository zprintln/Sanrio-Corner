import java.util.ArrayList;

public class Model implements IModel{
  //declare an array to store answer choices in
  private ArrayList<Character> scores = new ArrayList<>();
  //declare a variable to represent the final test score
  private char answer;

  /**
   * This method generates a random positive message from a list of messages
   * @return a random message
   */
  @Override
  public String randomMsgGenerator(){
    return "Test string";
  }

  /**
   * This method returns a positive message
   * @return a positive message
   */
  @Override
  public String getPositiveMsg(){
    return randomMsgGenerator();
  }
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

