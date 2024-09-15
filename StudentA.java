package challenge_12_Student;

class StudentA extends Marks{
    private int mark1, mark2, mark3;

    // Constructor
    public StudentA(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }


    @Override
    double getPercentage() {
        int totalMarks = mark1 + mark2 + mark3;
        return (totalMarks / 300.0) * 100;
    }
}
