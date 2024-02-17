public class SecondTest {
    public static void main(String[] args) {
        Course course = new Course("Software Engineering");

        course.addInstructor(new Instructor("Nima", "Davarpanah", "3-2636"));
        course.addTextbook(new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall"));
        course.addInstructor(new Instructor("Jane", "Doe", "4-5678"));
        course.addTextbook(new Textbook("Refactoring", "Martin Fowler", "Addison-Wesley"));
        course.printDetailsOfTheCourse();
    }
}