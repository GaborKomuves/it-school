package challenge_12_Student;

class StudentB extends Marks {
    private int mark1, mark2, mark3, mark4;

    // Constructor
    public StudentB(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }


    @Override
    double getPercentage() {
        int totalMarks = mark1 + mark2 + mark3 + mark4;
        return (totalMarks / 400.0) * 100;
    }
}
