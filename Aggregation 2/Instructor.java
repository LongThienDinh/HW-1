class Instructor 
{
    private String firstNameOfProfessor;
    private String lastNameOfProfessor;
    private String officeNumberOfProfessor;

    public Instructor(String firstNameOfProfessor, String lastNameOfProfessor, String officeNumberOfProfessor) 
    {
        this.firstNameOfProfessor = firstNameOfProfessor;
        this.lastNameOfProfessor = lastNameOfProfessor;
        this.officeNumberOfProfessor = officeNumberOfProfessor;
    }

    public void setFirstNameOfProfessor(String firstNameOfProfessor) 
    { 
        this.firstNameOfProfessor = firstNameOfProfessor; 
    }

    public void setLastNameOfProfessor(String lastNameOfProfessor) 
    { 
        this.lastNameOfProfessor = lastNameOfProfessor; 
    }

    public void setOfficeNumberOfProfessor(String officeNumberOfProfessor) 
    { 
        this.officeNumberOfProfessor = officeNumberOfProfessor; 
    }

    public String getFirstNameOfProfessor() 
    { 
        return firstNameOfProfessor; 
    }

    public String getLastNameOfProfessor() 
    { 
        return lastNameOfProfessor; 
    }

    public String getOfficeNumberOfProfessor() 
    { 
        return officeNumberOfProfessor; 
    }
}