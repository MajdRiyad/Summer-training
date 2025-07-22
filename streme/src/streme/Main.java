package streme;

import java.util.*;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperation {
	int x= 9 ;
    int operate(int a, int b);
    
}

class Test implements MathOperation{

	@Override
	public int operate(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class Main {

	public static void main(String[] args) {
	
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Majd",100));
		people.add(new Person("Riyad",500));
		people.add(new Person("Abeer",900));
		people.add(new Person("leen",90));
		
//		List <Person> filterList = new ArrayList<>();
		
		List <Person> filterList =people.stream()
		.filter(Person -> Person.getMoney() >=100)
		.sorted(Comparator.comparing(Person -> Person.getName())).collect(Collectors.toList());		
	//	filterList.forEach(Person -> System.out.println(Person.getName()));
		
	//	System.out.println("======================================");
		
		List<Person> sortedList = people.stream().sorted(Comparator.comparing(Person -> Person.getMoney())).collect(Collectors.toList());
		//sortedList.forEach(Person -> System.out.println(Person.getName()));
	
		//Cat myCat = new Cat();
		//myCat.print();
		
		// using lambda ->
//	Printeable printMeow = ()-> System.out.println("Meow");;
//		printThing(printMeow);
//		
		MathOperation addition = (a, b) -> a + b;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(5, 3)); // Output: 8
        System.out.println("Multiplication: " + multiplication.operate(5, 3)); // Output: 15
			
	}
public static void printThing (Printeable thing ) {
	thing.print();
}
	
/*
	 - The lambda expression is :
		 method ( (the parameter of the interface)->{
		  	// the implement of the method   
		 };);
		 
	 - if it single do it can be write without {} like :
	 		 method ( (the parameter of the interface)->// the implement of the method);
	 
	 - it can be put in variable with type of the interface as :
	   	interface example = ()->{}; 
	 
*/
}
