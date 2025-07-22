public class File extends FileSystemComponent {

    public File(String name){
        super(name);
        this.setPrevious(null);
        this.setNext(null);

    }

    public void open(){
        System.out.println(getName());

    }
    public FileSystemComponent close(){
        System.out.println("closing..."+getName());
        return this.getPrevious();
    }




}
