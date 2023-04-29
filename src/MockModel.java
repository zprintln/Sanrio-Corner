import java.util.ArrayList;

/**
 * This Mock Model is used for testing of the Controller class
 *  It implements all methods of the IModel interface
 */
public class MockModel implements IModel {

  private ArrayList<Integer> answers = new ArrayList<>();

  public MockModel() {}

  @Override
  public String MsgGenerator(int num) {
    return "Mock message";
  }

  @Override
  public String getSanrioCharacter() {
    return "Mock character";
  }

  @Override
  public void setAnswers(int ans) {
    answers.add(ans);
  }

  @Override
  public ArrayList<Integer> getAnswersList() {
    return answers;
  }

  @Override
  public int getMostFrequentInt() {
    return 1;
  }
}
