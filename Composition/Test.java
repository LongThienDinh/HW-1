public class Test {
    public static void main(String[] args) {
        Folder root = createStructure();
        Folder sourceFiles  = root.getSubfolders().get(0);

        System.out.println("Initial Structure:");
        root.print(0);

        sourceFiles.removeFolder("app");
        System.out.println("\nAfter Deleting 'app' Folder:");
        root.print(0);

        sourceFiles.removeFolder("public");
        System.out.println("\nAfter Deleting 'public' Folder:");
        root.print(0);


    }
    
    private static Folder createStructure(){
        Folder php_demo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        sourceFiles.addSubfolder(phalcon);

        Folder app = new Folder("app");
        app.addSubfolder(new Folder("config"));
        app.addSubfolder(new Folder("controllers"));
        app.addSubfolder(new Folder("library"));
        app.addSubfolder(new Folder("migrations"));
        app.addSubfolder(new Folder("models"));
        app.addSubfolder(new Folder("views"));
        php_demo1.addSubfolder(sourceFiles);
        sourceFiles.addSubfolder(app);

        Folder cache = new Folder("cache");
        sourceFiles.addSubfolder(cache);

        Folder publicFolder = new Folder("public");
        sourceFiles.addFile(new File(".htaccess"));
        sourceFiles.addFile(new File("htrouter.php"));
        sourceFiles.addFile(new File("index.html"));
        sourceFiles.addSubfolder(publicFolder);

        php_demo1.addSubfolder(new Folder("Include Path"));
        php_demo1.addSubfolder(new Folder("Remote Files"));

        return php_demo1;
    }
}