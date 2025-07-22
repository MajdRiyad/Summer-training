import java.util.ArrayList;
import java.util.List;

public class Directory extends FileSystemComponent{
    private List<FileSystemComponent> components;

    public Directory(String name){
        super(name);
        this.setPrevious(null);
        this.components = new ArrayList<>();
    }
    public void add(FileSystemComponent component) {
        component.setPrevious(this);
        components.add(component);
    }

    public void remove(FileSystemComponent component) {

        components.remove(component);
    }
    public void open(){
        //System.out.println("Directory: " + getName());
        for (FileSystemComponent component : components) {



            if (component instanceof File) {
                component.open();
            }
            else{
                System.out.println(component.getName()+"\\");
            }
        }

    }
    public FileSystemComponent move(String name){
        FileSystemComponent newComponent = null;
        for (FileSystemComponent component : components) {
            if (component.getName().equals(name)){
                newComponent= component;
            }
        }
        return newComponent;
    }
    public FileSystemComponent close(){
        return this.getPrevious();
    }


}
