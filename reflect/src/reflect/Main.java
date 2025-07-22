package reflect;

import java.lang.reflect.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Majd");
		/*
		 if you using something that inherited, replace...
		 getDeclaredField ---> getField
		 getDeclaredMethod ---> getMethod
		 */
		
		
		//System.out.println(p.name);--> Error , not accessible 
		
		try {
			
			Field field = p.getClass().getDeclaredField("name");
			field.setAccessible(true);
			System.out.println(field.get(p));
			
		}catch (Exception e ) {
			e.printStackTrace();
		}
		 try {
			 	System.out.println("----->Get the static Data<-------");
	            Field field = Person.class.getDeclaredField("numPeople");
	            field.setAccessible(true);
	            System.out.println(field.get(null));
	        }
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        /*
	        ... 
	         */
	        
	         //System.out.println(p.getName());
	        
	        try {
	        	System.out.println("----->Get the value in getMethod<-------");
	            Method method = p.getClass().getDeclaredMethod("getName");
	            System.out.println(method.invoke(p));
	        }
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        /*
	        ...
	         */
	        
//	        p.setName("PogoStick29");
//	        System.out.println(p.getName());
//	        p.setName("Pogo");
	        
	        try {
	        	System.out.println("----->set the value in setMethod<-------");
	            Method method = p.getClass().getDeclaredMethod("setName", String.class);
	            method.invoke(p, "Majd Riyad");
	            System.out.println(p.getName());
	        }
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        /*
	        ...
	         */
	        
	       // Person.printPerson(p);
	        
	        try {
	        	System.out.println("----->get a static method <-------");
	            Method method = Person.class.getDeclaredMethod("printPerson", Person.class);
	            method.invoke(null, p);
	        }
	        
	        catch (Exception e) {
	            e.printStackTrace();
	        }
	        
	        /*
	        ...
	         */
	        
	       // Person other = new Person("Ogop");
//	        Person.printPerson(other);
	        
	        try {
	        	System.out.println("----->Create an obj<-------");
	            Constructor<Person> constructor = Person.class.getDeclaredConstructor(String.class);
	            Person  other = constructor.newInstance("Riyad");
	            Person.printPerson(other);
	        }
	        
	        catch (Exception e) {
	       
	            e.printStackTrace();
	        }	
	
	}	
}
