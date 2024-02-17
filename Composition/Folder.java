import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Folder {
    private String nameOfTheFolder;
    private List<File> files;
    private List<Folder> subfolders;

    public Folder(String nameOfTheFolder) {
        this.nameOfTheFolder = nameOfTheFolder;
        this.files = new ArrayList<>();
        this.subfolders = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubfolder(Folder folder) {
        subfolders.add(folder);
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setSubfolders(List<Folder> subfolders) {
        this.subfolders = subfolders;
    }

    public List<Folder> getSubfolders() {
        return subfolders;
    }

    public void removeFolder(String nameOfTheFolder) {
        subfolders = subfolders.stream()
                .filter(subfolder -> !subfolder.getNameOfTheFolder().equals(nameOfTheFolder))
                .collect(Collectors.toList());
    }

    public void print(int indent) {
        System.out.println(" ".repeat(indent) + "Folder: " + nameOfTheFolder);
        for (Folder subfolder : subfolders) 
        {
            subfolder.print(indent + 4); 
        }
        for (File file : files) 
        {
            file.print(indent + 4); 
        }
    }

    public void setNameOfTheFolder(String nameOfTheFolder) {
        this.nameOfTheFolder = nameOfTheFolder;
    }

    public String getNameOfTheFolder() {
        return nameOfTheFolder;
    }
}
