class Course 
{
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) 
    {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void printDetailsOfTheCourse() 
    {
        System.out.println("Course: " + name);
        System.out.println("Instructor: " + instructor.getFirstNameOfProfessor() + " " + instructor.getLastNameOfProfessor() + ", Office: " + instructor.getOfficeNumberOfProfessor());
        System.out.println("Textbook: " + textbook.getTitleOfTextbook() + " by " + textbook.getAuthorOfTextbook() + " published by "+ textbook.getPublisherOfTextbook());
    }
}
