package student;

public class Student implements Cloneable{
    private int id;
    private String name;
    private Note notes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Note getNotes() {
        return notes;
    }

    public void setNotes(Note notes) {
        this.notes = notes;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(int id, String name, Note notes) {
        this.id = id;
        this.name = name;
        this.notes = new Note(10, "Java");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student copy = new Student(0,"");
        copy.setId(this.id);
        copy.setName(this.name);
        Note note = new Note(this.getNotes().getGrade(), this.getNotes().getClassName());
        copy.setNotes(note);

        return super.clone();
    }
}
