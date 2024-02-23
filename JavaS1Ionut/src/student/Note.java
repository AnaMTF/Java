package student;

public class Note {
    private float grade;
    private String className;

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Note(float grade, String className) {
        this.grade = grade;
        this.className = className;
    }
}
