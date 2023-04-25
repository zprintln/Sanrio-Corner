import java.util.ArrayList;
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
