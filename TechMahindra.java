package JavaProgram;
import java.util.Scanner;
class TechMahindra{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
    //    System.out.println("Enter number");
       int temp=0;
       int n = scan.nextInt();
      
       int[] arr = new int[n];
      
       for(int i=0;i<n;i++){
           arr[i]= scan.nextInt();
       }
    
       for(int i=0;i<arr.length;i++){
         //  temp = (arr[i]/12)+temp;
         System.out.println("x value is "+arr[i]);
       }
       System.out.println("x value is "+temp);
       scan.close();
    }

    
  
}