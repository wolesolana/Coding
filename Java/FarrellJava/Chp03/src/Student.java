import java.text.DecimalFormat;

public class Student {
    private String studentID;
    private int creditHours;
    private int creditPointsEarned;

    public Student(String studentID, int creditHours, int creditPointsEarned){
        this.studentID = studentID ;
        this.creditHours = creditHours;
        this.creditPointsEarned = creditPointsEarned;

    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public int getCreditPointsEarned() {
        return creditPointsEarned;
    }

    public void setCreditPointsEarned(int creditPointsEarned) {
        this.creditPointsEarned = creditPointsEarned;
    }

    public void showStudentProfile(){
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Credit Hours: " + getCreditHours());
        System.out.println("Credit Points: " + getCreditPointsEarned());
        System.out.println("GPA: " + calculateGradePointAverage());

    }

    public String calculateGradePointAverage(){
        DecimalFormat twoDecimalAnswer = new DecimalFormat("#.00");
        return twoDecimalAnswer.format(creditPointsEarned * 1.0 / creditHours);
    }

}
