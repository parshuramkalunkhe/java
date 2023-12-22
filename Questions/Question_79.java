//Q.79. String 

/*
 # String 
  	1. String is a group of characters but in Java String is a class which is present inside java.lang.package.
  	2. It is a final class that is it can not have any sub class.
  	3. String class is used to create immutable String Objects.
  	4. String class inherits CharaSequence interface, Comparable interface, and Serializable interface.
 
Q. How to create string objects :
A: 1. Using String literal --> String s = "Java.";
   2. Using new keyword --> String s = new String("Java.");
   
   (1). if we create a string object using String literal object is created inside string constant pool area that is present inside heap area.
   (2). The jvm first check the string constant pool if there is an object with the same data  if yes then address of the same object is return. if no then it will create a new object in string constant pool and return the address.
   
	e.g., 
		String s1 = "Java.";
		String s2 = "Java.";
		System.out.println(s1 == s2); // true.
   
 */
public class Question_79 {
	public static void main(String[] args) {
		
	}
}
