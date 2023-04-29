import java.util.ArrayList;

/**
 * This Mock Model is used for testing purposes
 * It implements all methods of the IModel interface
 */
public class MockModel implements IModel {

  private ArrayList<Integer> answers = new ArrayList<>();

  /**
   * Constructor for the mock model
   */
  public MockModel() {}

  /**
   * This method generates a mock message
   * @param num the index of the message to be printed
   * @return mock message string
   */
  @Override
  public String MsgGenerator(int num) {
    return "Mock message";
  }

  /**
   * This method returns a mock sanrio character
   * @return mock character string
   */
  @Override
  public String getSanrioCharacter() {
    return "Mock character";
  }

  /**
   * This method sets the quiz answers into a list
   * @param ans the user number choice
   */
  @Override
  public void setAnswers(int ans) {
    answers.add(ans);
  }

  /**
   * This method returns the list of quiz answers
   * @return list of answers
   */
  @Override
  public ArrayList<Integer> getAnswersList() {
    return answers;
  }

  /**
   * This method returns 1 as the most frequent integer of the quiz
   * @return 1
   */
  @Override
  public int getMostFrequentInt() {
    return 1;
  }
}
