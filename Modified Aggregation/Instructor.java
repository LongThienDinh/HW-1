class Instructor {
    private String firstNameOfInstructor;
    private String lastNameOfInstructor;
    private String officeNumberInstructor;

    public Instructor(String firstNameOfInstructor, String lastNameOfInstructor, String officeNumberInstructor) {
        this.firstNameOfInstructor = firstNameOfInstructor;
        this.lastNameOfInstructor = lastNameOfInstructor;
        this.officeNumberInstructor = officeNumberInstructor;
    }

    public void setFirstNameOfInstructor(String firstNameOfInstructor) { 
        this.firstNameOfInstructor = firstNameOfInstructor; 
    }

    public String getFirstNameOfInstructor() { 
        return firstNameOfInstructor; 
    }

    public void setLastNameOfInstructor(String lastNameOfInstructor) { 
        this.lastNameOfInstructor = lastNameOfInstructor; 
    }

    public String getLastNameOfInstructor() { 
        return lastNameOfInstructor; 
    }

    public void setOfficeNumberInstructor(String officeNumberInstructor) { 
        this.officeNumberInstructor = officeNumberInstructor; 
    }

    public String getOfficeNumberOfInstructor() { 
        return officeNumberInstructor; 
    }
}