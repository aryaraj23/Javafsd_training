package.ust.esamples;
import java.util.Scanner;  

public class ArrayInputExample1   
{  

public static void main(String[] args)   
{  

int n;  

Scanner sc=new Scanner(System.in);  

System.out.print("Enter the number : ");  


n=sc.nextInt();  


int[] array = new int[10];  

System.out.println("Enter the elements of the array: ");  

for(int i=0; i<n; i++)  
{  
  

array[i]=sc.nextInt();  

}  


for (int i=0; i<n; i++)   
{  

System.out.println(array[i]);  

}  

}  

}