com.ust.examples;


public class ReverseString {
    public static void main(String[] args)
    {
   	char ch[]=str.toCharArray();  
    
	String rev="";  
    
	for(int i=ch.length-1;i>=0;i--){  
        
		rev+=ch[i];  
    
	}  
    
	return rev; 
    }
}