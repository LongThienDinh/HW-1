class File {
    private String nameOfTheFile;

    public File(String nameOfTheFile) {
        this.nameOfTheFile = nameOfTheFile;
    }

    public void print(int indent) {
        System.out.println(" ".repeat(indent) + "File: " + nameOfTheFile);
    }

    public void setNameOfTheFile(String nameOfTheFile) {
        this.nameOfTheFile = nameOfTheFile;
    }

    public String getNameOfTheFile() {
        return nameOfTheFile;
    }
}