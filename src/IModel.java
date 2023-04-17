import java.util.ArrayList;

public interface IModel {
  int randNum();
  String MsgGenerator(int num);
  String getCharacter();
  char getHighestScore(ArrayList<Character> scores);

  /**
   * This method increments and stores the score of the quiz questions
   */
  void setScore(char ans);

}
