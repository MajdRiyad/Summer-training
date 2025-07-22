import java.io.Serializable;

class Pojo{
/*
 pojo ---> plain java old object.
 any java object is a pogo.
 1- can't extend anything (can't be a subclass).
 2- can't implement anything.
 3- no outside annotation.
 */
    private String text;
    private int number;

}

class JavaBean implements Serializable {
    /*
     java bean is must have:
        1- no-argument constructor
        2- getter // setter
        3- serializable
     */
    public JavaBean(){

    }

    private String text;
    private int number;

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

}
/*
*Spring bean: Any java object that managed by Spring.
    - Spring uses ioc container (Bean Factory or Application Context) to manage these objects.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}