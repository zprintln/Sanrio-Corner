import java.util.ArrayList;

public interface IModel {

  /**
   * This method generates a positive Sanrio themed message
   * @param num
   * @return a positive message
   */
  String MsgGenerator(int num);

  /**
   * This method determines the Sanrio character that relates to the user
   * based on inputted quiz answers
   * @return the Sanrio character
   */
  String getSanrioCharacter();

  /**
   * This method stores the inputted quiz answers
   */
  void setAnswers(int ans);

  /**
   * This method returns the most common char type occurring in the user's quiz answer list
   * @return the most frequent char
   */
  int getMostFrequentInt();

  /**
   * This method returns the complete list of user's quiz answers
   * @return entire answer list
   */
  ArrayList<Integer> getAnswersList();


}
