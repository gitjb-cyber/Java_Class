package ArrayList;

public class Subject {

    private String name;
    private int scorePoint;

    public Subject (String name, int score){
        this.name = name;
        this.scorePoint = score;
    }

    public String getName() { // GET 은 변수값을 반환
        return name;
    }

    public void setName(String name) { // SET 은 변수값을 할당
        this.name = name;
    }

    public int getScorePoint() {
        return scorePoint;
    }

    public void setScorePoint(int scorePoint) {
        this.scorePoint = scorePoint;
    }

}
