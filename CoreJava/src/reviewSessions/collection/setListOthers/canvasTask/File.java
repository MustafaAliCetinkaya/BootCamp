package reviewSessions.collection.setListOthers.canvasTask;

public class File {
    // Finish the File class
    String name;
    double size;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void openFile(){
        System.out.println("Opening "+name);
    }

    @Override
    public String toString() {
        return "File{" + name + " | " + size +" mb}";
    }
}
