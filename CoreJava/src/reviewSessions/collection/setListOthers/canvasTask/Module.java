package reviewSessions.collection.setListOthers.canvasTask;

import java.util.ArrayList;

public class Module {
    // Finish the Module class
    String name;
    ArrayList<File>files;

    public Module(String name) {
        this.name = name;
        files=null;

    }

    public Module(String name, ArrayList<File> files) {
        this.name = name;
        this.files = files;
    }

    public void addFile(File object){
        files.add(object);
    }

    public void removeFile(File object){
        files.removeIf(p->p.equals(object));
    }

    @Override
    public String toString() {
        return name +"\n"+
                "Files:" + "\n"+
                files;
    }
}