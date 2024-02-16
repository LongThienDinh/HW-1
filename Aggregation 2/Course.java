import java.util.ArrayList;
import java.util.List;

class Course {
    private String name;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String name) {
        this.name = name;
        this.instructors = new ArrayList<>();
        this.textbooks = new ArrayList<>();
    }

    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    public void addTextbook(Textbook textbook) {
        textbooks.add(textbook);
    }

    public void printDetailsOfTheCourse() {
        System.out.println("Course: " + name);

        for (int i = 0; i < instructors.size(); i++) {
            Instructor instructor = instructors.get(i);
            Textbook textbook = textbooks.get(i);

            System.out.println("Instructor: " + instructor.getFirstNameOfProfessor() + " " +
                               instructor.getLastNameOfProfessor() + ", Office: " +
                               instructor.getOfficeNumberOfProfessor());

            System.out.println("Textbook: " + textbook.getTitleOfTextbook() + " by " +
                               textbook.getAuthorOfTextbook() + " published by " +
                               textbook.getPublisherOfTextbook());
        }
    }
}