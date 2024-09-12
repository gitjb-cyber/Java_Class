package ArrayList;

// 학생 -> 과목리스트, 과목 추가 기능, 과목내역 출력 기능

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(){}

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    // getter, setter


    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubject(String name, int score){  //ArrayList<Subject> subjectList; 과목을 등록시키는 함수
        Subject subject = new Subject(name, score);

        // 매개변수로 받아온 값을 set 메서드를 통해서 객체에 저장
        /*
        subject.setName(name);
        subject.setScorePoint(score);
        */

        // ArrayList 에 객체 추가
        subjectList.add(subject);
    }

    public void showStudentInfo(){

        // 객체간 협력
        int total = 0;

        // 객체를 하나씩 꺼내와서, 그 안에 들어있는 점수를 꺼낸다.
        // - get 메서드로 꺼내온다

        for(Subject s : subjectList){

            total += s.getScorePoint();
            System.out.println(
                    "학생 " + studentName + "의 " + s.getName()          // s.getName() = 과목명
                            + "과목 성적은 " + s.getScorePoint() + "점 입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점 : " + total);
    }

    @Override
    public String toString() {
        return studentID + " / " + studentName;
    }
}
