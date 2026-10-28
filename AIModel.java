public class AIModel {
    protected String name;
    protected int[] scores;

    public AIModel(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores;
    }

    public double calculateAverage() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    public String getDescription() {
        return "General-purpose AI assistant";
    }
}
