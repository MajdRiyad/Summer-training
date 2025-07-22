/*
===================================  What do I use, Abstract Class or Interface? ===========================
---> Here are some scenarios where using an abstract class might be more appropriate than using an interface:
        1- know something about behavior
        2- Sharing State and Behavior
        3- Template Method Pattern
        4- Need to concrete method

 ---> Here are some scenarios where using an interface might be more appropriate than using an abstract class:

        1- Know nothing about behavior
        2- Multiple Inheritance
        3- Unrelated Classes
        4- Defining a Contract


 */
// ======================================== Abstract Class ======================================

//1- Example for know something about behavior
abstract class  Shape{
    public abstract void draw();

    public void display(){
        System.out.println("Displaying shape...");
        this.draw();
    }
}
class  Ciecle extends Shape{
    @Override
    public void draw() {
        System.out.println("Drawing Ciecle...");
    }
}

// 2- Example for know something about behavior
// You need to share state (fields) and behavior (methods) among subclasses.

abstract class Vehicle {
    String type ;

    public Vehicle(String type){
        this.type = type;
    }
    public abstract void move();
    public void display(){
        System.out.println("Displaying vehicle type " + this.type);
    }
}

class Car extends Vehicle{
    public Car(String type){
        super(type);
    }
    @Override
    public void move(){
        System.out.println("Moving Car");
    }
}
//3- Template Method Pattern
//You want to use a method to define the general structure of an algorithm, leaving some steps to subclasses.
abstract class Game{
    public final void play(){ //  A final method cannot be overridden in any subclass.
        initialize();
        startPlay();
        endPlay();
    }
    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();
}

class Chess extends Game{
    @Override
    public void initialize() {
        System.out.println("Initializing Chess");
        System.out.println("*******************");
    }

    @Override
    public void startPlay() {
        System.out.println("Starting Chess");
        System.out.println("*******************");
    }
    public void endPlay() {
        System.out.println("Ending Chess");
        System.out.println("*******************");
    }
}
// 4-  Sharing State and Behavior && need to concrete method
abstract class Employee {
    private String name;


    public Employee(){
        this.name = "Majd";

    }
    public abstract int getSalary();

    public String getName() {
        return name;
    }
}
class HourlyEmployee extends Employee{
    private int hours;
    private  int price ;
    public HourlyEmployee(){
        super();
        hours=4;
        price=50;
    }

    @Override
    public int getSalary() {
        return this.hours* this.price;
    }
}
class SalaryEmployee extends Employee{
    private int salary;
    public SalaryEmployee(){
        super();
        salary=500;
    }
    public int getSalary() {
        return salary;
    }
}

/// ================================= Interface ================================================================

//1- Know nothing about behavior

interface edible {
    void eat() ;
}
class IslamicPerson implements edible{
    @Override
    public void eat() {
        System.out.println("Halal...");
    }
}
class ChinesePerson implements edible{

    @Override
    public void eat() {
        System.out.println("eats everything...");
    }
}
//2- Multiple Inheritance

interface Flyable {
    void fly();
    default void  majd(){
        System.out.println("Majd");
    }
    default void honk() {
        System.out.println("Honking...");
    }
}

interface Swimmable {
    void  majd();
    void swim();
}

class Duck implements Flyable, Swimmable {
    @Override
    public void fly() {
        System.out.println("Duck is flying...");
    }
    public void majd() {
        Flyable.super.majd();
    }
    @Override
    public void honk() {
      //  Flyable.super.honk();
        System.out.println("majd...");

    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming...");
    }
}

//3- Unrelated Classes
//If you have several classes that are not related by inheritance but share common functionality.

interface Audible {
    void makeSound();
}

class Dog implements Audible {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class AlarmClock implements Audible {
    @Override
    public void makeSound() {
        System.out.println("Ring");
    }
}

//4- Defining a Contract
/*
    "defining a contract" refers to creating a set of methods that a class needs to implement.
    This idea makes sure that all the methods listed in an interface have concrete implementations for any class that claims to follow it.
    Without specifying how the techniques must perform, this contract defines what they must do.
 */
interface Animal {
    void makeSound();
    void move();
}
class Wolf implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Wolf says: Woof!");
    }

    @Override
    public void move() {
        System.out.println("Wolf is running");
    }
}

class Bird implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bird says: Tweet!");
    }

    @Override
    public void move() {
        System.out.println("Bird is flying");
    }
}






public class Main {
    public static void main(String[] args) {

        Ciecle c = new Ciecle();
        Shape s = new Ciecle();
        Chess cc = new Chess();
        Employee majd =new SalaryEmployee();
        Employee majd2 =new HourlyEmployee();
        new IslamicPerson();
        new ChinesePerson();
        new Wolf();
        new Bird();
        
        System.out.println("Emp name: "+majd.getName()+" and has salary is: "+majd.getSalary());




    }
}