import java.util.*;
public class TwoSum { 
    public static void main(String[] args){
 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        
        int size = sc.nextInt();
       System.out.println("Enter the elements of the array: ");
        int[] a= new int[size];
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target = sc.nextInt();
      for(int i=0;i<size;i++){
          for(int j=i+1;j<size;j++){
              if(a[i]+a[j]==target){
                  System.out.println("[" + i + ", " + j + "]");
              }
          }
      }
    }

    
}
