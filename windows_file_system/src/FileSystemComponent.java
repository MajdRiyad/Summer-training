public abstract class FileSystemComponent {

    private String name;
    private FileSystemComponent next;
    private FileSystemComponent previous;

    public FileSystemComponent(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    public FileSystemComponent getNext() {
        return next;
    }

    public void setNext(FileSystemComponent next) {
        this.next = next;
    }

    public FileSystemComponent getPrevious() {
        return previous;
    }

    public void setPrevious(FileSystemComponent previous) {
        this.previous = previous;
    }

    abstract void open();
    abstract FileSystemComponent close();
    public String getPath(){
        StringBuilder path = new StringBuilder();
        FileSystemComponent component = this;
        while (component != null){
            path.insert(0, "/"+component.getName());
            component = component.getPrevious();

        }
        return path.toString();
    }



}
