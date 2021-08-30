com.ust.example;


public class Examples {
    
public static void main( String args[] ) {
        
String str = "Hello World"; 
	
String str1="Hi";
        
System.out.println(str.contains("World")); 
        
System.out.println(str.contains("world")); 
 	
System.out.println(str.length());
	
String new=str.replace('e','o');
	
System.out.println(new);  
	
String concatt=str.concat(str1);
	
System.out.println(str.equals(str1));                           
    }
}