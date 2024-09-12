package Student;

public class Subject {
    //
    private int subjectId;
    private String subjectName;
    private int score;

    public Subject (){}

    public Subject(int subjectId, String subjectName, int score){
        this.subjectId = subjectId;
        this.subjectName = subjectName;
        this.score = score;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getScore() {
        return score;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return " - " + subjectId + " : " + subjectName + score + "점";
    }
}
